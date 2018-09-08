package br.ufg.inf.mf.pratica;

import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class Nome {
	public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String diaDaSemana = localDate.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
        System.out.println(diaDaSemana);
	}
}


