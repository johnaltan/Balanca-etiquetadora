/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanca.etiquetadora;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author paola
 */
public class DriverImpressora {
    String caminhoArqImpressora;
    
    public DriverImpressora(String caminhoArqImpressora){
        this.caminhoArqImpressora = caminhoArqImpressora;
    }
    
    public void enviaEtiqueta(Etiqueta etiqueta) {
        
    }
    
    public String editaLayout(Etiqueta etiqueta){
        String file = new String();
        String linha;
        String codPadrao = "789123456789";
        String codEtiqueta = etiqueta.getCodigoBarras(false);
        StringBuilder fileBuilder;
        int i,j,c;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(etiqueta.getArquivoModelo()),"UTF8"))) {
            while ((linha = br.readLine()) != null) file += linha + "\n";
            System.out.print(file);
            System.out.println();
            Produto produto = etiqueta.getProduto();
            file = file.replace("PESOB", String.format("%.3f",etiqueta.getPeso()).replace('.', ','));
            file = file.replace("DESCRICAO", produto.getDescricao());
            file = file.replace("VALOR", String.format("%.2f",etiqueta.getValorFinal()).replace('.', ','));
            file = file.replace("PRECO", String.format("%.2f",produto.getPrec()).replace('.', ','));
            i = file.indexOf(codPadrao);
            file = file.replace(codPadrao, codEtiqueta); //codigo de barras sem verificador
            System.out.print(file);
            
            fileBuilder = new StringBuilder(file);
            j = fileBuilder.indexOf("\n", i);  //Encontra \n logo apos codigo
            
            System.out.println(file.substring(i, j));
            for(c = 0; c<11 ; c++) {
                i = j + 1;
                j = fileBuilder.indexOf("\n",i);
                fileBuilder.setCharAt(j-1, codEtiqueta.charAt(c + 1));  
            }
            
            i = j + 1;
            j = fileBuilder.indexOf("\n",i);
            fileBuilder.setCharAt(j-1, String.valueOf(Calculador.calculaVerificador(codEtiqueta)).charAt(0));
            
            i = j + 1;
            j = fileBuilder.indexOf("\n",i);
            fileBuilder.setCharAt(j-1, codEtiqueta.charAt(0));
            
            file = new String(fileBuilder);
            
            System.out.println(file);            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
    
    void escreveArquivo(String str) {
        File arquivo = new File("saida");
        try {            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo),"UTF-8"));
            bw.write(str);
            bw.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
