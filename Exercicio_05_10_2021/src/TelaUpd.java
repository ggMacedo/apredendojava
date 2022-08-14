
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
public class TelaUpd extends JFrame implements ActionListener {
    // atibutos
    private JButton    btnIns,    btnFim;
    private JLabel     lblTitulo, lblEdicao, lblCod;
    private JTextField txtTitulo, txtEdicao, txtCod;
    // construtor
    public TelaUpd() {
        super("Alterar livros");
        // configurar o JFrame
        setSize(400, 200);
        setLayout(new GridLayout(4, 2 ,20, 20));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // JLabel
        lblCod = new JLabel("Insira o código do livro que será alterado");
        lblTitulo = new JLabel("Insira um novo titulo");
        lblEdicao = new JLabel("Insira uma nova edição");
        // JTextField
        txtCod = new JTextField("");
        txtTitulo = new JTextField("");
        txtEdicao = new JTextField("");
        // JButton
        btnIns = new JButton("Alterar");
        btnFim = new JButton("Sair");
        btnIns.addActionListener(this);
        btnFim.addActionListener(this);
        // adiciona componentes no JFrame
        add(lblCod);
        add(txtCod);
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
            if (!txtCod.getText().equals("") && !txtTitulo.getText().equals("") && !txtEdicao.getText().equals("")) {
                try {
                    LivroDAO livro = new LivroDAO(Integer.parseInt(txtCod.getText()), txtTitulo.getText(), Integer.parseInt(txtEdicao.getText()));
                    livro.alterar();
                    txtTitulo.setText("");
                    txtEdicao.setText("");
                    txtCod.setText("");
                    txtCod.requestFocus();
                }
                catch(NumberFormatException nfExc) {
                    JOptionPane.showMessageDialog(null, "Coloque apenas numeros no campo EDIÇÃO!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                    txtEdicao.requestFocus();
                
                }
                catch (SQLException sqlExc) {
                	JOptionPane.showMessageDialog(null, "Livro não encontrado na base de dados!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                }
                catch (Exception exc) {
                    txtCod.requestFocus();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Informe todos os dados para alterar o livro desejado!!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                txtCod.requestFocus();
            }
        }
    }
}