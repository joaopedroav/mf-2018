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
    public final ArrayList<Nome> getNomes() {
        return nomes;
    }

    /**
     * Setter para nomes.
     *
     * @param nomes1 Variável nomes a ser editada.
     */
    public final void setNomes(final ArrayList<Nome> nomes1) {
        this.nomes = nomes1;
    }

}
