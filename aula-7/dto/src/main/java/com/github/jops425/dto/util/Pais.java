package com.github.jops425.dto.util;

/**
 * Classe país.
 *
 * @author joao
 *
 */
public class Pais {

    /**
     * Código do país.
     */
    private int codigo;

    /**
     * Nome do país.
     */
    private String nome;

    /**
     * Getter para código.
     * @return codigo.
     */
    public final int getCodigo() {
        return codigo;
    }

    /**
     * Setter para código.
     * @param cod O código do país.
     */
    public final void setCodigo(final int cod) {
        this.codigo = cod;
    }

    /**
     * Getter para nome.
     * @return O nome do país.
     */
    public final String getNome() {
        return nome;
    }

    /**
     * Setter para nome.
     * @param nom O nome do país.
     */
    public final void setNome(final String nom) {
        this.nome = nom;
    }

}
