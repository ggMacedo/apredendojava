//GABRIEL GOMES MACEDO N6598A4 CC4P33

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.*;

public class Tela03 extends Frame{
	Dimension d01 = new Dimension(300, 300);

	public Tela03(){
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}
	
}
