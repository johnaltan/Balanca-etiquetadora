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
public class Produto {
    private String codigo;
    private String descricao;
    private double prec;

    public Produto(String codigo, String descricao, double prec) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.prec = prec;
    }   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }
    
    public String toString(){
        return "Codigo: " + codigo + " | Desc: " + descricao + " | Preço: " + Double.toString(prec);
    }
}
