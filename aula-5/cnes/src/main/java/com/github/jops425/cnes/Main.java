package com.github.jops425.cnes;

import java.io.IOException;
import java.util.ArrayList;

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

    public static final String URL_ZIP =
    "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201808.ZIP";

    /**
     * Método main.
     *
     * @param args Parâmetros a serem entrados na linha de comando.
     * @throws IOException Exceção de Input/Output.
     */
    public static void main(final String[] args) throws IOException {
        String url = "";
        if (args.length > 0) {
            url = args[0];
        } else {
            url = URL_ZIP;
        }
        String caminho = "cnes.zip";
        Arquivo.baixarZip(url, caminho);
        String caminhoZip = "tbEstabelecimento201808.csv";
        String destinoZip = "baseDados";
        Arquivo.descompactar(caminho, destinoZip);
        ArrayList<Estabelecimento> estabelecimento =
        Colunas.extrairColunas(destinoZip + "/" + caminhoZip);
        Arquivo.salvarArquivo(estabelecimento);
    }

}
