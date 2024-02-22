package MaquinaConfigurable;

public class Lexico {
    private int indice = 0;
    private int error = -1;
    private int aceptar = 1;

    //Variables de AFD
    private int estado = 1;
    private int entrada = 0;

    private int[][] matrix ={{3,2-1},{2,2,-1},{3,3,1}};

    private String token;

    public Lexico(){
        token =
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

    public void inicio(){
        char c =' ';

        do{
            c = siguienteCaracter();
            if(Herramienta.Letra()){
                entrada = 0;
            }else if(Herramienta.Numero()){
                entrada= 
            }

        }while();
    }

}
