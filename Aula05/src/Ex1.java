//GABRIEL GOMES MACEDO N6598A4 CC4P33

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Ex1 extends TelaBaseEx01 implements ActionListener{

    private JButton btn1, btn2, btn3, btn4, btn5;
    private JPanel pnl01;

    public Ex1() {
    	pnl01 = new JPanel(new FlowLayout());
    	pnl01.setBackground(Color.WHITE);

        btn1 = new JButton("Vermelho");
        btn1.addActionListener(this);
        btn2 = new JButton("Azul");
        btn2.addActionListener(this);
        btn3 = new JButton("Verde");
        btn3.addActionListener(this);
        btn4 = new JButton("Amarelo");
        btn4.addActionListener(this);
        btn5 = new JButton("Sair");
        btn5.addActionListener(this);

        pnl01.add(btn1);
        pnl01.add(btn2);
        pnl01.add(btn3);
        pnl01.add(btn4);
        pnl01.add(btn5);
        add(pnl01);
        
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new Ex1();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            pnl01.setBackground(Color.RED);
        }else if (e.getSource() == btn2) {
        	pnl01.setBackground(Color.BLUE);
        }else if (e.getSource() == btn3) {
        	pnl01.setBackground(Color.green);
        }else if (e.getSource() == btn4) {
        	pnl01.setBackground(Color.YELLOW);
        }else if (e.getSource() == btn5) {
        	System.exit(0);
        }
    }
}