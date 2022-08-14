
import javax.swing.JFrame;
public class TelaBase extends JFrame {
    // construtor
    public TelaBase() {
        setSize(500, 300);
        setLocationRelativeTo(null); // JFrame no centro da tela
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }
}