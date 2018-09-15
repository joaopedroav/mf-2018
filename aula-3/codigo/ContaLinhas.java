import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;

public class ContaLinhas {

    public static void main(String[] args) {
        ArrayList<String> linhas = lerArquivo("../csv/IES_2011.csv");
        System.out.println("O arquivo tem " + contaLinhas(linhas) + " linhas.");
    }

    public static int contaLinhas(ArrayList<String> linhas) {
        return linhas.size();
    }

    public static ArrayList<String> lerArquivo(String caminho) {
        BufferedReader conteudo = null;
        ArrayList<String> colunas = new ArrayList<String>();
        String linha = "";
        try {
            conteudo = new BufferedReader(new FileReader(caminho));
            while((linha = conteudo.readLine()) != null) {
                colunas.add(linha);
            }
        } catch (IOException e) {}
        return colunas;
    }
}
