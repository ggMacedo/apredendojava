//GABRIEL GOMES MACEDO N6598A4 CC4P33

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tela05 extends Frame{
	Dimension d01 = new Dimension(500, 300);

	public Tela05(){
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}
	
}
