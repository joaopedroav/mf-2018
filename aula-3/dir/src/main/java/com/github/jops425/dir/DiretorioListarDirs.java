package com.github.jops425.dir;

import java.io.File;
import java.io.IOException;

/**
 * Listar diretórios.
 *
 * @author João Pedro
 */
public final class DiretorioListarDirs {

    /**
     * Construção.
     */
    private DiretorioListarDirs() {

    }

    /**
     * Método main.
     *
     * @param args Parâmetros passados por linha de comando.
     */
    public static void main(final String[] args) {
        File dirs = new File(System.getProperty("user.dir"));
        mostrarDiretorios(dirs);
    }

    /**
     * Mostrar caminho dos diretórios.
     *
     * @param dir Diretório atual.
     */
    public static void mostrarDiretorios(final File dir) {
        try {
            File[] diretorios = dir.listFiles();
            for (File diretorio : diretorios) {
                if (diretorio.isDirectory()) {
                    System.out.println(diretorio.getCanonicalPath());
                    mostrarDiretorios(diretorio);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
