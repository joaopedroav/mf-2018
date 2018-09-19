package com.github.jops425.dir;

import java.io.File;
import java.io.IOException;

/**
 * Listar caminho completo dos arquivos.
 *
 * @author João Pedro
 */
public final class DiretorioListarArquivos {

    /**
     * Construção.
     */
    private DiretorioListarArquivos() {

    }

    /**
     * Método main.
     *
     * @param args Parâmetros passados por linha de comando.
     */
    public static void main(final String[] args) {
        File files = new File(System.getProperty("user.dir"));
        mostrarArquivos(files);
    }

    /**
     * Mostrar caminho dos arquivos.
     *
     * @param file Diretório atual.
     */
    public static void mostrarArquivos(final File file) {
        try {
            File[] listaArquivos = file.listFiles();
            for (File arquivo : listaArquivos) {
                if (!arquivo.isDirectory()) {
                    System.out.println(arquivo.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
