import ReadWriter.*;
import maquinasParImpar.*;
import MaquinaRecursiva.*;
public class App {
    public static void main(String[] args) throws Exception {
        //pruebaReadWriter();
        //pruebaMaquinaParUno();
        //pruebaMaquinaImparCeros();
        pruebaMaquinaRecursiva1();
    }

    public static void pruebaReadWriter(){
        String ruta = "E:\\DOCS\\Java Projects";
        String nombreArchivo = "archivoimportante.fes";
        

        ReadWriter testo = new ReadWriter(ruta);

        testo.escribe("1001010, 10010,00m01", "archivoimportante.fes");
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
        Lector lector = new Lector();
        String palabras = lector.LeerArchivo("palabras");
        impares.addPalabras(palabras);
        impares.probarLista();
    }

    public static void pruebaMaquinaRecursiva1(){
        MaquinaRecursiva1 Maquina1 = new MaquinaRecursiva1();
        Maquina1.addPalabras("m001,0000,010101001");
        Maquina1.probarLista();
    }
}

