//GABRIEL GOMES MACEDO N6598A4 CC4P33
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaBaseEx05 extends JFrame {

    public TelaBaseEx05() {
        setSize(850, 750);
        setResizable(true);
        
        addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
  
    }
}