/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexemplo;

/**
 *
 * @author gabri
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String n, int i) {
        this.setNome(n);
        this.setIdade(i);
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
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade();
    }
    
    
    
}
