package br.edu.unisep.utilitario.io;

import java.util.Scanner;

public class Console {
    /**
     * Método para efetuar leitura do console
     * @return String lida
     */
    public static String ler(){
        Scanner sc = new Scanner (System.in);
        return sc.next();
    }
    /**
     * Escreve na tela
     * @param msg  String para escrever na tela
     */
    public static void escrever(String msg){
        System.out.println(msg);
    }
    
    public static void escreverLn(String msg){
        System.out.println(msg);
    }
}
