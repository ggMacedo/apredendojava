package alpooTeoAula02;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
public class TesteBorder extends Frame {
    // atributos
    private Label lbl1;
    private TextField txtNome;
    private Button btn1, btn2, btn3;
    // construtor
    public TesteBorder() {
        super("Testando BorderLayout");
        setSize(400, 350);
        setLayout(new BorderLayout());
        
        lbl1    = new Label("Estou no NORTE!!!!");
        txtNome = new TextField("Estou no CENTRO");
        btn1    = new Button("LESTE");
        btn2    = new Button("OESTE");
        btn3    = new Button("SUL");
        
        add( BorderLayout.NORTH,  lbl1);
        add( BorderLayout.CENTER, txtNome);
        add( BorderLayout.EAST,   btn1);
        add( BorderLayout.WEST,   btn2);
        add( BorderLayout.SOUTH,  btn3);
    }
    // main
    public static void main(String args[]) {
        TesteBorder tb = new TesteBorder();
        tb.setVisible(true);
    }
}