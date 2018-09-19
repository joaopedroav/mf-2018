package com.github.jops425.codigo;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

/**
 * Classe que conta o número de linhas de determinados arquivos.
 *
 * @author João Pedro
 */
public final class ContaLinhas {

    /**
     * Construtor.
     */
    private ContaLinhas() {

    }


    /**
     * Método main.
     *
     * @param args Argumentos a serem passados por linha de comando.
     */
    public static void main(final String[] args) {
        int linhasTotais = 0;
        File files = new File(System.getProperty("user.dir"));
        ArrayList<String> lista = listarArquivos(files);
        for (int i = 0; i < lista.size(); i++) {
            int aux = contaLinhas(lista.get(i));
            System.out.println(aux + " " + lista.get(i));
            linhasTotais = linhasTotais + aux;
        }
        System.out.println("Total de linhas = " + linhasTotais);
    }

    /**
     * Contar número de linhas de determinado arquivo.
     *
     * @param caminho Caminho do arquivo.
     * @return A quantidade de linhas do arquivo.
     */
    public static int contaLinhas(final String caminho) {
        BufferedReader conteudo = null;
        ArrayList<String> linhas = new ArrayList<String>();
        String linha = "";
        try {
            conteudo = new BufferedReader(new FileReader(caminho));
            while ((linha = conteudo.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {

        }
        return linhas.size();
    }

    /**
     * Listar arquivos existentes.
     *
     * @param file Caminho do arquivo a ser percorrido recursivamente.
     * @return Lista de arquivos.
     */
    public static ArrayList<String> listarArquivos(final File file) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            File[] listaArquivos = file.listFiles();
            for (File arquivo : listaArquivos) {
                if (!arquivo.isDirectory()) {
                    lista.add(arquivo.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
