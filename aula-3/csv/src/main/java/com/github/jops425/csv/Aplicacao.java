package com.github.jops425.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.net.URL;
import java.util.Comparator;
import java.util.Collections;

/**
 * Extração do número de estados e suas instituições.
 * @author João Pedro
 */
public final class Aplicacao {

    /**
     * Construtor.
     */
    private Aplicacao() {

    }

    /**
     * URL para download do CSV.
     */
    public static final String URL_CSV = "http://repositorio.dados.gov.br/"
            + "educacao/CADASTRO%20DAS%20IES_2011.csv";

    /**
     * Linha final do arquivo.
     */
    public static final String LINHA_FINAL = "Fonte: MEC/Inep; "
            + "Tabela elaborada pelo Inep/DEED";

    /**
     * Nome do arquivo após o download.
     */
    public static final String CAMINHO_ARQUIVO = "IES_2011.csv";

    /**
     * Índice da coluna de estados no CSV.
     */
    public static final int INDICE_ESTADO = 9;

    /**
     * Número de linhas equivalentes ao cabeçalho.
     */
    public static final int CABECALHO = 10;

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
            url = URL_CSV;
        }
        salvarArquivo(url, CAMINHO_ARQUIVO);
        ArrayList<String> siglasEstados = lerArquivo(CAMINHO_ARQUIVO);
        ArrayList<String> ocorrencias = extrairEstados(siglasEstados);
        int[] vetor = contarEstados(siglasEstados, ocorrencias);
        ArrayList<Estado> ordem = ordenar(ocorrencias, vetor);
        for (int i = 0; i < ocorrencias.size(); i++) {
            System.out.println(ordem.get(i));
        }
    }

    /**
     * Salva o arquivo.
     *
     * @param link URL específica.
     * @param caminho Caminho de destino para o arquivo.
     * @throws IOException Exceção.
     */
    public static void salvarArquivo(final String link, final String caminho)
            throws IOException {
        URL url = new URL(link);
        File file = new File(caminho);

        InputStream input = url.openStream();
        FileOutputStream fileOS = new FileOutputStream(file);

        int bytes = 0;

        while ((bytes = input.read()) != -1) {
            fileOS.write(bytes);
        }

        input.close();
        fileOS.close();
    }

    /**
     * Lê o arquivo e descarta o cabeçalho.
     *
     * @param caminho Localização do arquivo.
     * @return Lista contendo os estados.
     */
    public static ArrayList<String> lerArquivo(final String caminho) {
        BufferedReader conteudo = null;
        String linha = "";
        ArrayList<String> colunas = new ArrayList<String>();
        String[] estados = null;
        int numLinhasArq = 0;
        try {
            conteudo = new BufferedReader(new FileReader(caminho));
            while ((linha = conteudo.readLine()) != null) {
                if (numLinhasArq > CABECALHO) {
                    estados = linha.split(";");
                    if (estados.length > INDICE_ESTADO) {
                        colunas.add(estados[INDICE_ESTADO]);
                    }
                }
                numLinhasArq++;
            }
        } catch (IOException e) { }
        return colunas;
    }

    /**
     * Extrai a sigla de cada estado que aparece no arquivo.
     *
     * @param estados Lista contendo os estados.
     * @return Lista contendo todos os estados que aparecem.
     */
     public static ArrayList<String>
        extrairEstados(final ArrayList<String> estados) {
        ArrayList<String> ocorrenciaEstado = new ArrayList<String>();
        for (int i = 0; i < estados.size(); i++) {
            if (!ocorrenciaEstado.contains(estados.get(i))) {
                ocorrenciaEstado.add(estados.get(i));
            }
        }
        return ocorrenciaEstado;
     }

     /**
      * Conta a quantidade de vezes em que cada estado aparece no arquivo.
      *
      * @param estados Lista contendo os estados.
      * @param siglas Lista contendo todas as ocorrências.
      * @return Vetor contendo o número de ocorrências.
      */
     public static int[] contarEstados(final ArrayList<String> estados,
             final ArrayList<String> siglas) {
        int tam = siglas.size();
        int[] vetor = new int[tam];
        for (int i = 0; i < estados.size(); i++) {
            for (int j = 0; j < tam; j++) {
                if (siglas.get(j).equals(estados.get(i))) {
                    vetor[j] = vetor[j] + 1;
                }
            }
        }

        return vetor;
     }

     /**
      * Ordena o número de instituições por estado.
      *
      * @param siglas Lista com as siglas dos estados.
      * @param numInst Vetor com o número de instituições por estado.
      * @return Instituições por estado ordenadas de maneira decrescente.
      */
     public static ArrayList<Estado> ordenar(final ArrayList<String> siglas,
             final int[] numInst) {
         ArrayList<Estado> colecao = new ArrayList<Estado>();
         for (int i = 0; i < siglas.size(); i++) {
            colecao.add(new Estado(siglas.get(i), numInst[i]));
         }
         Collections.sort(colecao, new SortByInst());
         return colecao;
     }

}

/**
 * Classe estado, com sigla e número de instituições.
 *
 * @author João Pedro
 */
class Estado {

    /**
     * Número de instituições por estado.
     */
    private int numInst;

    /**
     * Sigla do estado.
     */
    private String sigla;

    /**
     * Construtor da classe.
     *
     * @param sig Sigla dos estados.
     * @param nInst Número de instituições por estado.
     */
    Estado(final String sig, final int nInst) {
        this.numInst = nInst;
        this.sigla = sig;
    }

    /**
     * Getter para número de instituições.
     *
     * @return Número de instituições.
     */
    public int getNumInst() {
        return numInst;
    }

    /**
     * Getter para sigla.
     *
     * @return String com sigla.
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Retornar a coleção através de String.
     *
     * @return String da coleção.
     */
    public String toString() {
        String estado = this.sigla + " " + this.numInst;
        return estado;
    }
}

/**
 * Implementa um comparador para a coleção.
 *
 * @author João Pedro
 */
class SortByInst implements Comparator<Estado> {

    /**
     * Comparar o número de instituições por estado, na coleção.
     *
     * @param est1 Instância 1 da classe Estado.
     * @param est2 Instância 2 da classe Estado.
     * @return Comparação entre as instâncias.
     */
    public int compare(final Estado est1, final Estado est2) {
        return est2.getNumInst() - est1.getNumInst();
    }
}