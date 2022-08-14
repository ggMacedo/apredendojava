
package prjexemploheranca;

public class PessoaFisica extends Pessoa{
    private String cpf;
    
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void imprimirDados(){
        System.out.println("Nome "+ super.getNome());
        System.out.println("CPF "+ this.getCpf());
    }

    
    
    
    
    
    
}
