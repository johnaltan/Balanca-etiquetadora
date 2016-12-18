/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import balanca.etiquetadora.DriverImpressora;
import balanca.etiquetadora.Etiqueta;
import balanca.etiquetadora.Produto;
import java.awt.print.PrinterJob;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

/**
 *
 * @author paola
 */
public class TesteImpressora {
    public static void main (String [] args)
    {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        System.out.println("Number of print services: " + printServices.length);
        
        DriverImpressora driverImpressora = new DriverImpressora();
        Etiqueta etiqueta = new Etiqueta(new Produto("9","MAMINHA",32.90),0.930,"ETIQUETA10_1");

        for (PrintService printer : printServices)
            System.out.println("Printer: " + printer.getName());
        try {
            PrintService pservice = printServices[1];
            DocPrintJob job = pservice.createPrintJob();  
            String commands = driverImpressora.editaLayout(etiqueta);
            DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
            Doc doc = new SimpleDoc(commands.getBytes(), flavor, null);
            job.print(doc, null);
        }catch (PrintException e ){
            e.printStackTrace();
        }
        

    }
}
