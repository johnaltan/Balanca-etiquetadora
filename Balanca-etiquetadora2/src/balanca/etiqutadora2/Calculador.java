/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanca.etiquetadora;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author paola
 */
public class Calculador {

    /**
     *
     * @param codigo
     * @return
     */
    public static int calculaVerificador(String codigo){
        int[] posImp, posPar;
        int i,somaImp = 0,somaPar = 0;
        for(i = 0;i < codigo.length(); i+=2){
            somaImp += Character.getNumericValue(codigo.charAt(i));
        }
        for(i = 1;i < codigo.length(); i+=2){
            somaPar += Character.getNumericValue(codigo.charAt(i));
        }
        i = somaPar*3;
        i = i + somaImp;
        i = (10 - (i % 10)) % 10;
        return i;
    }
    
    public static String calculaValorInteiroCodigo(double valor) throws Exception {
        if (valor >= 1000.0) throw new Exception("Valor além do suportado.");
        int valorInt, valorDec;
        valorInt  = (int)(arredonda(valor,2)*100);
        return String.format("%05d", valorInt);
    }
    
   
    public static double arredonda(double valor, int casas) {
        if (casas < 0) throw new IllegalArgumentException();
        int valorDec, valorInt;
        valorInt = (int)valor;
        valorDec = (int)((valor - valorInt)*Math.pow(10, casas+1));
        if ((valorDec % 10) >= 5)  valorDec = 1;
        else valorDec = 0;
        valorDec = (int)((valor - valorInt)*100) + valorDec;
        return valorInt + valorDec/Math.pow(10, casas);        
    }
    
}
