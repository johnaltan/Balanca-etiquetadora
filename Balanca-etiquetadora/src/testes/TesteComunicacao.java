/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import jssc.SerialPortList;

/**
 *
 * @author paola
 */
public class TesteComunicacao {
    public static void main(String[] args){
        String[] portNames = SerialPortList.getPortNames();
                for(int i = 0; i < portNames.length; i++){
                System.out.println(portNames[i]);
           }
    }
    
}
