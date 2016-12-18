/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

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
        for(int i = 0; i < portNames.length; i++){
            System.out.println(portNames[i]);
        }
        
        SerialPort serialPort = new SerialPort("/dev/ttyUSB1");
        try {
            serialPort.openPort();
            serialPort.setParams(SerialPort.BAUDRATE_9600, 
                    SerialPort.DATABITS_8, 
                    SerialPort.STOPBITS_2, 
                    SerialPort.PARITY_NONE);
            byte[] bytes = {0,5};
            serialPort.writeBytes(bytes);
            int myint = 0;
            
            while(true){
                /*Scanner keyboard = new Scanner(System.in);
                System.out.println("Digite enter");
                myint = keyboard.nextInt(); */           

                byte[] buffer = serialPort.readBytes();
                if(buffer != null){
                    for(int i = 0; i < buffer.length; i++)
                    System.out.printf("0x%02X ", buffer[i]);
                }
            }
            //serialPort.closePort();
        }
        catch (SerialPortException ex){
            System.out.println(ex);
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
