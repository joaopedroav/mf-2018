package com.github.jops425.dto;

import java.util.ArrayList;

public class Colecao {

    private ArrayList<ComunicacaoDTO> comunicacoes;

    private ArrayList<DadoDemograficoDTO> dados;

    private ArrayList<EnderecoDTO> enderecos;

    private ArrayList<IdentificadorDTO> identificadores;

    private ArrayList<IndividuoDTO> individuos;

    private ArrayList<NomeDTO> nomes;

    private ArrayList<VinculoDTO> vinculos;

    /**
     * Getter para comunicacoes.
     *
     * @return Variavel comunicacoes.
     */
    public ArrayList<ComunicacaoDTO> getComunicacoes() {
        return comunicacoes;
    }

    /**
     * Setter para comunicacoes.
     *
     * @param comunicacoes Variável comunicacoes a ser editada.
     */
    public void setComunicacoes(ArrayList<ComunicacaoDTO> comunicacoes) {
        this.comunicacoes = comunicacoes;
    }

    /**
     * Getter para dados.
     *
     * @return Variavel dados.
     */
    public ArrayList<DadoDemograficoDTO> getDados() {
        return dados;
    }

    /**
     * Setter para dados.
     *
     * @param dados Variável dados a ser editada.
     */
    public void setDados(ArrayList<DadoDemograficoDTO> dados) {
        this.dados = dados;
    }

    /**
     * Getter para enderecos.
     *
     * @return Variavel enderecos.
     */
    public ArrayList<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    /**
     * Setter para enderecos.
     *
     * @param enderecos Variável enderecos a ser editada.
     */
    public void setEnderecos(ArrayList<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
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
     * @param identificadores Variável identificadores a ser editada.
     */
    public void setIdentificadores(ArrayList<IdentificadorDTO> identificadores) {
        this.identificadores = identificadores;
    }

    /**
     * Getter para individuos.
     *
     * @return Variavel individuos.
     */
    public ArrayList<IndividuoDTO> getIndividuos() {
        return individuos;
    }

    /**
     * Setter para individuos.
     *
     * @param individuos Variável individuos a ser editada.
     */
    public void setIndividuos(ArrayList<IndividuoDTO> individuos) {
        this.individuos = individuos;
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
     * @param nomes Variável nomes a ser editada.
     */
    public void setNomes(ArrayList<NomeDTO> nomes) {
        this.nomes = nomes;
    }

    /**
     * Getter para vinculos.
     *
     * @return Variavel vinculos.
     */
    public ArrayList<VinculoDTO> getVinculos() {
        return vinculos;
    }

    /**
     * Setter para vinculos.
     *
     * @param vinculos Variável vinculos a ser editada.
     */
    public void setVinculos(ArrayList<VinculoDTO> vinculos) {
        this.vinculos = vinculos;
    }

}
