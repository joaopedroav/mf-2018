package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Individuo;

public class Individuos {

    private ArrayList<Individuo> individuos = new ArrayList<Individuo>();

    /**
     * Getter para individuos.
     *
     * @return Variável individuos.
     */
    public ArrayList<Individuo> getIndividuos() {
        return individuos;
    }

    /**
     * Setter para individuos.
     *
     * @param individuos Variável individuos a ser editada.
     */
    public void setIndividuos(ArrayList<Individuo> individuos) {
        this.individuos = individuos;
    }

}
