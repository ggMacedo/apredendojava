package model;


public class Vendedor {
    private double vendas;
    private double salario;
    private String nome;
    private int falta;

    public Vendedor(double v, double s, String n, int f) {
        this.setVendas(v);
        this.setSalario(s);
        this.setNome(n);
        this.setFalta(f);
    }
    
    public double getVendas() {
        return this.vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return this.falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
    
    public double calcularComissao(){
        
        if(this.getVendas() >= 1000 && this.getVendas() < 2000){
            return this.getVendas() * 0.10;
        }else if(this.getVendas() >= 2000){
            return this.getVendas() * 0.15;
        }
        return 0;
           
    }
    
    public double descontoFalta(){
        double desc = (this.getSalario()/30) * this.getFalta();
        return desc;
    }
    
    public double calculaSalrio(){
        double sal = ((this.getSalario() + this.calcularComissao()) - this.descontoFalta());
        setSalario(sal);
        return sal;
    }
    
    public String imprimirDados(){
        String ret = "Nome: " + this.getNome() + "\nVendas: " + this.getVendas() + "\nSalario: " + this.calculaSalrio() + "\nFaltas: " + this.getFalta();
        return ret;
    }
    
    
    
}
