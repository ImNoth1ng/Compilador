package MaquinaRecursiva;

import java.util.ArrayList;

public class MaquinaRecursiva1 {


    ArrayList<String> palabras = new ArrayList<String>();

    public void addPalabras(String Palabras){
        String[] palabras_separadas = Palabras.split(",");
        for (String palabra : palabras_separadas) {
            this.palabras.add(palabra);
        }
    }

    private void estadoA(String palabra, int indice){
        if (indice >= palabra.length()-1) {
            System.out.println("Estado No Final, palabra no valida");
        }else {
        char c = palabra.charAt(indice);
        
        if (c == '1') {
            estadoC(palabra, indice + 1);
        } else if (c == '0') {
            estadoB(palabra, indice + 1);
        } else {
            System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
        }}
    }

    private void estadoB(String palabra, int indice){
        if (indice >= palabra.length()-1) {
            System.out.println("Estado No Final, palabra no valida");
        }else {
        char c = palabra.charAt(indice);
        
        if (c == '1') {
            estadoC(palabra, indice + 1);
        } else if (c == '0') {
            estadoB(palabra, indice + 1);
        } else {
            System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
        }}
    }

    private void estadoC(String palabra, int indice){
        if (indice >= palabra.length()-1) {
            System.out.println("Estado No Final, palabra no valida");
        }else {
        char c = palabra.charAt(indice);
        
        if (c == '1') {
            estadoE(palabra, indice + 1);
        } else if (c == '0') {
            estadoD(palabra, indice + 1);
        } else {
            System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
        }}
    }

    private void estadoD(String palabra, int indice){

        System.out.println("Estado No Final, palabra no valida");

    }
    private void estadoE(String palabra, int indice){
        if (indice >= palabra.length()-1) {
            System.out.println("Estado Final, palabra valida");
        }else {
        char c = palabra.charAt(indice);
        
        if (c == '1') {
            estadoD(palabra, indice + 1);
        } else if (c == '0') {
            estadoF(palabra, indice + 1);
        } else {
            System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
        }}
    }
    private void estadoF(String palabra, int indice){
        if (indice >= palabra.length()-1) {
            System.out.println("Estado No Final, palabra no valida");
            
        }else {
        char c = palabra.charAt(indice);
        
        if (c == '1') {
            estadoD(palabra, indice + 1);
        } else if (c == '0') {
            estadoF(palabra, indice + 1);
        } else {
            System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
        }}
    }


    public void probarLista(){
        for (String palabra : palabras) {
            System.out.println("_________________________");
            System.out.println("Palabra: " + palabra);
            estadoA(palabra, 0);
        }
    }

}
