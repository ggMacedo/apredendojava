package alpooTeoAula04;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class TestandoEventos extends JFrame implements MouseMotionListener, KeyListener, ActionListener, MouseListener {
    // atributos
    private JLabel     lbl01, lbl02;
    private JTextField txtNome;
    private JButton    btnLogin, btnSair;
    private JPanel     pnl01, pnl02;
    private Color      cores[] = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
                                  Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    public TestandoEventos() {
        // configurando JFrame
        setSize(600, 300);
        setLocationRelativeTo(null);
        setLayout( new GridLayout(3, 2) );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        // instaciar JLabel
        lbl01 = new JLabel("Você sabe que dia é hoje? Passe o mouse sobre mim para saber!");
        lbl01.addMouseMotionListener( this );
        add( lbl01 );
        lbl02 = new JLabel("Clique em mim para mudar as cores dos painéis!");
        // instanciar JTextField
        txtNome = new JTextField("");
        txtNome.addKeyListener( this );
        add( txtNome );
        // instanciar JButton
        btnLogin = new JButton("Ok");
        btnLogin.addActionListener( this );
        add( btnLogin );
        btnSair = new JButton("Sair");
        btnSair.addActionListener( this );
        add( btnSair );
        // instanciar JPanel
        pnl01 = new JPanel( new FlowLayout() );
        pnl01.setBackground(Color.WHITE);
        pnl01.add( lbl02 );
        pnl01.addMouseListener( this );
        add( pnl01 );
        pnl02 = new JPanel();
        pnl02.setBackground(Color.BLACK);
        add( pnl02 );
        // exibe JFrame
        setVisible( true );
    }
    // main
    public static void main(String[] args) {
        new TestandoEventos();
    }
    // MÉTODOS ABSTRATOS PARA O MouseMotionListener
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved  (MouseEvent e) {
        lbl01.setText("Digite seu nome:");
    }
    // MÉTODOS ABSTRATOS PARA O KeyListener
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() >= KeyEvent.VK_0 && e.getKeyCode() <= KeyEvent.VK_9) {
            txtNome.setText( txtNome.getText().substring(0, txtNome.getText().length() - 1 ) );
        }
    }
    // MÉTODOS ABSTRATOS PARA O ActionListener
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSair) {
            JOptionPane.showMessageDialog(null, "Tchau!", "Fui...", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        else if (e.getSource() == btnLogin) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, " + txtNome.getText() + "!", "Login", JOptionPane.PLAIN_MESSAGE);
        }
    }
    // MÉTODOS ABSTRATOS PARA O MouseListener
    public void mouseClicked(MouseEvent e) {
        pnl01.setBackground( cores[(int)(Math.random() * cores.length)] );
        pnl02.setBackground( cores[(int)(Math.random() * cores.length)] );
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}