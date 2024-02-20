package MaquinaRecursiva;

import java.util.ArrayList;

public class MaquinaRecursiva1B {

    ArrayList<String> palabras = new ArrayList<String>();
    private int indice = 0;


    public void addPalabras(String Palabras){
        String[] palabras_separadas = Palabras.split(",");
        for (String palabra : palabras_separadas) {
            this.palabras.add(palabra);
        }
    }

    private char SigChar( String palabra){
        char c = ' ';
        if (indice < palabra.length()){
            c = palabra.charAt(indice);
            indice++;
        }
        return c;
    }

    private void estadoA(String palabra){
        char c = SigChar(palabra);
        switch (c) {
            case '0':
                estadoB(palabra);
                break;
            case '1':
                estadoC(palabra);
                break;
            case ' ':
                System.out.println("Estado NO Final, palabra NO valida");
                indice = 0;
                break;    
            default:
                System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
                break;
        }
    }
    private void estadoB(String palabra){
        char c = SigChar(palabra);
        switch (c) {
            case '0':
                estadoB(palabra);
                break;
            case '1':
                estadoC(palabra);
                break;
            case ' ':
                System.out.println("Estado NO Final, palabra NO valida");
                indice = 0;
                break;
            default:
                System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
                indice = 0;
                break;
        }
    }
    private void estadoC(String palabra){
        char c = SigChar(palabra);
        switch (c) {
            case '0':
                estadoD(palabra);
                break;
            case '1':
                estadoE(palabra);
                break;
            case ' ':
                System.out.println("Estado NO Final, palabra NO valida");
                indice = 0;
                break;
            default:
                System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
                indice = 0;
                break;
        }
    }
    private void estadoD(String palabra){
        char c = SigChar(palabra);
        switch (c) {
            case '0':
                estadoD(palabra);
                break;
            case '1':
                estadoD(palabra);
                break;
            case ' ':
                System.out.println("Estado NO Final, palabra NO valida");
                indice = 0;
                break;
        
            default:
                System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
                indice = 0;
                break;
        }
    }
    private void estadoE(String palabra){
        char c = SigChar(palabra);
        switch (c) {
            case '0':
                estadoF(palabra);
                break;
            case '1':
                estadoD(palabra);
                break;
            case ' ':
                System.out.println("Estado Final, palabra valida");
                indice = 0;
                break;
        
            default:
                System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
                indice = 0;
                break;
        }
    }
    private void estadoF(String palabra){
        char c = SigChar(palabra);
        switch (c) {
            case '0':
                estadoF(palabra);
                break;
            case '1':
                estadoD(palabra);
                break;
            case ' ':
                System.out.println("Estado Final, palabra valida");
                indice = 0;
                break;
            default:
                System.out.println("Error: Caracter "+  c+ " no valido en columna " + indice);
                indice = 0;
                break;
        }
    }

    


    public void probarLista(){
        for (String palabra : palabras) {
            System.out.println("_________________________");
            System.out.println("Palabra: " + palabra);
            estadoA(palabra);
        }
    }
}
