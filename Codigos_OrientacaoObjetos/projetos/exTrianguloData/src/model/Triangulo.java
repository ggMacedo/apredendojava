
package model;


public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double b, double a) {
        this.setBase(b);
        this.setAltura(a);
    }
    
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        double area = (this.getBase() * this.getAltura()) /2;
        
        return area;
        
    }
    
    public String imprimirDados(){
        String ret = "Base: " + this.getBase() +
                     "\nAltura: " + this.getAltura() +
                     "\nResultado da área do triangulo: " + this.calcularArea();
        return ret;
        
    }
    
    
    
}
