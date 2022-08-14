//GABRIEL GOMES MACEDO N6598A4 CC4P33

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Ex3 extends TelaBaseEx3{

    private GridLayout tela, telaBotoes;
    private JTextField txtN1, txtN2;
    private JLabel     lblResult;
    private JButton    btnSoma, btnSubtrai, btnMultiplica, btnDividi;
    private JPanel     Botoes;

    public Ex3() {
  
        tela  = new GridLayout(4, 1, 5, 5);
        telaBotoes = new GridLayout(1, 4);

        setLayout(tela);

        txtN1	= new JTextField("");
        txtN2	= new JTextField("");
        lblResult	= new JLabel("0");
        btnSoma	= new JButton("+");
        btnSubtrai	= new JButton("-");
        btnMultiplica	= new JButton("X");
        btnDividi	= new JButton("/");

        Botoes = new JPanel(telaBotoes);

        Botoes.add(btnSoma);
        Botoes.add(btnSubtrai);
        Botoes.add(btnMultiplica);
        Botoes.add(btnDividi);

        add(lblResult);
        add(txtN1);
        add(txtN2);
        add(Botoes);

        setResizable(false); 
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex3();
    }
}