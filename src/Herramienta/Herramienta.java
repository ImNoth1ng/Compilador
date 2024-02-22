package Herramienta;

public class Herramienta {
    public static boolean esLetra(char c){
        boolean esLetra = false;
        if ((c >= 97 && c <= 122) || (c >= 66 && c <= 90)){
            esLetra = true;
        }
        return esLetra;
    }
    public static boolean esNumero(char c){
        boolean esNumero = false;
        if (c >= 48 && c <= 57){
            esNumero = true;
        }
        return esNumero;
    }
    public static boolean finCadena(char c){
        boolean finCadena = false;
        if (c == 32){
            finCadena = true;
        }
        return finCadena;
    }

    public static boolean esEspacio(char c){
        boolean esEspacio = false;
        if (c == 32){
            esEspacio = true;
        }
        return esEspacio;
    }
}
