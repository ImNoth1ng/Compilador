package Jflex.NotaCient;

import Jflex.NotaCient.Tokens;

import java.io.*;

public class Inicio {
    public static void main(String[] args) {
        try{
            Reader rd = new BufferedReader(new FileReader("src/Jflex/NotaCient/fuente.txt"));
            Lexico lexico = new Lexico(rd);
            Tokens resultado;
            do{
                resultado=lexico.yylex();
                System.out.println(resultado);
            }while (resultado!=null);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

