package com.github.jops425.dir;

import java.io.File;
import java.io.IOException;

public class DiretorioListarArquivos {

	public static void main(String[] args) {
		File files = new File(System.getProperty("user.dir"));
		mostrarArquivos(files);
	}

	public static void mostrarArquivos(File file) {
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
