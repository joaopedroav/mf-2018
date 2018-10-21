package com.github.jops425.cnes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Classe Arquivo do projeto cnes.
 *
 * @author João Pedro
 */
public final class Arquivo {

    /**
     * Construtor.
     */
    private Arquivo() {
    }

    /**
     * Tamanho do vetor buffer.
     */
    private static final int BUFFER_SIZE = 4096;

    /**
     * Baixa arquivo.
     *
     * @param link    A url contendo o arquivo.
     * @param caminho Caminho do arquivo a ser baixado.
     */
    public static void baixarZip(final String link, final String caminho) {
        System.out.println("Baixando arquivo");
        try {
            URL url = new URL(link);
            URLConnection conexao = url.openConnection();
            InputStream inputStream = conexao.getInputStream();
            FileOutputStream outputStream = new FileOutputStream(caminho);

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();
            System.out.println("Arquivo .zip baixado");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Método para descompactar zip.
     *
     * @param dir  Caminho corrente do zip.
     * @param dest Diretório de destino da descompactação.
     * @throws IOException Exceção.
     */
    public static void descompactar(final String dir, final String dest)
    throws IOException {
        System.out.println("Descompactando arquivo");
        File destDir = new File(dest);
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        ZipInputStream zIS = new ZipInputStream(new FileInputStream(dir));
        ZipEntry zipEntry = zIS.getNextEntry();

        while (zipEntry != null) {
            String filePath = dest + File.separator + zipEntry.getName();
            if (!zipEntry.isDirectory()) {
                extrair(zIS, filePath);
            }
            zIS.closeEntry();
            zipEntry = zIS.getNextEntry();
        }
        zIS.close();
        System.out.println("Arquivo descompactado");
    }

    /**
     * Método auxiliar para descompactar zip.
     *
     * @param zIS    Objeto tipo ZipInputStream.
     * @param dirZip Diretório corrente do zip.
     * @throws IOException Exceção.
     */
    private static void extrair(final ZipInputStream zIS, final String dirZip)
    throws IOException {
        BufferedOutputStream bOS =
        new BufferedOutputStream(new FileOutputStream(dirZip));
        byte[] bytesIn = new byte[BUFFER_SIZE];
        int read = 0;
        while ((read = zIS.read(bytesIn)) != -1) {
            bOS.write(bytesIn, 0, read);
        }
        bOS.close();
    }

    /**
     * Converte coleção para json e salva em novo arquivo.
     *
     * @param estabelecimento Coleção.
     */
    public static void salvarArquivo(
        final ArrayList<Estabelecimento> estabelecimento) {
        try (Writer writer =
        new FileWriter("web-app/src/assets/estabelecimentos.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(estabelecimento, writer);
            System.out.println("Arquivo .json gerado");
        } catch (Exception e) { }
    }

}
