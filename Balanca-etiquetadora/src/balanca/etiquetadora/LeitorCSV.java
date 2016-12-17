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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorCSV {
    private String arquivoCSV;
    String separadorCSV;

    public LeitorCSV(String arquivoCSV, String separadorCSV) {
        this.arquivoCSV = arquivoCSV;
        this.separadorCSV = separadorCSV;
    }    
    
    public Produto buscaProduto(int codigo) throws Exception{
        String descricao="",linha;
        String[] campos = null;
        String codLido;
        double prec=0;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            linha = br.readLine();
            while ((linha = br.readLine()) != null) {

                // use comma as separator
                campos = linha.split(separadorCSV);
                codLido = campos[1];
                if (codLido.equals(String.valueOf(codigo))) break;
            }
            if (linha == null) throw new Exception("Produto nao encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
        campos[4] = campos[4].replace(",",".");
        return new Produto(codigo,campos[0],Double.parseDouble(campos[4]));
    }
    
}
  
