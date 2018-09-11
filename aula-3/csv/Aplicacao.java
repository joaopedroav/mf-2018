import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.net.URL;

public class Aplicacao {

    public static final String URL_CVS = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";
    public static final String LINHA_FINAL = "Fonte: MEC/Inep; Tabela elaborada pelo Inep/DEED";
    public static final String CAMINHO_ARQUIVO = "IES_2011.csv";

    public static final int CABECALHO = 10;

    public static void main(String[] args) throws IOException {
        salvarArquivo(URL_CVS, CAMINHO_ARQUIVO);
        ArrayList<String> coluna = lerArquivo(CAMINHO_ARQUIVO);
        System.out.println(coluna.get(1));
        //for(int i = 0; i < 10; i++) {
        //   System.out.println(coluna.get(i));
        //}
    }

    public static void salvarArquivo(String link, String caminho) throws IOException {
        URL url = new URL(link);
        File file = new File(caminho);

        InputStream input = url.openStream();
        FileOutputStream fileOS = new FileOutputStream(file);

        int bytes = 0;

        while ((bytes = input.read()) != -1) {
            fileOS.write(bytes);
        }

        input.close();
        fileOS.close();
    }

    public static ArrayList<String> lerArquivo(String caminho) {
        BufferedReader conteudo = null;
        String linha = "";
        ArrayList<String> colunas = new ArrayList<String>();
        String[] x = null;
        int numLinhasArq = 0, i = 0;//index do ArrayList
        try {
            conteudo = new BufferedReader(new FileReader(caminho));
            while((linha = conteudo.readLine()) != null) {
                if (numLinhasArq > CABECALHO) {
                    colunas.add(linha);
                    x = colunas.get(i).split(";");
                    System.out.println(x[9]);//indices das siglas
                    i++;
                }
                numLinhasArq++;
            }
        } catch (IOException e) {}
        System.out.println("xxxxxxxxxxxxxx");
        return colunas;
    }
}
