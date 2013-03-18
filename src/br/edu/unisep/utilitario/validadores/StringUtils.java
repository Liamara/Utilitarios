package br.edu.unisep.utilitario.validadores;

public class StringUtils {

    public static boolean ehInteiro(String valor) {
        if (valor.isEmpty()){
            return false;
        }
        
        return valor.matches("[0-9]*");
//        String numeros = "0123456789";
//
//        for (int x = 0; x < valor.length(); x++) {
//            if (!numeros.contains(String.valueOf(valor.charAt(x)+""))) {
//                return false;
//            }
//        }

//return true;
    }
    
}
