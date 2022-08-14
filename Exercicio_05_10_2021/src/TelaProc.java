
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
public class TelaProc extends JFrame implements ActionListener {
    // atibutos
    private JButton    btnIns,    btnFim;
    private JLabel     lblTitulo;
    private JTextField txtTitulo;
    private JTextArea txaSelect;
    private ArrayList<Livro> result;
    // construtor
    public TelaProc() {
        super("Procurar livros");
        // configurar o JFrame
        setSize(300, 500);
        setLayout(new GridLayout(5, 5, 20, 20));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // JLabel
        lblTitulo = new JLabel("Insira o titulo do livro que deseja procurar na base de dados");
       
        // JTextField
        txtTitulo = new JTextField("");
       
        // JButton
        btnIns = new JButton("Procurar");
        btnFim = new JButton("Sair");
        btnIns.addActionListener(this);
        btnFim.addActionListener(this);
        
        // JTextArea
        txaSelect = new JTextArea();
        txaSelect.setLineWrap(true);
        txaSelect.setWrapStyleWord(true);
        txaSelect.setEditable(false);
        
        // adiciona componentes no JFrame
        add(lblTitulo);
        add(txtTitulo);
        add(txaSelect);
        add(btnIns);
        add(btnFim);
        
        // exibe JFrame
        setVisible(true);
    }
    // actionPerformed
    public void actionPerformed(ActionEvent evt) {
        if      (evt.getSource() == btnFim) { this.dispose(); }
        else if (evt.getSource() == btnIns) {
            if (!txtTitulo.getText().equals("")) {
                try {
                    LivroDAO livro = new LivroDAO(txtTitulo.getText());
                	result = livro.procurar();
                	for(Livro l : result){
                		txaSelect.append(l + "\n");
                	}
                	txtTitulo.setText("");
                    txtTitulo.requestFocus();
        			
                }
                catch (SQLException sqlExc) {
                	JOptionPane.showMessageDialog(null, "Livro não encontrado na base de dados!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                }
                catch (Exception exc) {
                	txtTitulo.requestFocus();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Informe o titulo do livro que deseja procurar!!!", "Ooops", JOptionPane.ERROR_MESSAGE);
                txtTitulo.requestFocus();
            }
        }
    }
}