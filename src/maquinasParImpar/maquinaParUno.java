package maquinasParImpar;

import java.util.ArrayList;

public class maquinaParUno {

    ArrayList<String> palabras = new ArrayList<String>();


    public void addPalabras(String Palabras){
        String[] palabras_separadas = Palabras.split(",");
        for (String palabra : palabras_separadas) {
            this.palabras.add(palabra);
        }
    }


    public void identificarParDeUnos(String Palabra){
        int indice = 0;
        int estado = 0;
        boolean error = false;
        //dada la notación de los numeros pares es 2n, donde n es un numero entero se toma el 0 como par
        while (indice <= Palabra.length()-1) {
            char c = Palabra.charAt(indice);
            switch (estado) {
                case 0:
                    if (c == '1') {
                        estado = 1;
                    } else if (c == '0') {
                        estado = 0;
                    } else {
                        System.out.println("Error en la maquina de estados, caracter no valido en columna " + (indice + 1) + " caracter  ---> " + Palabra.charAt(indice));
                        error = true;
                    }
                    break;

                case 1:
                    if (c == '1') {
                        estado = 0;
                    } else if (c == '0') {
                        estado = 1;
                    } else {
                        error = true;
                        indice = Palabra.length() + 1;
                    }
                    break;

            }
            indice++;
        }
        if (!error){
            if (estado == 0) {
                System.out.println("La palabra " + Palabra + " es par de unos");
            } else {
                System.out.println("La palabra " + Palabra + " no es par de unos");
            }
        } else {
            System.out.println("Caracteres no validos en la palabra ");
        }
    }

    public void probarLista(){
        for (String palabra : palabras) {
            System.out.println("_________________________");
            System.out.println("Palabra: " + palabra);
            identificarParDeUnos(palabra);
        }
    }
}
