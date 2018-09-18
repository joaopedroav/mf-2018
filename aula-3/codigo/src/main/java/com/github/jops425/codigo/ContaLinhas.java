import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

public class ContaLinhas {

    public static void main(String[] args) {
        int linhasTotais = 0;
        File files = new File(System.getProperty("user.dir"));
        ArrayList<String> lista = listarArquivos(files);
        for(int i = 0; i < lista.size(); i++) {
            int aux = contaLinhas(lista.get(i));
            System.out.println(aux + " " + lista.get(i));
            linhasTotais = linhasTotais + aux;
        }
        System.out.println("Total de linhas = " + linhasTotais);
    }

    public static int contaLinhas(String caminho) {
        BufferedReader conteudo = null;
        ArrayList<String> linhas = new ArrayList<String>();
        String linha = "";
        try {
            conteudo = new BufferedReader(new FileReader(caminho));
            while((linha = conteudo.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {}
        return linhas.size();
    }

    public static ArrayList<String> listarArquivos(File file) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            File[] listaArquivos = file.listFiles();
            for (File arquivo : listaArquivos) {
                if (!arquivo.isDirectory()) {
                    lista.add(arquivo.getCanonicalPath());
                }
            }
        } catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
