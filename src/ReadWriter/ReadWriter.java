package ReadWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReadWriter{
    //Atributos
    private String ruta;


    //Metodos


//Constructor

    public ReadWriter(String __ruta){
        ruta = __ruta;
    }
//Funcion que escribe, recibe una ruta y un nombre de archivo en string
    public void escribe(String texto, String nombreArchivo){//recibimos el texto a escribir y el nombre del archivo
        try(FileWriter archivo = new FileWriter(ruta+"\\"+nombreArchivo)) {
            PrintWriter escritor = new PrintWriter(archivo);
            escritor.println(texto);
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo");
        }
    }


//Funcion que lee Recibe la ruta del archivo a leer
    FileReader archivo;
    BufferedReader lector;
    public void lee(String nombreArchivo){
        try {
            archivo = new FileReader(ruta+"\\"+nombreArchivo);
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String Cadena;
                while ((Cadena = lector.readLine()) != null) {
                    System.out.println(Cadena);
                }
            } else{
                System.out.println("El archivo no se puede leer.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void cuentaPalabras(String nombreArchivo){
        int contador = 0;
        try {
            archivo = new FileReader(ruta+"\\"+nombreArchivo);
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String Cadena;
                while ((Cadena = lector.readLine()) != null) {
                    String[] palabras = Cadena.split(" ");
                    contador += palabras.length;
                }
            } else{
                System.out.println("El archivo no se puede leer.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("El archivo tiene " + contador + " palabras");

    }
}