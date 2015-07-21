package pl.damian.main;

import javax.swing.JFrame;

public class ShopFrame extends JFrame {

	final String frameTitle="Fruite Shop";
	
	public ShopFrame() {
		setDefaulteSettings();
		generateFruitePanels();
	}

	public void generateFruitePanels() {
		FruitePanels fruitePanels=new FruitePanels("EN");
	}

	public void setDefaulteSettings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(frameTitle);
		setVisible(true);
		setSize(400, 400);
	}
}
