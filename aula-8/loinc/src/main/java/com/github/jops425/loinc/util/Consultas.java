package com.github.jops425.loinc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;

import com.github.jops425.loinc.Loinc;

/**
 * Classe para realizar consultas ao banco.
 * @author joao
 *
 */
public final class Consultas {

    /**
     * Impede a criação de instâncias.
     */
    private Consultas() { }

    /**
     * Retorna todos os elementos do banco.
     * @return ArrayList da classe Loinc.
     */
    public static ArrayList<Loinc> getAll() {
        ArrayList<Loinc> loincs = new ArrayList<Loinc>();
        Connection con = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
            con = DBConnection.createConnection();
            sta = con.createStatement();
            rs = sta.executeQuery("SELECT loinc_num,component,property,"
                            + "time_aspct,system,scale_typ FROM loinc");

            while (rs.next()) {
                Loinc loinc = new Loinc();
                String loincNum = rs.getString("loinc_num");
                String component = rs.getString("component");
                String property = rs.getString("property");
                String timeAsptc = rs.getString("time_aspct");
                String system = rs.getString("system");
                String scaleTyp = rs.getString("scale_typ");
                loinc.setLoincNum(loincNum);
                loinc.setComponent(component);
                loinc.setProperty(property);
                loinc.setTimeAspct(timeAsptc);
                loinc.setSystem(system);
                loinc.setScaleTyp(scaleTyp);
                loincs.add(loinc);
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return loincs;
    }

    /**
     * Consulta por loinc_num.
     * @param loincNum String correspondente à coluna.
     * @return Objeto Loinc atualizado.
     */
    public static Loinc getByLoincNum(final String loincNum) {
        Loinc loinc = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = DBConnection.createConnection();
            PreparedStatement ps = con.prepareStatement("SELECT loinc_num,"
                    + "component,property,"
                    + "time_aspct,system,scale_typ FROM loinc"
                    + " WHERE loinc_num=?");
            ps.setString(1, loincNum);
            rs = ps.executeQuery();
            if (rs.next()) {
                loinc = new Loinc();
                String component = rs.getString("component");
                String property = rs.getString("property");
                String timeAsptc = rs.getString("time_aspct");
                String system = rs.getString("system");
                String scaleTyp = rs.getString("scale_typ");
                loinc.setLoincNum(loincNum);
                loinc.setComponent(component);
                loinc.setProperty(property);
                loinc.setTimeAspct(timeAsptc);
                loinc.setSystem(system);
                loinc.setScaleTyp(scaleTyp);
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return loinc;
    }

    /**
     * Consulta por coluna component.
     * @param component String correspondente ao conteúdo.
     * @return Objeto Loinc atualizado.
     */
    public static Loinc getByComponent(final String component) {
        Loinc loinc = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = DBConnection.createConnection();
            PreparedStatement ps = con.prepareStatement("SELECT loinc_num,"
                    + "component,property,"
                    + "time_aspct,system,scale_typ FROM loinc"
                    + " WHERE component=?");
            ps.setString(1, component);
            rs = ps.executeQuery();
            if (rs.next()) {
                loinc = new Loinc();
                String loincNum = rs.getString("loinc_num");
                String property = rs.getString("property");
                String timeAsptc = rs.getString("time_aspct");
                String system = rs.getString("system");
                String scaleTyp = rs.getString("scale_typ");
                loinc.setLoincNum(loincNum);
                loinc.setComponent(component);
                loinc.setProperty(property);
                loinc.setTimeAspct(timeAsptc);
                loinc.setSystem(system);
                loinc.setScaleTyp(scaleTyp);
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return loinc;
    }

}
