/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanca.etiquetadora;

import jssc.SerialPort;

/**
 *
 * @author paola
 */
public class DriverBalanca {
    
    public double getPeso(){
        double peso = 0;
        
        SerialPort serialPort = new SerialPort("/dev/ttyUSB0");
        
        return peso;
        
    }
    
    
}
