package com.github.jops425.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.github.jops425.dto.collections.Comunicacoes;
import com.github.jops425.dto.collections.Identificadores;
import com.github.jops425.dto.models.Identificador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class IdentificadorDTO {

    public Identificadores fromJson(final String arquivo) {
        Gson gson = new Gson();
        Identificadores coms = gson.fromJson(arquivo, Identificadores.class);
        return coms;
    }

    public void toJson(
            final Identificadores idens, String caminho) {
        try (Writer writer = new FileWriter(caminho)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(idens, writer);
        } catch (Exception e) { }
    }

    public Identificadores fromXML(final String arquivo)
            throws FileNotFoundException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Identificadores.class);
        Unmarshaller un = context.createUnmarshaller();
        Identificadores inds = (Identificadores) un.unmarshal(new FileReader(arquivo));
        return inds;
    }

    public void toXML(final Identificador id1) throws JAXBException {
        ArrayList<Identificador> idn = new ArrayList<Identificador>();
        idn.add(id1);
        Identificadores idns = new Identificadores();
        idns.setIdentificadores(idn);
        JAXBContext context = JAXBContext.newInstance(Comunicacoes.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(idns, System.out);
    }

}
