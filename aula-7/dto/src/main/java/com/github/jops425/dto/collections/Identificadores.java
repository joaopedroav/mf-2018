package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Identificador;

public class Identificadores {

    private ArrayList<Identificador> identificadores;

    /**
     * Getter para identificadores.
     *
     * @return Variável identificadores.
     */
    public final ArrayList<Identificador> getIdentificadores() {
        return identificadores;
    }

    /**
     * Setter para identificadores.
     *
     * @param identificadores1 Variável identificadores a ser editada.
     */
    public final void setIdentificadores(final
            ArrayList<Identificador> identificadores1) {
        this.identificadores = identificadores1;
    }

}
