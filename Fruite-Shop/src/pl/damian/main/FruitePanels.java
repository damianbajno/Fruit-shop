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

public class FruitePanels{
	JPanel fruitePanel=new JPanel(new GridBagLayout());
	JLabel nameLabel=new JLabel();
	JLabel priceLabel=new JLabel();
	
	JLabel pictureLabel=new JLabel();
	
	JLabel amountLabel=new JLabel();
	JTextField amountTextFild=new JTextField();
	JLabel unitLabel=new JLabel();
	
	StringBuilder language;
	ArrayList<Fruite> arrayFruite;
	Properties fruiteLanguageProperties;
	
	static int fruiteNumberInList=0;
	
	public FruitePanels(StringBuilder language) {
		this.language=language;
		setLayout();
		setValuesInJLabels();
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
		Fruite fruite = arrayFruite.get(fruiteNumberInList);
		
		nameLabel.setText(fruite.getName());
		priceLabel.setText(String.valueOf(fruite.getPrise()));
		amountLabel.setText(fruiteLanguageProperties.getProperty("amount"));
		unitLabel.setText(fruiteLanguageProperties.getProperty("unite"));
		nameLabel.setText(fruite.getName());
		
		fruiteNumberInList++;
	}

	public JPanel getFruitePanel() {
		return fruitePanel;
	}

	private void loadValues(){
		
		InputStream languageResourse = ClassLoader.getSystemResourceAsStream(language.append(".properties").toString());
		fruiteLanguageProperties=new Properties();
		try {
			fruiteLanguageProperties.load(languageResourse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FruitXML fruitXML=FruitXML.getInstance();
		fruitXML.readFruitesFromXMLFile();
		arrayFruite = fruitXML.getArrayFruite();

	}
	
}
