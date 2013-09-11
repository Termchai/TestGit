import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Main {

	static JFrame frame;
	public static void main(String[] args)
	{
		frame = new JFrame("Test");
		{
			frame.setPreferredSize(new Dimension(300,100));
			
			JComboBox<String> combo = new JComboBox<String>();
			combo.addItem("Test1");
			combo.addItem("Test2");
			combo.addItem("Test3");
			combo.removeAllItems();
			frame.add(combo);
			
			
			frame.pack();
			frame.setVisible(true);
		}
	}
	
}
