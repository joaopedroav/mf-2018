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
import com.github.jops425.dto.collections.Enderecos;
import com.github.jops425.dto.models.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EnderecoDTO {

	public Enderecos fromJson(final String arquivo) {
	    Gson gson = new Gson();
	    Enderecos ends = gson.fromJson(arquivo, Enderecos.class);
        return ends;
	}

	public void toJson(final Enderecos ends, String caminho) {
	    try (Writer writer = new FileWriter(caminho)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(ends, writer);
        } catch (Exception e) { }
	}

	public Enderecos fromXML(final String arquivo)
            throws FileNotFoundException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Enderecos.class);
        Unmarshaller un = context.createUnmarshaller();
        Enderecos ends = (Enderecos) un.unmarshal(new FileReader(arquivo));
        return ends;
    }

	public void toXML(final Endereco e1) throws JAXBException {
	    ArrayList<Endereco> endereco = new ArrayList<Endereco>();
        endereco.add(e1);
        Enderecos enderecos = new Enderecos();
        enderecos.setEnderecos(endereco);
        JAXBContext context = JAXBContext.newInstance(Comunicacoes.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(enderecos, System.out);
	}

}
