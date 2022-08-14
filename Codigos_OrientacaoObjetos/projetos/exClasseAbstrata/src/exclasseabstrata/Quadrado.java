
package exclasseabstrata;


public class Quadrado extends Forma{

    public Quadrado(double b) {
        super(b);
    }
    
    @Override
    public double area(){
        double a = super.getBase() * super.getBase();
        return a;
        
    }
    
    
    @Override
    public void mostra(){
        System.out.println("Base: " + super.getBase() + "\nPerimetro: " + this.perimetro() + "\nÁrea: " + this.area());
        
    }
    
    @Override
    public double perimetro(){
        return super.getBase()* 4;
        
    }
    
       
}
