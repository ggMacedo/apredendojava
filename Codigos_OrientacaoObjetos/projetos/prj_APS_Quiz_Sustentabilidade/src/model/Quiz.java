
package model;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import view.*;

public class Quiz extends Perguntas implements ActionListener, mascara_Quiz{
    
    //ATRIBUTOS
        private int resultado;
        private int secundos=0;
        private int respostasCorretas = 0;
        private int dificuldade = 0;
    //------------------------------------------------------------------------------------------//
        
    Interface_Quiz inter = new Interface_Quiz();//INSTÂNCIA O OBJETO DA INTERFACE DE PERGUNTAS
    Interface_Menu menu = new Interface_Menu();//INSTÂNCIA O OBJETO DA INTERFACE DE MENU
    Interface_Mensagens m = new Interface_Mensagens();//INSTÂNCIA O OBJETO DA INTERFACE DE MENSAGENS
    
    //CONSTRUTOR
        public Quiz(int d) {
            this.dificuldade = d;
            validar_Dificuldade();
            tempoDificuldade();
            geraEventoClick();
            proximaPergunta();
        }    
    //----------------------------------------------------------------------------------------------------//
        
    //MÉTODOS GET E SET
        @Override
        public int getResultado() {
            return this.resultado;
        }
        @Override
        public void setResultado(int resultado) {
            this.resultado = resultado;
        }
        @Override
        public int getSecundos() {
            return this.secundos;
        }
        @Override
        public void setSecundos(int secundos) {
            this.secundos = secundos;
        }
        @Override
        public int getRespostasCorretas() {
            return this.respostasCorretas;
        }
        @Override
        public void setRespostasCorretas(int respostasCorretas) {
            this.respostasCorretas = respostasCorretas;
        }
        @Override
        public int getDificuldade() {
            return this.dificuldade;
        }
        @Override
        public void setDificuldade(int dificuldade) {
            this.dificuldade = dificuldade;
        } 
    //--------------------------------------------------------------------------------------------------------------//
        
    //VALIDA A DIFICULDADE SELECIONADA
        @Override
        public void validar_Dificuldade(){
            if(this.dificuldade != 1 && this.dificuldade != 2 && this.dificuldade != 3){
                m.Mensagem_Dificuldade();
                System.exit(0);
            }
        }
    //--------------------------------------------------------------------------------------------------------//    
    //MÉTODO PARA ADICIONAR CLICK AOS BOTÕES DA PERGUNTA    
        public void geraEventoClick(){
            inter.getBotaoA().addActionListener(this);
            inter.getBotaoB().addActionListener(this); 
            inter.getBotaoC().addActionListener(this);
            inter.getBotaoD().addActionListener(this);
        }
   //---------------------------------------------------------------------------------------------------//   
        
    //METODO QUE MUDA O TEMPO CONFORME A DIFICULDADE SELECIONADA    
        public void tempoDificuldade(){
            if(dificuldade == 1){
                setSecundos(31);
            }else if(dificuldade == 2){
                setSecundos(21);
            }else if(dificuldade == 3){
                setSecundos(11);
            }else{
                setSecundos(60);
            }  
        }
    //------------------------------------------------------------------------------------------------------------//
        
    //OBJETO INSTANCIADO DA CLASSE ActionListener PARA COMEÇAR CONTAGEM DE TEMPO PARA O USUÁRIO RESPONDER AS PERGUNTAS 
        Timer tempo = new Timer(1000, new ActionListener() {
            @Override//Polimorfismo - Sobreposição do método "actionPerformed" da classe ActionListener para capturar click do usuário
            public void actionPerformed(ActionEvent e) {
                secundos--;
                inter.getSecundos().setText(String.valueOf(secundos));
                if(secundos<=0) {
                        verificaRespostas();
                }
            }
        });

    //------------------------------------------------------------------------//
        
    //MÉTODO QUE GERA AS QUESTÕES
        public void proximaPergunta() {
		
            if(super.getIndex()>=super.getTotalPerguntas()) {
                resultados();
            }
            else {
                inter.getCampoNumeroQuestao().setText("Questão "+(super.getIndex()+1));
                inter.getCampoQuestao().setText(super.getQuestoes()[super.getIndex()]);
                inter.getResposta_labelA().setText(super.getOpcoesResp()[super.getIndex()][0]);
                inter.getResposta_labelB().setText(super.getOpcoesResp()[super.getIndex()][1]);
                inter.getResposta_labelC().setText(super.getOpcoesResp()[super.getIndex()][2]);
                inter.getResposta_labelD().setText(super.getOpcoesResp()[super.getIndex()][3]);
                tempoDificuldade();
                tempo.start();
            }
	}
    //---------------------------------------------------------------------------------//
        
