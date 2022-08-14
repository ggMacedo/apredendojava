
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
public class Calculadora extends TelaBase {
    // atributos
    private GridLayout glMain, glBotoes;
    private JTextField txtNumero1, txtNumero2;
    private JLabel     lblResultado;
    private JButton    btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    private JPanel     pnlBotoes;
    // construtor
    public Calculadora() {
        // instanciar os layouts
        glMain   = new GridLayout(4, 1, 5, 5);
        glBotoes = new GridLayout(1, 4);
        // vincular layout no JFrame
        setLayout( glMain );
        // instanciar componentes
        txtNumero1     = new JTextField("");
        txtNumero2     = new JTextField("");
        lblResultado   = new JLabel("0");
        btnSomar       = new JButton("+");
        btnSubtrair    = new JButton("-");
        btnMultiplicar = new JButton("X");
        btnDividir     = new JButton("/");
        // instanciar o JPanel
        pnlBotoes = new JPanel( glBotoes );
        // adicionar os botoes no JPanel
        pnlBotoes.add( btnSomar );
        pnlBotoes.add( btnSubtrair );
        pnlBotoes.add( btnMultiplicar );
        pnlBotoes.add( btnDividir );
        // adicionar componentes no JFrame
        add( lblResultado );
        add( txtNumero1 );
        add( txtNumero2 );
        add( pnlBotoes );
        // exibir JFrame
        setResizable(false); // não permite redimensionar o JFrame
        setVisible(true);
    }
    // main
    public static void main(String[] args) {
        new Calculadora();
    }
}