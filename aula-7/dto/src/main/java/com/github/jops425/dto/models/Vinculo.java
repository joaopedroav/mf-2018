package com.github.jops425.dto.models;

import java.time.LocalDate;

public class Vinculo {

    private Individuo id;

    private String relacionamento;

    private LocalDate dataInicio;

    private LocalDate dataFim;

	/**
     * Getter para id.
     *
     * @return Variavel id.
     */
    public final Individuo getId() {
        return id;
    }

    /**
     * Setter para id.
     *
     * @param id1 Variável id1 a ser editada.
     */
    public final void setId(final Individuo id1) {
        this.id = id1;
    }

    /**
     * Getter para relacionamento.
     *
     * @return Variavel relacionamento.
     */
    public final String getRelacionamento() {
        return relacionamento;
    }

    /**
     * Setter para relacionamento.
     *
     * @param relacionamento1 Variável relacionamento1 a ser editada.
     */
    public final void setRelacionamento(final String relacionamento1) {
        this.relacionamento = relacionamento1;
    }

    /**
     * Getter para dataInicio.
     *
     * @return Variavel dataInicio.
     */
    public final LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * Setter para dataInicio.
     *
     * @param dataInicio1 Variável dataInicio1 a ser editada.
     */
    public final void setDataInicio(final LocalDate dataInicio1) {
        this.dataInicio = dataInicio1;
    }

    /**
     * Getter para dataFim.
     *
     * @return Variavel dataFim.
     */
    public final LocalDate getDataFim() {
        return dataFim;
    }

    /**
     * Setter para dataFim.
     *
     * @param dataFim1 Variável dataFim1 a ser editada.
     */
    public final void setDataFim(final LocalDate dataFim1) {
        this.dataFim = dataFim1;
    }

}
