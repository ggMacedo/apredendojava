//GABRIEL GOMES MACEDO N6598A4 CC4P33

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tela04_Email extends Frame{
	Dimension d01 = new Dimension(300, 160);

	public Tela04_Email(){
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}
	
}

