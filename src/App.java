import ReadWriter.*;
public class App {
    public static void main(String[] args) throws Exception {
        String ruta = "/home/noth1ng/Documents/Compiladores";

        ReadWriter testo = new ReadWriter(ruta);

        testo.escribe("Hola tonotos, como estan\nEspero que bien", "archivoimportante.fes");
        testo.lee("archivoimportante.fes");
        testo.cuentaPalabras("archivoimportante.fes");
    }
}

