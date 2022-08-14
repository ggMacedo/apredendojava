
package view;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Interface_Quiz {
    
    //ATRIBUTOS DA INTERFACE
    private JFrame tela = new JFrame();
    private JTextField campoNumeroQuestao = new JTextField();
    private JTextArea campoQuestao = new JTextArea();
    private JButton botaoA = new JButton();
    private JButton botaoB = new JButton();
    private JButton botaoC = new JButton();
    private JButton botaoD = new JButton();
    private JLabel resposta_labelA = new JLabel();
    private JLabel resposta_labelB = new JLabel();
    private JLabel resposta_labelC = new JLabel();
    private JLabel resposta_labelD = new JLabel();
    private JLabel tempo_label = new JLabel();
    private JLabel secundos = new JLabel();
    private JTextField numeroAcertos = new JTextField();
    private JTextField porcentagem = new JTextField();
    Interface_Mensagens m = new Interface_Mensagens();//INSTÂNCIA O OBJETO DA INTERFACE DE MENSAGENS
 
    //MÉTODOS GET E SET
        public JFrame getTela() {
            return this.tela;
        }

        public void setTela(JFrame t) {
            this.tela = t;
        }

        public JTextField getCampoNumeroQuestao() {
            return this.campoNumeroQuestao;
        }

        public void setCampoNumeroQuestao(JTextField campoNumeroQuestao) {
            this.campoNumeroQuestao = campoNumeroQuestao;
        }

        public JTextArea getCampoQuestao() {
            return this.campoQuestao;
        }

        public void setCampoQuestao(JTextArea campoQuestao) {
            this.campoQuestao = campoQuestao;
        }
        
        public JButton getBotaoA() {
            return this.botaoA;
        }

        public void setBotaoA(JButton botaoA) {
            this.botaoA = botaoA;
        }

        public JButton getBotaoB() {
            return this.botaoB;
        }

        public void setBotaoB(JButton botaoB) {
            this.botaoB = botaoB;
        }

        public JButton getBotaoC() {
            return this.botaoC;
        }

        public void setBotaoC(JButton botaoC) {
            this.botaoC = botaoC;
        }

        public JButton getBotaoD() {
            return this.botaoD;
        }

        public void setButtonD(JButton botaoD) {
            this.botaoD = botaoD;
        }

        public JLabel getResposta_labelA() {
            return this.resposta_labelA;
        }

        public void setResposta_labelA(JLabel resposta_labelA) {
            this.resposta_labelA = resposta_labelA;
        }

        public JLabel getResposta_labelB() {
            return this.resposta_labelB;
        }

        public void setResposta_labelB(JLabel resposta_labelB) {
            this.resposta_labelB = resposta_labelB;
        }

        public JLabel getResposta_labelC() {
            return this.resposta_labelC;
        }

        public void setResposta_labelC(JLabel resposta_labelC) {
            this.resposta_labelC = resposta_labelC;
        }

        public JLabel getResposta_labelD() {
            return this.resposta_labelD;
        }

        public void setResposta_labelD(JLabel resposta_labelD) {
            this.resposta_labelD = resposta_labelD;
        }

        public JLabel getTempo_label() {
            return this.tempo_label;
        }

        public void setTempo_label(JLabel tempo_label) {
            this.tempo_label = tempo_label;
        }

        public JLabel getSecundos() {
            return this.secundos;
        }

        public void setSecundos(JLabel secundos) {
            this.secundos = secundos;
        }

        public JTextField getNumeroAcertos() {
            return this.numeroAcertos;
        }

        public void setNumeroAcertos(JTextField numeroAcertos) {
            this.numeroAcertos = numeroAcertos;
        }

        public JTextField getPorcentagem() {
            return this.porcentagem;
        }

        public void setPorcentagem(JTextField porcentagem) {
            this.porcentagem = porcentagem;
        }
    //--------------------------------------------------------------------------------------//
    
    //CONSTRUTOR COM AS CONFIGURAÇÕES DE INTERFACE DAS PERGUNTAS
        public Interface_Quiz() {

            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setSize(750,750);
            tela.getContentPane().setBackground(new Color(229, 179, 82));
            tela.setLayout(null);
            tela.setResizable(false);
            
            campoNumeroQuestao.setBounds(0,0,750,50);
            campoNumeroQuestao.setBackground(new Color(224,161,35));
            campoNumeroQuestao.setForeground(new Color(255,255,255));
            campoNumeroQuestao.setFont(new Font("Arial",Font.BOLD,30));
            campoNumeroQuestao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            campoNumeroQuestao.setHorizontalAlignment(JTextField.CENTER);
            campoNumeroQuestao.setEditable(false);

            campoQuestao.setBounds(0,80,750,80);
            campoQuestao.setLineWrap(true);
            campoQuestao.setWrapStyleWord(true);
            campoQuestao.setBackground(new Color(224,161,35));
            campoQuestao.setForeground(new Color(255,255,255));
            campoQuestao.setFont(new Font("Arial",Font.BOLD,20));
            campoQuestao.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            campoQuestao.setEditable(false);

            botaoA.setBounds(10,200,100,100);
            botaoA.setFont(new Font("Arial",Font.BOLD,30));
            botaoA.setFocusable(false);
            botaoA.setText("A");
            botaoA.setBackground(new java.awt.Color(63, 72, 204));
            botaoA.setForeground(new java.awt.Color(255,255,255));
            botaoA.setBorder(BorderFactory.createLineBorder(Color.black));
            botaoA.addMouseListener(new java.awt.event.MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
      
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    botaoA.setBorder(BorderFactory.createLineBorder(Color.white));   
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    botaoA.setBorder(BorderFactory.createLineBorder(Color.black));
                }
            });
           
            botaoB.setBounds(10,300,100,100);
            botaoB.setFont(new Font("Arial",Font.BOLD,30));
            botaoB.setFocusable(false);
            botaoB.setText("B");
            botaoB.setBackground(new java.awt.Color(63, 72, 204));
            botaoB.setForeground(new java.awt.Color(255,255,255));
            botaoB.setBorder(BorderFactory.createLineBorder(Color.black));
            botaoB.addMouseListener(new java.awt.event.MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
      
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    botaoB.setBorder(BorderFactory.createLineBorder(Color.white));   
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    botaoB.setBorder(BorderFactory.createLineBorder(Color.black));
                }
            });

            botaoC.setBounds(10,400,100,100);
            botaoC.setFont(new Font("Arial",Font.BOLD,30));
            botaoC.setFocusable(false);
            botaoC.setText("C");
            botaoC.setBackground(new java.awt.Color(63, 72, 204));
            botaoC.setForeground(new java.awt.Color(255,255,255));
            botaoC.setBorder(BorderFactory.createLineBorder(Color.black));
            botaoC.addMouseListener(new java.awt.event.MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
      
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    botaoC.setBorder(BorderFactory.createLineBorder(Color.white));   
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    botaoC.setBorder(BorderFactory.createLineBorder(Color.black));
                }
            });
            
            botaoD.setBounds(10,500,100,100);
            botaoD.setFont(new Font("Arial",Font.BOLD,30));
            botaoD.setFocusable(false);
            botaoD.setText("D");
            botaoD.setBackground(new java.awt.Color(63, 72, 204));
            botaoD.setForeground(new java.awt.Color(255,255,255));
            botaoD.setBorder(BorderFactory.createLineBorder(Color.black));
            botaoD.addMouseListener(new java.awt.event.MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
      
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    botaoD.setBorder(BorderFactory.createLineBorder(Color.white));   
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    botaoD.setBorder(BorderFactory.createLineBorder(Color.black));
                }
            });

            resposta_labelA.setBounds(125,200,500,100);
            resposta_labelA.setBackground(new Color(50,50,50));
            resposta_labelA.setForeground(new Color(92,152,18));
            resposta_labelA.setFont(new Font("Arial",Font.BOLD,20));

            resposta_labelB.setBounds(125,300,500,100);
            resposta_labelB.setBackground(new Color(50,50,50));
            resposta_labelB.setForeground(new Color(92,152,18));
            resposta_labelB.setFont(new Font("Arial",Font.BOLD,20));

            resposta_labelC.setBounds(125,400,500,100);
            resposta_labelC.setBackground(new Color(50,50,50));
            resposta_labelC.setForeground(new Color(92,152,18));
            resposta_labelC.setFont(new Font("Arial",Font.BOLD,20));

            resposta_labelD.setBounds(125,500,500,100);
            resposta_labelD.setBackground(new Color(50,50,50));
            resposta_labelD.setForeground(new Color(92,152,18));
            resposta_labelD.setFont(new Font("Arial",Font.BOLD,20));

            secundos.setBounds(635,610,100,100);
            secundos.setBackground(new Color(224,161,35));
            secundos.setForeground(new Color(196,10,10));
            secundos.setFont(new Font("Arial",Font.BOLD,20));
            secundos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            secundos.setOpaque(true);
            secundos.setHorizontalAlignment(JTextField.CENTER);
            secundos.setText(String.valueOf(secundos));

            tempo_label.setBounds(635,575,100,25);
            tempo_label.setBackground(new Color(50,50,50));
            tempo_label.setForeground(new Color(196,10,10));
            tempo_label.setFont(new Font("Arial",Font.BOLD,20));
            tempo_label.setHorizontalAlignment(JTextField.CENTER);
            tempo_label.setText("Tempo");

            numeroAcertos.setBounds(280,225,200,100);
            numeroAcertos.setBackground(new Color(224,161,35));
            numeroAcertos.setForeground(new Color(92,152,18));
            numeroAcertos.setFont(new Font("Arial",Font.BOLD,20));
            numeroAcertos.setBorder(BorderFactory.createBevelBorder(1));
            numeroAcertos.setHorizontalAlignment(JTextField.CENTER);
            numeroAcertos.setEditable(false);

            porcentagem.setBounds(280,325,200,100);
            porcentagem.setBackground(new Color(224,161,35));
            porcentagem.setForeground(new Color(92,152,18));
            porcentagem.setFont(new Font("Arial",Font.BOLD,20));
            porcentagem.setBorder(BorderFactory.createBevelBorder(1));
            porcentagem.setHorizontalAlignment(JTextField.CENTER);
            porcentagem.setEditable(false);

            tela.add(tempo_label);
            tela.add(secundos);
            tela.add(resposta_labelA);
            tela.add(resposta_labelB);
            tela.add(resposta_labelC);
            tela.add(resposta_labelD);
            tela.add(botaoA);
            tela.add(botaoB);
            tela.add(botaoC);
            tela.add(botaoD);
            tela.add(campoQuestao);
            tela.add(campoNumeroQuestao);
            tela.setVisible(true);   
        }
    //-------------------------------------------------------------------------------------------------------------//
    
}
