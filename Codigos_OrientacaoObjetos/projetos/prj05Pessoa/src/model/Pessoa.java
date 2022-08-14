
package model;


public class Pessoa {
    private String nome;
    private int idade;
    private double renda;
    
    //metodo construtor
    public Pessoa(String n, int i, double r){
        
        /*this.nome = n;
        this.idade = i;
        this.renda = r;*/
        
        this.setNome(n);
        this.setIdade(i);
        this.setRenda(r);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    
    
    
    
}
