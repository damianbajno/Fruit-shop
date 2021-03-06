package pl.damian.main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShopFrame extends JFrame {

	final String frameTitle="Fruite Shop";
	
	public ShopFrame() {
		setLayout(new GridLayout(1, 2));
		setDefaulteSettings();
		addFruitePanelsToFrame();
	}

	public void addFruitePanelsToFrame() {
		for (int i = 0; i < fruitePanels.getAmountOfFruitePanel(); i++) {
			generateFruitePanels();
			JPanel panel=fruitePanels.getFruitePanel();
			add(panel);
		}
	}

	FruitePanels fruitePanels=new FruitePanels("PL");
	
	public FruitePanels generateFruitePanels() {
		fruitePanels.setValuesInJLabels();
		return fruitePanels;
	}

	public void setDefaulteSettings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(frameTitle);
		setVisible(true);
		setSize(400, 400);
	}
}
