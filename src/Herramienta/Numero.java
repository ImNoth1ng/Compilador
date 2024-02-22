package Herramienta;

public class Numero {
    public static boolean esNumero(char c){
        boolean esNumero = false;
        if (c >= 48 && c <= 57){
            esNumero = true;
        }
        return esNumero;
    };

}