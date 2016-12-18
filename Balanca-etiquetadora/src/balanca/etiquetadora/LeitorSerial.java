/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanca.etiquetadora;

import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author paola
 */
public class LeitorSerial implements SerialPortEventListener {
    private SerialPort portaSerial;
    private byte[] buffer;
    
    public LeitorSerial(SerialPort portaSerial){
        buffer = new byte[1000];
        this.portaSerial = portaSerial;
    }
    
    public byte[] getBuffer(){
        return this.buffer;
    } 
    
    @Override
    public void serialEvent(SerialPortEvent event) {
        if(event.isRXCHAR()) {
            try {
                byte[] buf;
                buf = portaSerial.readBytes();
                System.out.println(buf);
                if(buf != null) {
                    //System.arraycopy(buf, 0, buffer, buffer.length, buf.length);
                    System.out.println("Byte[] chegou: ");
                    for(byte b : buf) System.out.printf("0x%02X ", b);
                    System.out.println();
                }
            }
            catch (SerialPortException ex) {
                System.out.println(ex);
            }            
        }
        else if(event.isCTS()){//If CTS line has changed state
            if(event.getEventValue() == 1){//If line is ON
                System.out.println("CTS - ON");
            }
            else {
                System.out.println("CTS - OFF");
            }
        }
        else if(event.isDSR()){///If DSR line has changed state
            if(event.getEventValue() == 1){//If line is ON
                System.out.println("DSR - ON");
            }
            else {
                System.out.println("DSR - OFF");
            }
        }
    }
}
