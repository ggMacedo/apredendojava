/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabri
 */
public class Produto {
    private String marca;
    private String fabricante;
    private String cod_barras;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Produto() {
        
    }

    public Produto(String m, String f, String c, double p) {
        this.setMarca(m);
        this.setFabricante(f);
        this.setCod_barras(c);
        this.setPreco(p);
    }
    
    public void ImprimirDados(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Código de Barras: " + this.getCod_barras());
        System.out.println("Preço: " + this.getPreco());

    }
    
    
    
}
