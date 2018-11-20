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
import com.github.jops425.dto.models.Comunicacao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Classe ComunicacaoDTO.
 * @author joaopedro
 *
 */
public class ComunicacaoDTO {

    /**
     * Método from.
     *
     * @param arquivo Caminho do arquivo.
     * @return Lista de comunicações.
     */
    public final Comunicacoes fromJson(final String arquivo) {
        Gson gson = new Gson();
        Comunicacoes coms = gson.fromJson(arquivo, Comunicacoes.class);
        return coms;
    }

    /**
     * Método toJson.
     *
     * @param coms Lista de comunicações.
     * @param caminho Caminho do arquivo.
     */
    public final void toJson(
            final Comunicacoes coms, final String caminho) {
        try (Writer writer = new FileWriter(caminho)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(coms, writer);
        } catch (Exception e) { }
    }

    /**
     * Método from XML.
     * @param arquivo Caminho do arquivo.
     * @return Lista de comunicações.
     * @throws FileNotFoundException Exceção.
     * @throws JAXBException Exceção.
     */
    public final Comunicacoes fromXML(final String arquivo)
            throws FileNotFoundException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Comunicacoes.class);
        Unmarshaller un = context.createUnmarshaller();
        Comunicacoes comunicacoes = (Comunicacoes)
                un.unmarshal(new FileReader(arquivo));
        return comunicacoes;
    }

    /**
     * Método toXML.
     *
     * @param c1 Objeto Comunicacao.
     * @throws JAXBException Exceção.
     */
    public final void toXML(final Comunicacao c1) throws JAXBException {
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
