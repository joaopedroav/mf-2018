package com.github.jops425.cnes;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Classe Main do projeto cnes.
 * @author João Pedro
 */
public final class Main {

    /**
     * Construtor.
     */
    private Main() {

    }

    /**
     * Método main.
     *
     * @param args Parâmetros a serem entrados na linha de comando.
     * @throws IOException Exceção de Input/Output.
     */
    public static void main(final String[] args) throws IOException {
        // String url = args[0];
        // String caminho = "cnes.zip";
        // Arquivo.baixarZip(url, caminho);
        String caminhoZip = "tbEstabelecimento201808.csv";
        // String destinoZip = "baseDados";
        // Arquivo.descompactar(caminho, destinoZip);
        ArrayList<Estabelecimento> estabelecimento = Colunas.extrairColunas("baseDados/" + caminhoZip);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(estabelecimento));
    }

}
