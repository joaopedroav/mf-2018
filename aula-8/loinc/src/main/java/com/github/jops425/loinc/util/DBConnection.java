package com.github.jops425.loinc.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe DBConnection para conexão com o banco de dados.
 * @author joao
 *
 */
public final class DBConnection {

    /**
     * Construtor.
     */
    private DBConnection() { }

    /**
     * Método para realizar a conexão com o banco.
     *
     * @return Objeto com a conexão.
     */
    public static Connection createConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/loinc";
        String username = "admin";
        String password = "12345";

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
