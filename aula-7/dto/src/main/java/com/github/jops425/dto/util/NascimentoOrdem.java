package com.github.jops425.dto.util;

/**
 * Classe Nascimento Ordem.
 * @author joao
 *
 */
public class NascimentoOrdem {

    /**
     * Código NO.
     */
    private int codigo;

    /**
     * Descrição NO.
     */
    private String descricao;

    /**
     * Getter para código.
     * @return O código.
     */
    public final int getCodigo() {
        return codigo;
    }

    /**
     * Setter para código.
     * @param cod O código.
     */
    public final void setCodigo(final int cod) {
        this.codigo = cod;
    }

    /**
     * Getter para descrição.
     * @return Descrição NO.
     */
    public final String getDescricao() {
        return descricao;
    }

    /**
     * Setter para descrição.
     * @param desc A descrição NO.
     */
    public final void setDescricao(final String desc) {
        this.descricao = desc;
    }

}
