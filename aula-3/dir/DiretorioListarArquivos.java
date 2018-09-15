import java.io.File;
import java.io.IOException;

public class DiretorioListarArquivos {

	public static void main(String[] args) {
		File files = new File(System.getProperty("user.dir"));
		mostrarDiretorios(files);
	}

	public static void mostrarDiretorios(File file) {
        try {
            File[] listaArquivos = file.listFiles();
            for (File arquivo : listaArquivos) {
                if (!arquivo.isDirectory()) {
                    System.out.println(arquivo.getCanonicalPath());
                }
            }
        } catch (IOException e) {
			e.printStackTrace();
		}
	}
}
