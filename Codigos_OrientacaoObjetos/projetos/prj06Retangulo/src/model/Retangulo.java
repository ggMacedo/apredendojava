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
public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(){
       
    }
    
    public Retangulo(double b, double a){
        this.setBase(b);
        this.setAltura(a);
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void ImprimirDados(){
        System.out.println("Base: " + this.getBase());
        System.out.println("Altura: " + this.getAltura());
    }
    
    
}
