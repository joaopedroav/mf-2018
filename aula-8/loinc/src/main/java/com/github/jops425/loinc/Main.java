package com.github.jops425.loinc;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Arquivo.preencheBanco("MapTo.csv");
    }

}
