package com.github.jops425.cnes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

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
     * @param link A url contendo o arquivo.
     * @param caminho Caminho do arquivo a ser baixado.
     */
    public static void baixarArquivo(final String link, final String caminho) {
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
            System.out.println("Foi feito o download do arquivo .ZIP.");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
