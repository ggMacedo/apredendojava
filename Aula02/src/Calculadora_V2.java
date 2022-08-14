
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
public class Calculadora_V2 extends TelaBase {
    // atributos
    private BorderLayout blMain;
    private GridLayout   glBotoes;
    private JLabel       lblDisplay;
    private JButton      btnPct, btnCE, btnC, btnBack,
                         btnMeio, btnQuad, btnRaiz, btnDivi,
                         btn7, btn8, btn9, btnMult,
                         btn4, btn5, btn6, btnSubt,
                         btn1, btn2, btn3, btnSoma,
                         btnMaMe, btn0, btnPto, btnIgual;
    private JPanel pnlBotoes;
    // construtor
    public Calculadora_V2() {
        // instanciar layouts
        blMain   = new BorderLayout();
        glBotoes = new GridLayout(6, 4);
        // instanciar JLabel
        lblDisplay = new JLabel("0");
        lblDisplay.setHorizontalAlignment( SwingConstants.RIGHT );
        lblDisplay.setFont( new Font("Calibri", Font.BOLD, 50) );
        // instanciar os botoes
        btnPct   = new JButton("%");
        btnCE    = new JButton("CE");
        btnC     = new JButton("C");
        btnBack  = new JButton("Back");
        btnMeio  = new JButton("1/2");
        btnQuad  = new JButton("x^2");
        btnRaiz  = new JButton("Raiz");
        btnDivi  = new JButton("/");
        btn7     = new JButton("7");
        btn8     = new JButton("8");
        btn9     = new JButton("9");
        btnMult  = new JButton("X");
        btn4     = new JButton("4");
        btn5     = new JButton("5");
        btn6     = new JButton("6");
        btnSubt  = new JButton("-");
        btn1     = new JButton("1");
        btn2     = new JButton("2");
        btn3     = new JButton("3");
        btnSoma  = new JButton("+");
        btnMaMe  = new JButton("+/-");
        btn0     = new JButton("0");
        btnPto   = new JButton(".");
        btnIgual = new JButton("=");
        // instanciar JPanel
        pnlBotoes = new JPanel( glBotoes );
        // adicionar botoes no JPanel
        pnlBotoes.add( btnPct );
        pnlBotoes.add( btnCE );
        pnlBotoes.add( btnC );
        pnlBotoes.add( btnBack );
        pnlBotoes.add( btnMeio );
        pnlBotoes.add( btnQuad );
        pnlBotoes.add( btnRaiz );
        pnlBotoes.add( btnDivi );
        pnlBotoes.add( btn7 );
        pnlBotoes.add( btn8 );
        pnlBotoes.add( btn9 );
        pnlBotoes.add( btnMult );
        pnlBotoes.add( btn4 );
        pnlBotoes.add( btn5 );
        pnlBotoes.add( btn6 );
        pnlBotoes.add( btnSubt );
        pnlBotoes.add( btn1 );
        pnlBotoes.add( btn2 );
        pnlBotoes.add( btn3);
        pnlBotoes.add( btnSoma );
        pnlBotoes.add( btnMaMe );
        pnlBotoes.add( btn0 );
        pnlBotoes.add( btnPto );
        pnlBotoes.add( btnIgual );
        // determinar o layout do JFrame
        setLayout( blMain );
        // adicionar componentes no JFrame
        add( BorderLayout.NORTH, lblDisplay );
        add( BorderLayout.CENTER, pnlBotoes );
        // visualiza JFrame
        setSize(200, 300);
        setVisible(true);
    }
    // main
    public static void main(String[] args) {
        new Calculadora_V2();
    }
}