
package view;

import javax.swing.JOptionPane;


public class Interface_Mensagens {
    
    public void Mensagem_Saindo(){
        JOptionPane.showMessageDialog (null, "Obrigado por jogar!", "Saindo...", JOptionPane.WARNING_MESSAGE);  
    }
    
    public void Mensagem_Regras(){
        JOptionPane.showMessageDialog (null, "1 - O quiz contém 10 questões de multipla escolha.\n 2 - Se você acertar até 7 questões estará apto para a sustentabilidade.\n 3 - Conforme a dificuldade selecionada por você o tempo de resposta para cada questão mudará:\nFÁCIL - 30 segundos.\nNORMAL - 20 segundos.\nDIFÍCIL - 10 segundos.", "Ajuda", JOptionPane.WARNING_MESSAGE);
    }
    
    public void Mensagem_ResultadosPositivo(int resultado){
        JOptionPane.showMessageDialog (null, "- Você obteve uma pontuação de " + resultado + "% de acerto" + "\n- Você está apto!", "Parabéns!", JOptionPane.PLAIN_MESSAGE);               
    }
    
    public void Mensagem_ResultadosNegativo(int resultado){
        JOptionPane.showMessageDialog (null, "- Você obteve uma pontuação de só " + resultado + "% de acerto" + "\n- Você não está apto!", "Que Pena!", JOptionPane.PLAIN_MESSAGE);               
    }
    
    public void Mensagem_Dificuldade(){
        JOptionPane.showMessageDialog (null, "Dificuldade inválida!", "Erro", JOptionPane.ERROR_MESSAGE); 
    }
    
}
