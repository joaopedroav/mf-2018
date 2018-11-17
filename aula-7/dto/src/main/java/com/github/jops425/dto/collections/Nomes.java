package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Nome;

public class Nomes {

    private ArrayList<Nome> nomes;

    /**
     * Getter para nomes.
     *
     * @return Variável nomes.
     */
    public ArrayList<Nome> getNomes() {
        return nomes;
    }

    /**
     * Setter para nomes.
     *
     * @param nomes Variável nomes a ser editada.
     */
    public void setNomes(ArrayList<Nome> nomes) {
        this.nomes = nomes;
    }

}
