package alpooTeoAula07;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
public class MenuPrincipal extends JFrame implements ActionListener {
    // atributos
    private JMenuBar  menuBar;
    private JMenu     menu;
    private JMenuItem mnuItemIns, mnuItemUpd, mnuItemDel, mnuItemEnd, mnuItemSea;
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
        
        menu.addSeparator();
        
        mnuItemEnd = new JMenuItem("Sair");
        mnuItemEnd.addActionListener(this);
        menu.add( mnuItemEnd );
        
        menuBar.add( menu );

        // configurar o JFrame
        setSize(500, 500);
        setLayout(new GridLayout(2, 1 ,20, 20));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // exibe JFrame
        setVisible(true);
    }
    // main
    public static void main(String[] args) {
        new MenuPrincipal();
    }
    // actionPerformed
    public void actionPerformed(ActionEvent evt) {
        if      (evt.getSource() == mnuItemEnd) System.exit(0);
        else if (evt.getSource() == mnuItemIns) new TelaIns();
    }
}