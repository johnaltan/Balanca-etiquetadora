/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanca.etiquetadora;

import java.io.File;

/**
 *
 * @author paola
 */
public class Etiqueta {
    private Produto produto;
    private double peso;
    private double valorFinal;
    private double pesoEmb;
    private File arquivoModelo;

    public Etiqueta(Produto produto, double peso, String caminhoModelo) {
        this.produto = produto;
        this.peso = peso;
        this.valorFinal = Calculador.arredonda(peso*produto.getPrec(),2);
        arquivoModelo = new File(caminhoModelo);
        pesoEmb = 0;
    }

    public Etiqueta(File arquivoModelo) {
        this.arquivoModelo = arquivoModelo;
    }    
    
    
    public String getCodigoBarras(boolean comVerificador) {
        int verificador;
        String codBarra = null;
        try {
            String codProd = String.format("%05d", Integer.parseInt(produto.getCodigo()));
            codBarra = "2" + codProd + "0" + Calculador.calculaValorInteiroCodigo(valorFinal);
            if(comVerificador) {
                verificador = Calculador.calculaVerificador(codBarra);
                codBarra += Integer.toString(verificador);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return codBarra;
    }
    
    public void calculaParametros() throws Exception{
        double pesoLiq = this.getPesoLiquido();
        if(pesoLiq < 0) throw new Exception("Peso da embalagem maior que peso do produto!");
        this.valorFinal = pesoLiq*produto.getPrec();
        System.out.println("Valor sem arredondar: " + String.valueOf(this.valorFinal));
        System.out.println("Peso liq: " + String.valueOf(pesoLiq));
    }

    public double getPesoEmb() {
        return pesoEmb;
    }

    public void setPesoEmb(double pesoEmb) {
        this.pesoEmb = pesoEmb;
    }
    
    public double getPesoLiquido() {
        double pesoLiq = peso - pesoEmb;        
        return pesoLiq;
    }
    
    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }   
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public File getArquivoModelo() {
        return arquivoModelo;
    }

    public void setArquivoModelo(File arquivoModelo) {
        this.arquivoModelo = arquivoModelo;
    }

    
    
    
    
    
}
