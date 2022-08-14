//GABRIEL GOMES MACEDO N6598A4 CC4P33

import java.awt.FlowLayout;
import javax.swing.JButton;


public class Ex1 extends TelaEx01 {

    private FlowLayout tela;
    private JButton    btn1, btn2, btn3, btn4, btn5;

    public Ex1() {

        tela = new FlowLayout();
        tela.setAlignment(FlowLayout.RIGHT);

        setLayout(tela);

        btn1 = new JButton("Vermelho");
        btn2 = new JButton("Azul");
        btn3 = new JButton("Amarelo");
        btn4 = new JButton("Verde");
        btn5 = new JButton("Sair");

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        setVisible(true);
    }

    
    public static void main(String[] args) {
        new Ex1();
    }
}