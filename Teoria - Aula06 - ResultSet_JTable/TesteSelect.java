package alpooTeoAula06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import alpooTeoAula05.DBConnection;
public class TesteSelect extends JFrame implements ActionListener {
    // atributos
    private JButton   btnSelect, btnSair, btnLimpar;
    private JPanel    pnlSelect, pnlBotoes;
    private JTextArea txaSelect;
    // construtor
    public TesteSelect() {
        super("Testando o SELECT");
        // configuração do JFrame
        setSize(500, 500);
        setLayout(new GridLayout(2, 1, 20, 20));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // JPanel
        pnlSelect = new JPanel(new GridLayout(1, 3));
        pnlBotoes = new JPanel(new FlowLayout());
        // JButton
        btnSelect = new JButton("Select");
        btnLimpar = new JButton("Limpar");
        btnSair   = new JButton("Sair");
        btnSelect.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);
        // JTextArea
        txaSelect = new JTextArea();
        // adicionar componentes no JPanel
        pnlBotoes.add(btnSelect);
        pnlBotoes.add(btnLimpar);
        pnlBotoes.add(btnSair);
        pnlSelect.add(txaSelect);
        // adicionar JPanel's no JFrame
        add(pnlBotoes);
        add(pnlSelect);
        // exibir o JFrame
        setVisible(true);
    }
    // main
    public static void main(String[] args) {
        new TesteSelect();
    }
    // actionPerformed
    public void actionPerformed(ActionEvent e) {
        if      (e.getSource() == btnSair)   System.exit(0);
        else if (e.getSource() == btnLimpar) txaSelect.setText("");
        else if (e.getSource() == btnSelect) {
            try {
                String            resultado = "";
                String            sqlString = "SELECT * FROM tblivro";
                DBConnection      db        = new DBConnection();
                Connection        conn      = db.conectar();
                PreparedStatement ps        = conn.prepareStatement(sqlString);
                ResultSet         query     = ps.executeQuery();
                while (query.next()) {
                    resultado += query.getInt("idLivro")   + " - " +
                                 query.getString("titulo") + " - " +
                                 query.getInt("edicao")    + "\n";
                }
                txaSelect.setText(resultado);
                conn.close();
            }
            catch (SQLException sqlExc) {
                JOptionPane.showMessageDialog(null , "Pau no Banco!!!", "Erro...", JOptionPane.ERROR_MESSAGE);
                sqlExc.printStackTrace();
            }
        }
    }
}