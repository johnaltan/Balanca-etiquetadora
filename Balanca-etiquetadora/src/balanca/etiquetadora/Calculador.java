/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanca.etiquetadora;

/**
 *
 * @author paola
 */
public class Calculador {
    int calculaVerificador(String codigo){
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
    
    String calculaValorInteiro(double valor){
        int valorInt, valorDec = 0;
        valorInt = (int)valor;
        valorDec = (int)((valor - valorInt)*1000);
        if ((valorDec % 10) >= 5)  valorDec = 1;
        else valorDec = 0;
        valorDec = (int)((valor - valorInt)*100) + valorDec;
        valorInt = valorInt*100 + valorDec;
        return String.format("%05d", valorInt);
    }
    
}
