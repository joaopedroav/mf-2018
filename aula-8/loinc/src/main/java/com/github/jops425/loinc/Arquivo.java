package com.github.jops425.loinc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.github.jops425.loinc.util.DBConnection;

/**
 * Classe para realizar consultas.
 *
 * @author joao
 *
 */
public final class Arquivo {

    /**
     * Construtor.
     */
    private Arquivo() { }

    /**
     * Índice da coluna do CSV.
     */
    private static final int I1 = 1;

    /**
     * Índice da coluna do CSV.
     */
    private static final int I2 = 2;

    /**
     * Índice da coluna do CSV.
     */
    private static final int I3 = 3;

    /**
     * Preenche banco com as colunas de um arquivo CSV.
     *
     * @param arquivo Caminho do arquivo 'MapTo.csv'.
     * @throws SQLException Exceção.
     */
    public static void preencheBanco(final String arquivo)
            throws SQLException {
        Loinc loinc = null;
        BufferedReader conteudo = null;
        String linha = "";
        String[] celulas = null;
        int numLinhasArq = 0;

        try {
            Connection con = null;

            conteudo = new BufferedReader(new FileReader(arquivo));

            con = DBConnection.createConnection();
            while ((linha = conteudo.readLine()) != null) {
                if (numLinhasArq > 0) {
                    celulas = linha.split(",");
                    loinc = new Loinc();
                    loinc.setLoincNum(celulas[0]);
                    loinc.setMapTo(celulas[I1]);
                    if (celulas.length > I2) {
                        loinc.setComment(celulas[I2]);
                        String query = "INSERT INTO loinc (loinc,map_to,comment)"
                                + "VALUES (?, ?, ?)";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(I1, loinc.getLoincNum());
                        ps.setString(I2, loinc.getMapTo());
                        ps.setString(I3, loinc.getComment());
                        ps.execute();
                    } else {
                        String query = "INSERT INTO loinc (loinc,map_to) VALUES"
                                + "(?, ?)";

                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(I1, loinc.getLoincNum());
                        ps.setString(I2, loinc.getMapTo());
                        ps.execute();
                    }

                }
                numLinhasArq++;
            }
            con.close();
        } catch (IOException e) { }
    }

}
