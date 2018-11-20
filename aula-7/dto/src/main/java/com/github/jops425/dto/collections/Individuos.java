package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Individuo;

public class Individuos {

    private ArrayList<Individuo> individuos;

    /**
     * Getter para individuos.
     *
     * @return Variável individuos.
     */
    public final ArrayList<Individuo> getIndividuos() {
        return individuos;
    }

    /**
     * Setter para individuos.
     *
     * @param individuos1 Variável individuos a ser editada.
     */
    public final void setIndividuos(final ArrayList<Individuo> individuos1) {
        this.individuos = individuos1;
    }

}
