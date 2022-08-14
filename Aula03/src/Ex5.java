//GABRIEL GOMES MACEDO N6598A4 CC4P33


import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class Ex5 extends TelaEx5 {

    private BorderLayout tela;
    private GridLayout   telaBotoes;
    private JLabel       telaConfig;
    private JButton	btnPct, btnCE, btnC, btnVoltar, btnMeio, btnQuad, 
    btnRaiz, btnDivi, btn7, btn8, btn9, btnMult, btn4, btn5, btn6, 
    btnSubt, btn1, btn2, btn3, btnSoma, btnMaMe, btn0, btnPto, btnIgual;
    private JPanel Botoes;

    public Ex5() {

        tela   = new BorderLayout();
        telaBotoes = new GridLayout(6, 4);

        telaConfig = new JLabel("0");
        telaConfig.setHorizontalAlignment(SwingConstants.RIGHT);
        telaConfig.setFont(new Font("Arial", Font.BOLD, 50));

        btnPct	= new JButton("%");
        btnCE	= new JButton("CE");
        btnC	= new JButton("C");
        btnVoltar	= new JButton("Voltar");
        btnMeio	= new JButton("1/2");
        btnQuad	= new JButton("x^2");
        btnRaiz	= new JButton("Raiz");
        btnDivi	= new JButton("/");
        btn7	= new JButton("7");
        btn8	= new JButton("8");
        btn9	= new JButton("9");
        btnMult	= new JButton("X");
        btn4	= new JButton("4");
        btn5	= new JButton("5");
        btn6	= new JButton("6");
        btnSubt	= new JButton("-");
        btn1	= new JButton("1");
        btn2	= new JButton("2");
        btn3	= new JButton("3");
        btnSoma = new JButton("+");
        btnMaMe = new JButton("+/-");
        btn0    = new JButton("0");
        btnPto  = new JButton(".");
        btnIgual = new JButton("=");

        Botoes = new JPanel(telaBotoes);

        Botoes.add(btnPct);
        Botoes.add(btnCE);
        Botoes.add(btnC);
        Botoes.add(btnVoltar);
        Botoes.add(btnMeio);
        Botoes.add(btnQuad);
        Botoes.add(btnRaiz);
        Botoes.add(btnDivi);
        Botoes.add(btn7);
        Botoes.add(btn8);
        Botoes.add(btn9);
        Botoes.add(btnMult);
        Botoes.add(btn4);
        Botoes.add(btn5);
        Botoes.add(btn6);
        Botoes.add(btnSubt);
        Botoes.add(btn1);
        Botoes.add(btn2);
        Botoes.add(btn3);
        Botoes.add(btnSoma);
        Botoes.add(btnMaMe);
        Botoes.add(btn0);
        Botoes.add(btnPto);
        Botoes.add(btnIgual);

        setLayout(tela);

        add(BorderLayout.NORTH, telaConfig);
        add(BorderLayout.CENTER, Botoes);
 
        setSize(200, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex5();
    }
}