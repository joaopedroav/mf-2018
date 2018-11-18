package com.github.jops425.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.github.jops425.dto.collections.Comunicacoes;
import com.github.jops425.dto.models.Comunicacao;

public class ComunicacaoDTO {

	public void fromJson() {
		// TODO Auto-generated method stub
		
	}

	public void toJson() {
		// TODO Auto-generated method stub
		
	}

	public Comunicacoes fromXML(String arquivo)
	        throws FileNotFoundException, JAXBException {
	    JAXBContext context = JAXBContext.newInstance(Comunicacoes.class);
	    Unmarshaller un = context.createUnmarshaller();
	    Comunicacoes comunicacoes =
	            (Comunicacoes)un.unmarshal(new FileReader(arquivo));
	    return comunicacoes;
	}

	public void toXML(Comunicacao c1) throws JAXBException {
	    ArrayList<Comunicacao> comunicacao = new ArrayList<Comunicacao>();
	    comunicacao.add(c1);
	    Comunicacoes comunicacoes = new Comunicacoes();
	    comunicacoes.setComunicacoes(comunicacao);
        JAXBContext context = JAXBContext.newInstance(Comunicacoes.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    m.marshal(comunicacoes, System.out);
	}

}
