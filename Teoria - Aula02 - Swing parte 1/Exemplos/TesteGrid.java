package alpooTeoAula02;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
public class TesteGrid extends Frame {
    // atributos
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    // construtor
    public TesteGrid() {
        super("Testando GridLayout");
        setSize(100, 200);
        setLayout(new GridLayout(4,3));
        
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        
        add( btn7 );
        add( btn8 );
        add( btn9 );
        add( btn4 );
        add( btn5 );
        add( btn6 );
        add( btn1 );
        add( btn2 );
        add( btn3 );
        add( btn0 );
    }
    // main
    public static void main(String[] args) {
        TesteGrid tg = new TesteGrid();
        tg.setVisible(true);
    }
}