    //MÉTODO PARA VER SE O USUÁRIO ACERTOU A PERGUNTA
	@Override //Polimorfismo - Sobreposição do método "actionPerformed" da classe ActionListener para capturar o click do usuário
	public void actionPerformed(ActionEvent e) {
		
            inter.getBotaoA().setEnabled(false);
            inter.getBotaoB().setEnabled(false);
            inter.getBotaoC().setEnabled(false);
            inter.getBotaoD().setEnabled(false);

            if(e.getSource()==inter.getBotaoA()) {
                super.setResposta('A');
                if(super.getResposta() == super.getOpcoesCertas()[super.getIndex()]) {
                    this.respostasCorretas++;
                }
            }
            if(e.getSource()==inter.getBotaoB()) {
                super.setResposta('B');
                if(super.getResposta() == super.getOpcoesCertas()[super.getIndex()]) {
                    this.respostasCorretas++;
                }
            }
            if(e.getSource()==inter.getBotaoC()) {
                super.setResposta('C');
                if(super.getResposta() == super.getOpcoesCertas()[super.getIndex()]) {
                    this.respostasCorretas++;
                }
            }
            if(e.getSource()==inter.getBotaoD()) {
                super.setResposta('D');
                if(super.getResposta() == super.getOpcoesCertas()[super.getIndex()]) {
                    this.respostasCorretas++;
                }
            }
            verificaRespostas();
	}
    //-----------------------------------------------------------------------------------------------//
        
    //MÉTODO QUE VERIFICA AS RESPOSTAS DO USUÁRIO E ALTERA A COR DAS ALTERNATIVAS PARA VERMELHO OU VERDE
	public void verificaRespostas() {
		
            tempo.stop();

            inter.getBotaoA().setEnabled(false);
            inter.getBotaoB().setEnabled(false);
            inter.getBotaoC().setEnabled(false);
            inter.getBotaoD().setEnabled(false);

            if(super.getOpcoesCertas()[super.getIndex()] != 'A')
                inter.getResposta_labelA().setForeground(new Color(196,10,10));
            if(super.getOpcoesCertas()[super.getIndex()] != 'B')
                inter.getResposta_labelB().setForeground(new Color(196,10,10));
            if(super.getOpcoesCertas()[super.getIndex()] != 'C')
                inter.getResposta_labelC().setForeground(new Color(196,10,10));
            if(super.getOpcoesCertas()[super.getIndex()] != 'D')
                inter.getResposta_labelD().setForeground(new Color(196,10,10));

            Timer pausa = new Timer(2000, new ActionListener() {//OBJETO INSTANCIADO DA CLASSE ActionListener PARA PAUSAR A CONTAGEM DE TEMPO DEPOIS DO USUÁRIO RESPONDER AS PERGUNTAS
                    
                @Override //Polimorfismo - Sobreposição do método "actionPerformed" da classe ActionListener para capturar o click do usuário
                public void actionPerformed(ActionEvent e) {
                    inter.getResposta_labelA().setForeground(new Color(92,152,18));
                    inter.getResposta_labelB().setForeground(new Color(92,152,18));
                    inter.getResposta_labelC().setForeground(new Color(92,152,18));
                    inter.getResposta_labelD().setForeground(new Color(92,152,18));

                    setResposta(' ');
                    inter.getSecundos().setText(String.valueOf(secundos));
                    inter.getBotaoA().setEnabled(true);
                    inter.getBotaoB().setEnabled(true);
                    inter.getBotaoC().setEnabled(true);
                    inter.getBotaoD().setEnabled(true);
                    setIndex(getIndex() + 1);
                    proximaPergunta();
                }
            });
            pausa.setRepeats(false);
            pausa.start();
	}
    //------------------------------------------------------------------------------------------------------//
        
    //MÉTODO QUE TRAZ OS RESULTADOS DO QUIZ
        public void resultados(){
            inter.getCampoQuestao().setVisible(false);
            inter.getBotaoA().setVisible(false);
            inter.getBotaoB().setVisible(false);
            inter.getBotaoC().setVisible(false);
            inter.getBotaoD().setVisible(false);
            inter.getSecundos().setVisible(false);
            inter.getTempo_label().setVisible(false);

            resultado = (int)((respostasCorretas/(double)super.getTotalPerguntas())*100);
            
            inter.getCampoNumeroQuestao().setText("Resultados do Quiz!");
            inter.getResposta_labelA().setText("");
            inter.getResposta_labelB().setText("");
            inter.getResposta_labelC().setText("");
            inter.getResposta_labelD().setText("");
            
            if(resultado >= 70){
                    inter.getNumeroAcertos().setText("("+respostasCorretas+"/"+super.getTotalPerguntas()+")");
                    inter.getPorcentagem().setText(resultado+"%");
                    inter.getTela().add(inter.getNumeroAcertos());
                    inter.getTela().add(inter.getPorcentagem());
                    m.Mensagem_ResultadosPositivo(resultado);
                    inter.getTela().setVisible(false); 
            }else{
                inter.getNumeroAcertos().setForeground(new Color(196,10,10));
                inter.getPorcentagem().setForeground(new Color(196,10,10));
                inter.getNumeroAcertos().setText("("+respostasCorretas+"/"+super.getTotalPerguntas()+")");
                inter.getPorcentagem().setText(resultado+"%");
                inter.getTela().add(inter.getNumeroAcertos());
                inter.getTela().add(inter.getPorcentagem());
                m.Mensagem_ResultadosNegativo(resultado);
                inter.getTela().setVisible(false);
            }
            menu.setVisible(true); 
        }
    //------------------------------------------------------------------------------------//
}