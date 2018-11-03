package com.github.jops425.dto.util;

/**
 * Classe estado.
 * @author joao
 *
 */
public class Estado {

    /**
     * Código.
     */
    private String codigo;

    /**
     * Descrição.
     */
    private String descricao;

    /**
     * Getter para código.
     * @return O código.
     */
    public final String getCodigo() {
        return codigo;
    }

    /**
     * Setter para código.
     * @param cod O código.
     */
    public final void setCodigo(final String cod) {
        this.codigo = cod;
    }

    /**
     * Getter para descrição.
     * @return Descrição.
     */
    public final String getDescricao() {
        return descricao;
    }

    /**
     * Setter para descrição.
     * @param des A descrição.
     */
    public final void setDescricao(final String des) {
        this.descricao = des;
    }

}
