package ReadWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Lector {

    public String LeerArchivo(String nombreArchivo){
        File f = new File(System.getProperty("user.dir") + File.separator + nombreArchivo);

        if (f.exists()){
            try{
                try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                    String palabras;
                    while ((palabras = br.readLine()) != null){
                        return palabras;
                    }
                }
            }catch (Exception e){
                System.out.println("Error al leer el archivo");
            }
        }
        return "a";
    }

}
