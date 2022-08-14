

import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
public class MenuPrincipal extends JFrame implements ActionListener {
    // atributos
    private JMenuBar  menuBar;
    private JMenu     menu;
    private JMenuItem mnuItemIns, mnuItemUpd, mnuItemDel, mnuItemEnd, mnuItemSea, mnuItemMostra;
    private JTextArea txaSelect;
    private ArrayList<Livro> result;
    // construtor
    public MenuPrincipal() {
        super("Livros");
        // JMenuBar
        menuBar = new JMenuBar();
        setJMenuBar( menuBar );
        // JMenu
        menu = new JMenu("Livros");
        menu.setMnemonic( KeyEvent.VK_C );
        
        // JMenuItem
        mnuItemIns = new JMenuItem("Novo livro");
        menu.add( mnuItemIns );
        mnuItemIns.addActionListener(this);
        
        mnuItemUpd = new JMenuItem("Alterar dados");
        menu.add( mnuItemUpd );
        mnuItemUpd.addActionListener(this);
        
        mnuItemDel = new JMenuItem("Excluir livro");
        menu.add( mnuItemDel );
        mnuItemDel.addActionListener(this);
        
        mnuItemSea = new JMenuItem("Procurar livro");
        menu.add( mnuItemSea );
        mnuItemSea.addActionListener(this);
        
        mnuItemMostra = new JMenuItem("Mostrar livros");
        menu.add( mnuItemMostra );
        mnuItemMostra.addActionListener(this);
        
        menu.addSeparator();
        
        mnuItemEnd = new JMenuItem("Sair");
        mnuItemEnd.addActionListener(this);
        menu.add( mnuItemEnd );
        
        menuBar.add( menu );
        
        // JTextArea
        txaSelect = new JTextArea();
        txaSelect.setEditable(false);
        txaSelect.setLineWrap(true);
        txaSelect.setWrapStyleWord(true);
    	
        // configurar o JFrame
        setSize(500, 500);
        setLayout(new GridLayout(2, 1 ,50, 50));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // exibe JFrame
        add(txaSelect);
        setVisible(true);
    }
    // main
    public static void main(String[] args) {
        new MenuPrincipal();
    }
    // actionPerformed
    public void actionPerformed(ActionEvent evt) {
        if      (evt.getSource() == mnuItemEnd) { System.exit(0);}
        else if (evt.getSource() == mnuItemIns) { new TelaIns();}
        else if (evt.getSource() == mnuItemUpd) {new TelaUpd();}
        else if (evt.getSource() == mnuItemDel) {new TelaDel();}
        else if (evt.getSource() == mnuItemSea) {new TelaProc();}
        else if (evt.getSource() == mnuItemMostra) {
        	LivroDAO livro = new LivroDAO();
            try {
            	result = livro.carregar();
            	for(Livro l : result){
            		txaSelect.append(l + "\n");
            	}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Erro na base de dados!!!", "Ooops", JOptionPane.ERROR_MESSAGE);
			}
           
        	
        }
    }
}