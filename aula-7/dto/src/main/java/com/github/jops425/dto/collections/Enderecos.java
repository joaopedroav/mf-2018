package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Endereco;

public class Enderecos {

    private ArrayList<Endereco> enderecos;

    /**
     * Getter para enderecos.
     *
     * @return Variável enderecos.
     */
    public final ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * Setter para enderecos.
     *
     * @param enderecos1 Variável enderecos a ser editada.
     */
    public final void setEnderecos(final ArrayList<Endereco> enderecos1) {
        this.enderecos = enderecos1;
    }

}
