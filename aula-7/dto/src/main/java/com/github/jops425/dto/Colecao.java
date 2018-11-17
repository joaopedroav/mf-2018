package com.github.jops425.dto;

import java.util.ArrayList;

public class Colecao {

    private static ArrayList<ComunicacaoDTO> comunicacoes;

    private static ArrayList<DadoDemograficoDTO> dados;

    private static ArrayList<EnderecoDTO> enderecos;

    private static ArrayList<IdentificadorDTO> identificadores;

    private static ArrayList<IndividuoDTO> individuos;

    private static ArrayList<NomeDTO> nomes;

    private static ArrayList<VinculoDTO> vinculos;

    /**
     * Getter para comunicacoes.
     *
     * @return Variavel comunicacoes.
     */
    public static ArrayList<ComunicacaoDTO> getComunicacoes() {
        return comunicacoes;
    }

    /**
     * Setter para comunicacoes.
     *
     * @param comunic Variável comunicacoes a ser editada.
     */
    public static void setComunicacoes(ArrayList<ComunicacaoDTO> comunic) {
        comunicacoes = comunic;
    }

    /**
     * Getter para dados.
     *
     * @return Variavel dados.
     */
    public static ArrayList<DadoDemograficoDTO> getDados() {
        return dados;
    }

    /**
     * Setter para dados.
     *
     * @param dado Variável dados a ser editada.
     */
    public static void setDados(ArrayList<DadoDemograficoDTO> dado) {
        dados = dado;
    }

    /**
     * Getter para enderecos.
     *
     * @return Variavel enderecos.
     */
    public static ArrayList<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    /**
     * Setter para enderecos.
     *
     * @param enderec Variável enderecos a ser editada.
     */
    public static void setEnderecos(ArrayList<EnderecoDTO> enderec) {
        enderecos = enderec;
    }

    /**
     * Getter para identificadores.
     *
     * @return Variavel identificadores.
     */
    public ArrayList<IdentificadorDTO> getIdentificadores() {
        return identificadores;
    }

    /**
     * Setter para identificadores.
     *
     * @param ident Variável identificadores a ser editada.
     */
    public static void setIdentificadores(ArrayList<IdentificadorDTO> ident) {
        identificadores = ident;
    }

    /**
     * Getter para individuos.
     *
     * @return Variavel individuos.
     */
    public static ArrayList<IndividuoDTO> getIndividuos() {
        return individuos;
    }

    /**
     * Setter para individuos.
     *
     * @param individ Variável individuos a ser editada.
     */
    public static void setIndividuos(ArrayList<IndividuoDTO> individ) {
        individuos = individ;
    }

    /**
     * Getter para nomes.
     *
     * @return Variavel nomes.
     */
    public ArrayList<NomeDTO> getNomes() {
        return nomes;
    }

    /**
     * Setter para nomes.
     *
     * @param nom Variável nomes a ser editada.
     */
    public static void setNomes(ArrayList<NomeDTO> nom) {
        nomes = nom;
    }

    /**
     * Getter para vinculos.
     *
     * @return Variavel vinculos.
     */
    public static ArrayList<VinculoDTO> getVinculos() {
        return vinculos;
    }

    /**
     * Setter para vinculos.
     *
     * @param vinc Variável vinculos a ser editada.
     */
    public static void setVinculos(ArrayList<VinculoDTO> vinc) {
        vinculos = vinc;
    }

}
