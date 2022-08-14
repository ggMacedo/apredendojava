package alpooTeoAula02;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
public class TesteFlow extends Frame {
    // atributos
    private Label lbl1;
    private TextField txtNome;
    private Button bt1, bt2, bt3;
    // construtor
    public TesteFlow() {
      super("Testando FlowLayout");
      setSize(400, 350);
      setResizable(false);
      setLayout(new FlowLayout());
      
      lbl1    = new Label("Nome:");
      txtNome = new TextField(40);
      bt1     = new Button("Um");
      bt2     = new Button("Dois");
      bt3     = new Button("Três");
      
      add( lbl1 );
      add( txtNome );
      add( bt1 );
      add( bt2 );
      add( bt3 );
    }
    // main
    public static void main(String args[]) {
        TesteFlow tf = new TesteFlow();
        tf.setVisible(true);
    }
}