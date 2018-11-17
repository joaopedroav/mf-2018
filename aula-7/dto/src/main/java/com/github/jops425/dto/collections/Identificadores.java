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
    public ArrayList<Identificador> getIdentificadores() {
        return identificadores;
    }

    /**
     * Setter para identificadores.
     *
     * @param identificadores Variável identificadores a ser editada.
     */
    public void setIdentificadores(ArrayList<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

}
