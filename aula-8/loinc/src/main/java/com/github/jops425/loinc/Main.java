package com.github.jops425.loinc;

import java.sql.SQLException;
import java.util.ArrayList;

import com.github.jops425.loinc.util.Consultas;

public class Main {

    public static void main(String[] args) throws SQLException {
        //Arquivo.preencheBanco("Loinc.csv");
        ArrayList<Loinc> loinc = Consultas.getAll();
//        for (int i = 0; i < loinc.size(); i++) 
//                System.out.println(loinc.get(i));
        Loinc lo = Consultas.getByLoincNum("17670-1");
    }

}
