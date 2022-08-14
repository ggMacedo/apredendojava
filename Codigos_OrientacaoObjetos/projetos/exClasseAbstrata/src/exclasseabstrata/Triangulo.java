
package exclasseabstrata;


public class Triangulo extends Forma {
    private double altura;
    
    public Triangulo(double b, double a) {
        super(b);
        this.setAltura(a);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area(){
        double a = super.getBase() * this.getAltura()/2;
        return a;
        
    }

    @Override
    public void mostra(){
        System.out.println("Base: " + super.getBase() + "\nAltura: " + this.getAltura() + "\nÁrea: " + this.area());
        
    }
   
    
}
