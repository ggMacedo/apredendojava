
package model;

public class Funcionario {
    private int cracha;
    private double salario;
    private String cargo;

    public Funcionario() {
        this.cargo = "Assistente";
    }

    public Funcionario(int c, double s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }
    
    public int getCracha() {
        return this.cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double calcularAumento(double porc){
        double aumento = porc * this.getSalario();
        
        return aumento;
    }
    

    public double calcularAumento(int tempo){
        if(tempo>0){
            double aumentoAnual = this.getSalario() + 150.00;
            return aumentoAnual;
        }else{
            return this.getSalario();
            
        }
        
    }
    
    
    
}
