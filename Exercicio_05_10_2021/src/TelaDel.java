
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
public class TelaDel extends JFrame implements ActionListener {
    // atibutos
    private JButton    btnIns,    btnFim;
    private JLabel     lblCod;
    private JTextField txtCod;
    // construtor
    public TelaDel() {
        super("Deletar livros");
        // configurar o JFrame
        setSize(400, 200);
        setLayout(new GridLayout(4, 2 ,20, 20));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // JLabel
        lblCod = new JLabel("Insira o código do livro que será deletado");
       
        // JTextField
        txtCod = new JTextField("");
       
        // JButton
        btnIns = new JButton("Deletar");
        btnFim = new JButton("Sair");
        btnIns.addActionListener(this);
        btnFim.addActionListener(this);
        // adiciona componentes no JFrame
        add(lblCod);
        add(txtCod);
        add(btnIns);
        add(btnFim);
        // exibe JFrame
        setVisible(true);
    }
    // actionPerformed
    public void actionPerformed(ActionEvent evt) {
        if      (evt.getSource() == btnFim) { this.dispose(); }
        else if (evt.getSource() == btnIns) {
            if (!txtCod.getText().equals("")) {
                try {
                    LivroDAO livro = new LivroDAO(Integer.parseInt(txtCod.getText()));
                    livro.excluir();
                    txtCod.setText("");
                    txtCod.requestFocus();
                }
                catch (SQLException sqlExc) {
                	JOptionPane.showMessageDialog(null, "Livro não encontrado na base de dados!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                }
                catch (Exception exc) {
                    txtCod.requestFocus();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Informe o código do livro que deseja deletar!!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                txtCod.requestFocus();
            }
        }
    }
}