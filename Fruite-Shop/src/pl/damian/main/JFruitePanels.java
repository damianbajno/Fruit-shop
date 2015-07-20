package pl.damian.main;

import java.awt.GridBagLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pl.damian.xml.FruitXML;

public class JFruitePanels{
	JPanel fruitePanel=new JPanel(new GridBagLayout());
	JLabel nameLabel=new JLabel();
	JLabel priceLabel=new JLabel();
	
	JLabel pictureLabel=new JLabel();
	
	JLabel amountLabel=new JLabel();
	JTextField amountTextFild=new JTextField();
	JLabel unitLabel=new JLabel();
	
	StringBuilder language;
	ArrayList<Fruite> arrayFruite;
	Properties properties;
	
	public JFruitePanels(StringBuilder language) {
		this.language=language;
	}
	
	public void setLayout(){
		fruitePanel.add(nameLabel, new GBC(0, 0).setWeight(2, 1));
		fruitePanel.add(priceLabel, new GBC(2, 0));
		fruitePanel.add(pictureLabel, new GBC(0, 1).setWeight(3, 3));
		fruitePanel.add(amountLabel, new GBC(0, 4));
		fruitePanel.add(amountTextFild, new GBC(1, 4));
		fruitePanel.add(unitLabel, new GBC(2, 4));
	}
	
	public void setValuesInJLabels(){
		int index;
		nameLabel.setText(arrayFruite.get(index));
		dupa;
	}

	public JPanel getFruitePanel() {
		return fruitePanel;
	}

	private void loadValues(){
		
		InputStream languageResourse = ClassLoader.getSystemResourceAsStream(language.append(".properties").toString());
		Properties properties=new Properties();
		try {
			properties.load(languageResourse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FruitXML fruitXML=FruitXML.getInstance();
		fruitXML.readFruitesFromXMLFile();
		arrayFruite = fruitXML.getArrayFruite();

	}
	
}
