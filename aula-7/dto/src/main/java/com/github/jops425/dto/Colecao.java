package com.github.jops425.dto;

import java.util.ArrayList;
import com.github.jops425.dto.models.Comunicacao;
import com.github.jops425.dto.models.DadoDemografico;
import com.github.jops425.dto.models.Endereco;
import com.github.jops425.dto.models.Identificador;
import com.github.jops425.dto.models.Individuo;
import com.github.jops425.dto.models.Nome;
import com.github.jops425.dto.models.Vinculo;

public class Colecao {

    private static ArrayList<Comunicacao> comunicacoes;

    private static ArrayList<DadoDemografico> dados;

    private static ArrayList<Endereco> enderecos;

    private static ArrayList<Identificador> identificadores;

    private static ArrayList<Individuo> individuos;

    private static ArrayList<Nome> nomes;

    private static ArrayList<Vinculo> vinculos;

    /**
     * Getter para comunicacoes.
     *
     * @return Variavel comunicacoes.
     */
    public static ArrayList<Comunicacao> getComunicacoes() {
        return comunicacoes;
    }

    /**
     * Setter para comunicacoes.
     *
     * @param comunic Variável comunicacoes a ser editada.
     */
    public static void setComunicacoes(ArrayList<Comunicacao> comunic) {
        comunicacoes = comunic;
    }

    /**
     * Getter para dados.
     *
     * @return Variavel dados.
     */
    public static ArrayList<DadoDemografico> getDados() {
        return dados;
    }

    /**
     * Setter para dados.
     *
     * @param dado Variável dados a ser editada.
     */
    public static void setDados(ArrayList<DadoDemografico> dado) {
        dados = dado;
    }

    /**
     * Getter para enderecos.
     *
     * @return Variavel enderecos.
     */
    public static ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * Setter para enderecos.
     *
     * @param enderec Variável enderecos a ser editada.
     */
    public static void setEnderecos(ArrayList<Endereco> enderec) {
        enderecos = enderec;
    }

    /**
     * Getter para identificadores.
     *
     * @return Variavel identificadores.
     */
    public ArrayList<Identificador> getIdentificadores() {
        return identificadores;
    }

    /**
     * Setter para identificadores.
     *
     * @param ident Variável identificadores a ser editada.
     */
    public static void setIdentificadores(ArrayList<Identificador> ident) {
        identificadores = ident;
    }

    /**
     * Getter para individuos.
     *
     * @return Variavel individuos.
     */
    public static ArrayList<Individuo> getIndividuos() {
        return individuos;
    }

    /**
     * Setter para individuos.
     *
     * @param individ Variável individuos a ser editada.
     */
    public static void setIndividuos(ArrayList<Individuo> individ) {
        individuos = individ;
    }

    /**
     * Getter para nomes.
     *
     * @return Variavel nomes.
     */
    public ArrayList<Nome> getNomes() {
        return nomes;
    }

    /**
     * Setter para nomes.
     *
     * @param nom Variável nomes a ser editada.
     */
    public static void setNomes(ArrayList<Nome> nom) {
        nomes = nom;
    }

    /**
     * Getter para vinculos.
     *
     * @return Variavel vinculos.
     */
    public static ArrayList<Vinculo> getVinculos() {
        return vinculos;
    }

    /**
     * Setter para vinculos.
     *
     * @param vinc Variável vinculos a ser editada.
     */
    public static void setVinculos(ArrayList<Vinculo> vinc) {
        vinculos = vinc;
    }

}
