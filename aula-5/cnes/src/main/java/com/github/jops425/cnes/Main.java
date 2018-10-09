package com.github.jops425.cnes;

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
     */
    public static void main(final String[] args) {
        String url =
        "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201808.ZIP";
        String caminho = "cnes.zip";
        Arquivo.baixarArquivo(url, caminho);
    }

}
