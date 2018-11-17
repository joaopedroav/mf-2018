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
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * Setter para enderecos.
     *
     * @param enderecos Variável enderecos a ser editada.
     */
    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
