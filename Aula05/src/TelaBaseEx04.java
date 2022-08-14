//GABRIEL GOMES MACEDO N6598A4 CC4P33
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaBaseEx04 extends Frame {

    public TelaBaseEx04() {
        setSize(550, 350);
        setResizable(true);
        
        addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
  
    }
}