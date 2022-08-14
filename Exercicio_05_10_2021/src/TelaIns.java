
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TelaIns extends JFrame implements ActionListener {
    // atibutos
    private JButton    btnIns,    btnFim;
    private JLabel     lblTitulo, lblEdicao;
    private JTextField txtTitulo, txtEdicao;
    // construtor
    public TelaIns() {
        super("Inserindo livros");
        // configurar o JFrame
        setSize(400, 200);
        setLayout(new GridLayout(3, 2 ,20, 20));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // JLabel
        lblTitulo = new JLabel("Titulo do livro");
        lblEdicao = new JLabel("Edição do livro");
        // JTextField
        txtTitulo = new JTextField("");
        txtEdicao = new JTextField("");
        // JButton
        btnIns = new JButton("Inserir");
        btnFim = new JButton("Sair");
        btnIns.addActionListener(this);
        btnFim.addActionListener(this);
        // adiciona componentes no JFrame
        add(lblTitulo);
        add(txtTitulo);
        add(lblEdicao);
        add(txtEdicao);
        add(btnIns);
        add(btnFim);
        // exibe JFrame
        setVisible(true);
    }
    // actionPerformed
    public void actionPerformed(ActionEvent evt) {
        if      (evt.getSource() == btnFim) { this.dispose(); }
        else if (evt.getSource() == btnIns) {
            if (!txtTitulo.getText().equals("") && !txtEdicao.getText().equals("")) {
                try {
                    LivroDAO livro = new LivroDAO(txtTitulo.getText(), Integer.parseInt(txtEdicao.getText()));
                    livro.inserir();
                    JOptionPane.showMessageDialog(null, "Novo livro cadastrado com sucesso!", "Sucesso!", JOptionPane.WARNING_MESSAGE);
                    txtTitulo.setText("");
                    txtEdicao.setText("");
                    txtTitulo.requestFocus();
                }
                catch(NumberFormatException nfExc) {
                    JOptionPane.showMessageDialog(null, "Coloque apenas numeros no campo EDIÇÃO!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                    txtEdicao.requestFocus();
                }
                catch (Exception exc) {
                    txtTitulo.requestFocus();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Informe todos os dados para inserir novo livro!!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                txtTitulo.requestFocus();
            }
        }
    }
}