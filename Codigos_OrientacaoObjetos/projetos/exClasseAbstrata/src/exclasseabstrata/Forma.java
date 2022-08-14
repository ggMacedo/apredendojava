/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exclasseabstrata;

/**
 *
 * @author gabri
 */
public abstract class Forma {
    private double base;

    public Forma(double b) {
        this.setBase(b);
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public abstract double area();
    
    public abstract void mostra();
    
    public double perimetro(){
        double p = 0;
        return p;  
    }

   
}
