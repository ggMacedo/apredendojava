/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabri
 */
public class Paciente {
    private String nome;
    private String ra;
    private String endereco;
    private String telefone;
    private String dataNscimento;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
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

    public String getDataNscimento() {
        return dataNscimento;
    }

    public void setDataNscimento(String dataNscimento) {
        this.dataNscimento = dataNscimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Paciente() {
 
    }
    
    public Paciente(String nome) {
        this.setNome(nome);
        
    }
    
    public String ImprimirDados(){
        String ret = "Nome do paciente: " + this.getNome();
        return ret; 
    }
    
    
    
}
