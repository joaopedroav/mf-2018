package com.github.jops425.cnes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

/**
 * Classe para extrair colunas do arquivo lido.
 */
public class Colunas {

    /**
     * Construtor.
     */
    private Colunas() {

    }

    /**
     * Índice do vetor, razão social.
     */
    private static int IND2 = 5;

    /**
     * Índice do vetor, latitude.
     */
    private static int IND3 = 39;

    /**
     * Índice do vetor, longitude.
     */
    private static int IND4 = 40;

    /**
     * Método para extrair as colunas necessárias.
     *
     * @param caminho Diretório corrente do arquivo.
     */
    public static ArrayList<Estabelecimento> extrairColunas(final String caminho) {
        ArrayList<Estabelecimento> estabelecimento = new ArrayList<Estabelecimento>();
        BufferedReader conteudo = null;
        String linha = "";
        String[] celulas = null;
        int numLinhasArq = 0;
        try {
            conteudo = new BufferedReader(new FileReader(caminho));
            while ((linha = conteudo.readLine()) != null) {
                if (numLinhasArq > 0) {
                    celulas = linha.split(";");
                    estabelecimento.add(new Estabelecimento(celulas[1], celulas[IND2], celulas[IND3], celulas[IND4]));
                }
                numLinhasArq++;
            }
        } catch (IOException e) {
        }
        return estabelecimento;
    }
}