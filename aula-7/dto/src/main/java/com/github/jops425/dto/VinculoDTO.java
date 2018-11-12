package com.github.jops425.dto;

import java.time.LocalDate;

public class VinculoDTO {

    private IndividuoDTO id;

    private String relacionamento;

    private LocalDate dataInicio;

    private LocalDate dataFim;

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
     * Getter para relacionamento.
     *
     * @return Variavel relacionamento.
     */
    public String getRelacionamento() {
        return relacionamento;
    }

    /**
     * Setter para relacionamento.
     *
     * @param relacionamento Variável relacionamento a ser editada.
     */
    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    /**
     * Getter para dataInicio.
     *
     * @return Variavel dataInicio.
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * Setter para dataInicio.
     *
     * @param dataInicio Variável dataInicio a ser editada.
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Getter para dataFim.
     *
     * @return Variavel dataFim.
     */
    public LocalDate getDataFim() {
        return dataFim;
    }

    /**
     * Setter para dataFim.
     *
     * @param dataFim Variável dataFim a ser editada.
     */
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
