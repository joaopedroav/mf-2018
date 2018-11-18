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

import com.github.jops425.dto.collections.Nomes;
import com.github.jops425.dto.models.Nome;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NomeDTO {

    public Nomes fromJson(final String arquivo) {
        Gson gson = new Gson();
        Nomes nomes = gson.fromJson(arquivo, Nomes.class);
        return nomes;
    }

    public void toJson(
            final Nomes nomes, String caminho) {
        try (Writer writer = new FileWriter(caminho)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(nomes, writer);
        } catch (Exception e) { }
    }

    public Nomes fromXML(final String arquivo)
            throws FileNotFoundException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Nomes.class);
        Unmarshaller un = context.createUnmarshaller();
        Nomes nomes = (Nomes) un.unmarshal(new FileReader(arquivo));
        return nomes;
    }

    public void toXML(final Nome n1) throws JAXBException {
        ArrayList<Nome> nome = new ArrayList<Nome>();
        nome.add(n1);
        Nomes nomes = new Nomes();
        nomes.setNomes(nome);
        JAXBContext context = JAXBContext.newInstance(Nomes.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(nomes, System.out);
    }

}
