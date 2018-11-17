package com.github.jops425.dto.models;

import java.time.LocalDate;

public class Nome {

    private Individuo id;

	private String titulos;

	private String nomes;

	private String sobrenomes;

	private String sufixos;

	private int preferido;

	private int usoCondicional;

	private String uso;

	private LocalDate dataInicial;

	private LocalDate dataFinal;

	private String utilizacao;

	private String alternativa;

	/**
     * Getter para id.
     *
     * @return Variavel id.
     */
    public IndividuoDTO getId() {
        return id;
    }

    /**
     * Setter para id.
     *
     * @param id Variável id a ser editada.
     */
    public void setId(IndividuoDTO id) {
        this.id = id;
    }

    /**
     * Getter para titulos.
     *
     * @return Variavel titulos.
     */
    public String getTitulos() {
        return titulos;
    }

    /**
     * Setter para titulos.
     *
     * @param titulos Variável titulos a ser editada.
     */
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    /**
     * Getter para nomes.
     *
     * @return Variavel nomes.
     */
    public String getNomes() {
        return nomes;
    }

    /**
     * Setter para nomes.
     *
     * @param nomes Variável nomes a ser editada.
     */
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    /**
     * Getter para sobrenomes.
     *
     * @return Variavel sobrenomes.
     */
    public String getSobrenomes() {
        return sobrenomes;
    }

    /**
     * Setter para sobrenomes.
     *
     * @param sobrenomes Variável sobrenomes a ser editada.
     */
    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    /**
     * Getter para sufixos.
     *
     * @return Variavel sufixos.
     */
    public String getSufixos() {
        return sufixos;
    }

    /**
     * Setter para sufixos.
     *
     * @param sufixos Variável sufixos a ser editada.
     */
    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    /**
     * Getter para preferido.
     *
     * @return Variavel preferido.
     */
    public int getPreferido() {
        return preferido;
    }

    /**
     * Setter para preferido.
     *
     * @param preferido Variável preferido a ser editada.
     */
    public void setPreferido(int preferido) {
        this.preferido = preferido;
    }

    /**
     * Getter para usoCondicional.
     *
     * @return Variavel usoCondicional.
     */
    public int getUsoCondicional() {
        return usoCondicional;
    }

    /**
     * Setter para usoCondicional.
     *
     * @param usoCondicional Variável usoCondicional a ser editada.
     */
    public void setUsoCondicional(int usoCondicional) {
        this.usoCondicional = usoCondicional;
    }

    /**
     * Getter para uso.
     *
     * @return Variavel uso.
     */
    public String getUso() {
        return uso;
    }

    /**
     * Setter para uso.
     *
     * @param uso Variável uso a ser editada.
     */
    public void setUso(String uso) {
        this.uso = uso;
    }

    /**
     * Getter para dataInicial.
     *
     * @return Variavel dataInicial.
     */
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
     * Setter para dataInicial.
     *
     * @param dataInicial Variável dataInicial a ser editada.
     */
    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * Getter para dataFinal.
     *
     * @return Variavel dataFinal.
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * Setter para dataFinal.
     *
     * @param dataFinal Variável dataFinal a ser editada.
     */
    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    /**
     * Getter para utilizacao.
     *
     * @return Variavel utilizacao.
     */
    public String getUtilizacao() {
        return utilizacao;
    }

    /**
     * Setter para utilizacao.
     *
     * @param utilizacao Variável utilizacao a ser editada.
     */
    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    /**
     * Getter para alternativa.
     *
     * @return Variavel alternativa.
     */
    public String getAlternativa() {
        return alternativa;
    }

    /**
     * Setter para alternativa.
     *
     * @param alternativa Variável alternativa a ser editada.
     */
    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

}
