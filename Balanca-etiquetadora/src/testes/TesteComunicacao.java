/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import balanca.etiquetadora.LeitorSerial;
import java.util.Scanner;
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

/**
 *
 * @author paola
 */
public class TesteComunicacao {
    public static void main(String[] args){
        String[] portNames = SerialPortList.getPortNames();
        System.out.println("Portas: ");
        for(String s : portNames) System.out.println(s);
        try {
            SerialPort serialPort = new SerialPort("COM1");
            serialPort.openPort();
            serialPort.setParams(SerialPort.BAUDRATE_9600, 
                    SerialPort.DATABITS_8, 
                    SerialPort.STOPBITS_2, 
                    SerialPort.PARITY_NONE);
            
            int mask = SerialPort.MASK_RXCHAR + SerialPort.MASK_CTS + SerialPort.MASK_DSR;//Prepare mask
            serialPort.setEventsMask(mask);//Set mask
            serialPort.addEventListener(new LeitorSerial(serialPort));//Add SerialPortEventListener
            
            //serialPort.closePort();
        }
        catch (SerialPortException ex){
            System.out.println(ex);
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
