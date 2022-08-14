
import java.awt.FlowLayout;
import javax.swing.JButton;
public class Ex01 extends TelaBase {
    // atributos
    private FlowLayout fl;
    private JButton    btnRed, btnBlu, btnGre, btnYel, btnEnd;
    // construtor
    public Ex01() {
        // instanciar o layout
        fl = new FlowLayout();
        fl.setAlignment( FlowLayout.RIGHT );
        // vincular layout ao JFrame
        setLayout( fl );
        // instanciar os botoes
        btnRed = new JButton("Vermelho");
        btnBlu = new JButton("Azul");
        btnYel = new JButton("Amarelo");
        btnGre = new JButton("Verde");
        btnEnd = new JButton("Sair");
        // adcionar botoes no JFrame
        add( btnRed );
        add( btnBlu );
        add( btnGre );
        add( btnYel );
        add( btnEnd );
        // exibe JFrame
        setVisible(true);
    }
    // main
    public static void main(String[] args) {
        new Ex01();
    }
}