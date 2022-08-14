package alpooTeoAula06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import alpooTeoAula05.DBConnection;
import javax.swing.table.DefaultTableModel;
public class TesteSelectJTable extends JFrame implements ActionListener {
    // atributos
    private JButton   btnSelect, btnSair, btnLimpar;
    private JPanel    pnlSelect, pnlBotoes;
    private JTable    tblQuery;
    // construtor
    public TesteSelectJTable() {
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
        // JTable
        tblQuery = new JTable();
        tblQuery.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tblQuery.setGridColor(Color.GRAY);        
        // adicionar componentes no JPanel
        pnlBotoes.add(btnSelect);
        pnlBotoes.add(btnLimpar);
        pnlBotoes.add(btnSair);
        pnlSelect.add(tblQuery);
        // adicionar JPanel's no JFrame
        add(pnlBotoes);
        add(pnlSelect);
        // exibir o JFrame
        setVisible(true);
    }
    // main
    public static void main(String[] args) {
        new TesteSelectJTable();
    }
    // actionPerformed
    public void actionPerformed(ActionEvent e) {
        if      (e.getSource() == btnSair)   System.exit(0);
        else if (e.getSource() == btnLimpar) tblQuery.setModel(new DefaultTableModel());
        else if (e.getSource() == btnSelect) {
            try {
                String            sqlString = "SELECT * FROM tblivro";
                DBConnection      db        = new DBConnection();
                Connection        conn      = db.conectar();
                PreparedStatement ps        = conn.prepareStatement(sqlString);
                ResultSet         query     = ps.executeQuery();
                // trabalhando com JTable e ResultSet
                String            campos[] = new String[]{"idLivro", "titulo", "edicao"};
                DefaultTableModel tabela   = new DefaultTableModel(null, campos);
                if (query != null) {
                    while (query.next()) {
                        tabela.addRow(new String[]
                            {
                                "" + query.getInt("idLivro"),
                                     query.getString("titulo"),
                                "" + query.getInt("edicao")
                            }
                        );    
                    }
                }
                tblQuery.setModel(tabela);
                conn.close();
            }
            catch (SQLException sqlExc) {
                JOptionPane.showMessageDialog(null , "Pau no Banco!!!", "Erro...", JOptionPane.ERROR_MESSAGE);
                sqlExc.printStackTrace();
            }
        }
    }
}