
package exemplo3interface;

import javax.swing.JOptionPane;


public class Usuario extends Pessoa implements Seguranca, Imprimivel{
    private String nomeUsuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nomecompleto, int idade, String nomeUsuario, String senha) {
        super(nomecompleto, idade);
        this.setNomeUsuario(nomeUsuario);
        this.setSenha(senha);
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String formatoString(){
        String resp = "Nome completo: " + super.getNomecompleto();
        resp += NLIN + "Idade: " + super.getIdade();
        resp += NLIN + "Nome Usuário: " + this.getNomeUsuario();
        return resp;
    }
    
    @Override
    public void formatoSystemOut(){
        System.out.println("Nome completo: " + super.getNomecompleto() + "\nIdade: " + super.getIdade() + "\nNome Usuário: " + this.getNomeUsuario());
        
    }
    
    @Override
    public boolean validar(){
        if(this.senha.equals("")){
            JOptionPane.showMessageDialog(null, "Senha inválida!");
            return false;          
        }else if(this.nomeUsuario.equals("")){
            JOptionPane.showMessageDialog(null, "Nome usuário inválido!");
            return false; 
        }else{
            return true;
        }
    }
    
}
