import ReadWriter.*;
import maquinasParImpar.*;
public class App {
    public static void main(String[] args) throws Exception {
        //pruebaReadWriter();
        pruebaMaquinaParUno();
        pruebaMaquinaImparCeros();
    }

    public static void pruebaReadWriter(){
        String ruta = "E:\\DOCS\\Java Projects";
        String nombreArchivo = "archivoimportante.fes";
        

        ReadWriter testo = new ReadWriter(ruta);

        testo.escribe("Hola tonotos, como estan\nEspero que bien", "archivoimportante.fes");
        testo.lee(nombreArchivo);
        testo.cuentaPalabras(nombreArchivo);
    }

    public static void pruebaMaquinaParUno(){
        maquinaParUno pares = new maquinaParUno();
        //pares.identificarParDeUnos("m001");

        pares.addPalabras("m001,0000");
        pares.probarLista();

    }

    public static void pruebaMaquinaImparCeros(){
        maquinaImparCeros impares = new maquinaImparCeros();
        impares.addPalabras("m001,0000,010101001");
        impares.probarLista();
    }

}

