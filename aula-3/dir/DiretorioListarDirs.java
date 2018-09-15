import java.io.File;
import java.io.IOException;

public class DiretorioListarDirs {

	public static void main(String[] args) {
		File dirs = new File(System.getProperty("user.dir"));
		mostrarDiretorios(dirs);
	}

	public static void mostrarDiretorios(File dir) {
        try {
            File[] diretorios = dir.listFiles();
            for (File diretorio : diretorios) {
                if (diretorio.isDirectory()) {
                    System.out.println(diretorio.getCanonicalPath());
                    mostrarDiretorios(diretorio);
                }
            }
        } catch (IOException e) {
			e.printStackTrace();
		}
	}

}
