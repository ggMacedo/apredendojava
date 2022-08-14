
package model;


public class Torneio {
    private String nome; 
    private int idade;

    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String verificaCategoria(int i){
        
        if(i >= 5 && i <= 7){
            return "Infantil";
        }else if(i >= 8 && i <= 10){
            return "Juvenil";
        }else if(i >= 11 && i <= 15){
            return "Adolescente";
        }else if(i >= 16 && i <= 30){
            return "Adulto";
        }else if(i > 30 && i <= 100){
            return "Sênior";
        }else{
            return "Categoria indefinida";
        }
    }
    
    public void imprimirDados(){
        String ret = "Nome: " + this.getNome() +
                     "\nIdade: " + this.getIdade() +
                     "\nCategoria: " + this.verificaCategoria(this.getIdade());
        System.out.println(ret);
        
    }

}
