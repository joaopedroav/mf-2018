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
import com.github.jops425.dto.collections.Individuos;
import com.github.jops425.dto.models.Individuo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class IndividuoDTO {

    public Individuos fromJson(final String arquivo) {
        Gson gson = new Gson();
        Individuos coms = gson.fromJson(arquivo, Individuos.class);
        return coms;
    }

    public void toJson(
            final Individuos inds, String caminho) {
        try (Writer writer = new FileWriter(caminho)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(inds, writer);
        } catch (Exception e) { }
    }

    public Individuos fromXML(final String arquivo)
            throws FileNotFoundException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Individuos.class);
        Unmarshaller un = context.createUnmarshaller();
        Individuos inds = (Individuos) un.unmarshal(new FileReader(arquivo));
        return inds;
    }

    public void toXML(final Individuo i1) throws JAXBException {
        ArrayList<Individuo> individuo = new ArrayList<Individuo>();
        individuo.add(i1);
        Individuos individuos = new Individuos();
        individuos.setIndividuos(individuo);
        JAXBContext context = JAXBContext.newInstance(Comunicacoes.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(individuos, System.out);
    }

}
