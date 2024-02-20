import ReadWriter.*;
import maquinasParImpar.*;
import MaquinaRecursiva.*;
public class App {
    public static void main(String[] args) throws Exception {

        //pruebaMaquinaParUno();
        //pruebaMaquinaImparCeros();
        //pruebaMaquinaRecursiva1();
        //pruebaMaquinaRecursiva1B();
        pruebaMaquinaRecursiva2();
    }

    public static String pruebaReadWriter(String nombreArchivo){
        ReadWriter testo = new ReadWriter();
        String palabras;

        palabras = testo.LeerArchivo(nombreArchivo);

        return palabras;
    }
    
    public static void pruebaMaquinaRecursiva1(){
        MaquinaRecursiva1 Maquina1 = new MaquinaRecursiva1();
        Maquina1.addPalabras(pruebaReadWriter("Wordlist.fes"));
        Maquina1.probarLista();
    }
    public static void pruebaMaquinaRecursiva1B(){
        MaquinaRecursiva1B Maquina1 = new MaquinaRecursiva1B();
        Maquina1.addPalabras(pruebaReadWriter("Wordlist.fes"));
        Maquina1.probarLista();
    }

    public static void pruebaMaquinaRecursiva2(){
        MaquinaRecursiva2 Maquina2 = new MaquinaRecursiva2();
        Maquina2.addPalabras(pruebaReadWriter("Wordlist.fes"));
        Maquina2.probarLista();
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
}

 
