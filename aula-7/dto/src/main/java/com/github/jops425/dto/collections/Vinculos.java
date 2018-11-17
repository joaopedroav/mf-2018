package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Vinculo;

public class Vinculos {

    private ArrayList<Vinculo> vincs = new ArrayList<Vinculo>();

    /**
     * Getter para vincs.
     *
     * @return Variável vincs.
     */
    public ArrayList<Vinculo> getVincs() {
        return vincs;
    }

    /**
     * Setter para vincs.
     *
     * @param vincs Variável vincs a ser editada.
     */
    public void setVincs(ArrayList<Vinculo> vincs) {
        this.vincs = vincs;
    }

}
