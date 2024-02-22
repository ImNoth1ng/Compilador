package Herramienta;

public class Letra {
    public static boolean esLetra(char c){
        boolean esLetra = false;
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
            esLetra = true;
        }
        return esLetra;
    }

}

