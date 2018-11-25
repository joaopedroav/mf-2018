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
     * Índice da coluna do CSV.
     */
    private static final int I4 = 4;

    /**
     * Índice da coluna do CSV.
     */
    private static final int I5 = 5;

    /**
     * Índice da coluna do CSV.
     */
    private static final int I6 = 6;


    /**
     * Preenche banco com as colunas de um arquivo CSV.
     *
     * @param arquivo Caminho do arquivo 'Loinc.csv'.
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
                    for (int i = 0; i < celulas.length; i++) {
                        System.out.println(celulas[i]);
                    }
                    loinc = new Loinc();
                    loinc.setLoincNum(celulas[0]);
                    loinc.setComponent(celulas[I1]);
                    loinc.setProperty(celulas[I2]);
                    loinc.setTimeAspct(celulas[I3]);
                    loinc.setSystem(celulas[I4]);
                    loinc.setScaleTyp(celulas[I5]);
                    System.out.println("Linha de número: " + numLinhasArq);

                    String query = "INSERT INTO loinc VALUES"
                            + "(?, ?, ?, ?, ?, ?)";

                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(I1, loinc.getLoincNum());
                    ps.setString(I2, loinc.getComponent());
                    ps.setString(I3, loinc.getProperty());
                    ps.setString(I4, loinc.getTimeAspct());
                    ps.setString(I5, loinc.getSystem());
                    ps.setString(I6, loinc.getScaleTyp());
                    ps.execute();
                }
                numLinhasArq++;
            }
            con.close();
        } catch (IOException e) { }
    }

}
