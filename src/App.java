import ReadWriter.*;
import maquinasParImpar.*;
import MaquinaConfigurable.*;
import MaquinaRecursiva.*;
public class App {
    public static void main(String[] args) throws Exception {

        LexicoSE app = new LexicoSE();
        app.setToken("olatonotos1 asd");
        try{
            int verifica= app.inicio();
            if(verifica == 1){
                System.out.println("Cadena aceptada");
            }else{
                System.out.println("Cadena no aceptada");
            }
        }catch(Exception e){
            System.out.println("No valido --> Caracter no valido");
        }


        //pruebaLexico();

        //pruebaMaquinaParUno();
        //pruebaMaquinaImparCeros();
        //pruebaMaquinaRecursiva1();
        //pruebaMaquinaRecursiva1B();
        //pruebaMaquinaRecursiva2();
    }

    public static void pruebaLexico(){
        Lexico app = new Lexico();
        app.setToken("olatonotos1");
        try{
            int verifica= app.inicio();
            if(verifica == 1){
                System.out.println("Cadena aceptada");
            }else{
                System.out.println("Cadena no aceptada");
            }
        }catch(Exception e){
            System.out.println("No valido --> Caracter no valido");
        }
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

 
