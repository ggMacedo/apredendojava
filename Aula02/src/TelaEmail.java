
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
public class TelaEmail extends TelaBase {
    // atributos
    private JLabel     lbl01, lbl02;
    private JTextField txtNome, txtEmail;
    private JButton    btnCancelar, btnOk;
    // construtor
    public TelaEmail() {
        // determinar JFrame sem Layout
        setLayout( null );
        // alterar o título do JFrame
        setTitle("Email");
        // tamanho da tela
        setSize(300, 200);
        // instanciar os componentes
        lbl01 = new JLabel("Nome");
        lbl01.setBounds(20, 50, 50, 20);
        lbl02 = new JLabel("Email");
        lbl02.setBounds(20, 80, 50, 20);
        txtNome = new JTextField("");
        txtNome.setBounds(100, 50, 170, 20);
        txtEmail = new JTextField("");
        txtEmail.setBounds(100, 80, 170, 20);
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(20, 120, 120, 20);
        btnOk = new JButton("Ok");
        btnOk.setBounds(150, 120, 120, 20);
        // adicionar os componentes no JFrame
        add( lbl01 );
        add( lbl02 );
        add( txtNome );
        add( txtEmail );
        add( btnCancelar );
        add( btnOk );
        // exibir JFrame
        setVisible(true);
    }
    
    // main
    public static void main(String[] args) {
        new TelaEmail();
    }
}