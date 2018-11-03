package com.github.jops425.dto.util;

/**
 * Classe Sexo.
 * @author joao
 *
 */
public class Sexo {

    /**
     * Código do sexo.
     */
    private int codigo;

    /**
     * Descrição do sexo.
     */
    private String descricao;

    /**
     * Valor alternativo.
     */
    private String alternativo;

    /**
     * Getter para código.
     * @return O código.
     */
    public final int getCodigo() {
        return codigo;
    }

    /**
     * Setter para código.
     * @param cod Código do sexo.
     */
    public final void setCodigo(final int cod) {
        this.codigo = cod;
    }

    /**
     * Getter para descrição.
     * @return descrição.
     */
    public final String getDescricao() {
        return descricao;
    }

    /**
     * Setter para descrição.
     * @param descr Descrição do sexo.
     */
    public final void setDescricao(final String descr) {
        this.descricao = descr;
    }

    /**
     * Getter para alternativo.
     * @return O valor 'alternativo'.
     */
    public final String getAlternativo() {
        return alternativo;
    }

    /**
     * Setter para alternativo.
     * @param alt O valor 'alternativo'.
     */
    public final void setAlternativo(final String alt) {
        this.alternativo = alt;
    }

}
