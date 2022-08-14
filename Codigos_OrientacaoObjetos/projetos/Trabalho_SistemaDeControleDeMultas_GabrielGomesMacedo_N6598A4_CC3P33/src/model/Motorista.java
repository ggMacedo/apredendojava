
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GABRIEL GOMES MACEDO RA: N6598A4 TURMA: CC3P33
 */
public class Motorista {
    private String nome;
    private String cpf;
    private int idade;
    private String endereco;
    private String telefone;
    private String n_multa;
    Scanner leia = new Scanner(System.in);
    char controle = 's';
    
    public Motorista(){
        
    }
 
    public Motorista(String n, String cpf, int i, String e, String t, String n_m) {
        this.setNome(n);
        this.setCpf(cpf);
        this.setIdade(i);
        this.setEndereco(e);
        this.setTelefone(t);
        this.setN_multa(n_m);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String c) {
        this.cpf = c;
      
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getN_multa() {
        return n_multa;
    }

    public void setN_multa(String n_multa) {
        this.n_multa = n_multa;
    }
    
    public void cadastraMotorista(ArrayList<Motorista> listaMotorista){
        do{
            try{
                System.out.println("Digite o nome do motoristar que deseja cadastrar: ");
                String n = leia.next();
                System.out.println("Digite o CPF do motorista que deseja cadastrar: ");
                String cpf = leia.next();
                System.out.println("Digite a idade do motorista que deseja cadastrar: ");
                int i = leia.nextInt();
                System.out.println("Digite o endereço do motorista que deseja cadastrar: ");
                String e = leia.next();
                System.out.println("Digite o telefone do motorista que deseja cadastrar: ");
                String t = leia.next();
                System.out.println("Digite o número da multa que o motorista recebeu: ");
                String n_m = leia.next();
                Motorista m6 = new Motorista(n, cpf, i, e, t, n_m);
                listaMotorista.add(m6);
                System.out.println("Deseja cadastrar outro motorista? (S/N)");
                controle = leia.next().charAt(0);
            }catch(Exception e){
                System.out.print("Erro: " + e);
                break;   
            }
        }while(controle == 's' || controle == 'S');
    }
    
    public void consultaMotorista(ArrayList<Motorista> listaMotorista){
        if(listaMotorista.isEmpty()){
            System.out.println("Não existe motoristas registrados.");
        }else{
            for(Motorista h:listaMotorista){
                System.out.println("\nMotorista N° - " + listaMotorista.indexOf(h));
                System.out.println("Nome: " + h.getNome());
                System.out.println("CPF: " + h.getCpf());
                System.out.println("Idade: " + h.getIdade());
                System.out.println("Endereço: " + h.getEndereco());
                System.out.println("Telefone: " + h.getTelefone());
                System.out.println("Número de multas que o motorista possui: " + h.getN_multa());
            }
        }
        
    }
 
}
