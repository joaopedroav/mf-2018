package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Vinculo;

public class Vinculos {

    private ArrayList<Vinculo> vincs;

    /**
     * Getter para vincs.
     *
     * @return Variável vincs.
     */
    public final ArrayList<Vinculo> getVincs() {
        return vincs;
    }

    /**
     * Setter para vincs.
     *
     * @param vincs1 Variável vincs a ser editada.
     */
    public final void setVincs(final ArrayList<Vinculo> vincs1) {
        this.vincs = vincs1;
    }

}
