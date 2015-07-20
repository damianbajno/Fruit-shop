package pl.damian.main;

import javax.swing.JFrame;

public class ShopFrame extends JFrame {

	final String frameTitle="Fruite Shop";
	
	public ShopFrame() {
		setDefaulteSettings();
		
	}

	public void generateFruitePanels() {
		
	}

	public void setDefaulteSettings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(frameTitle);
		setVisible(true);
		pack();
	}
}
