
package exemplo3interface;

import javax.swing.JOptionPane;

public class Produto implements Seguranca, Imprimivel{
    private String descricao;
    private int quantidade;

    public Produto(String descricao, int quantidade) {
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String formatoString(){
        String resp = "Descrição: " + this.getDescricao();
        resp += NLIN + "Quantidade: " + this.getQuantidade();
        return resp;
    }
    
    @Override
    public void formatoSystemOut(){
        System.out.println("Descrição: " + this.getDescricao() + "\nQuantidade: " + this.getQuantidade());
    }
    
    @Override
    public boolean validar(){
        if(this.quantidade < 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!");
            return false;
        }else if(this.descricao.equals("") || this.descricao.length()<3){
            JOptionPane.showMessageDialog(null, "Descrição inválida!");
            return false;
        }else{
            return true;
        }
    }
    
    
    
}
