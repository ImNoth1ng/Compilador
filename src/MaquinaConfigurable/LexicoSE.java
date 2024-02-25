package MaquinaConfigurable;
import Herramienta.*;

public class LexicoSE {
    private int indice = 0;
    private int error = -1;
    private int espacio = 0;
    //private int aceptar = 1;

    //Variables de AFD
    private int estado = 1;
    private int entrada = 0;

    private int[][] matrix ={{2,1-1},{1,1,-1},{2,2,1}};

    private String token;

    public LexicoSE(){
    };

    public void setToken(String token){
        this.token = token;
    };

    private char siguienteCaracter(){
        char c = ' ';
        if(indice<token.length()){
            c = token.charAt(indice);
            indice++;
        }
        return c;
    }

    public int inicio() throws Exception {
        char c= ' ';
        do{
            c = siguienteCaracter();
            if(Herramienta.esLetra(c)){
                entrada = 0;
            }else if(Herramienta.esNumero(c)){
                entrada = 1;
            }else if(Herramienta.finCadena(c)){
                entrada = 2;
                espacio++;
                if (espacio >= 0){
                    error = 0;
                }
            }else{
                error = 0;
            }
            if(error!=0){
                entrada = matrix[estado][entrada];
            }else{
                throw new Exception("Error en el caracter: "+c);
            }

        }while(indice<token.length());
        //System.out.println("Espacios: "+espacio);
        return estado;
    }
}
