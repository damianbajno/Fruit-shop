package pl.damian.xml;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import pl.damian.main.Fruite;

public class mainXML {

	

	public static void main(String args[]) {

		Fruite[] fruites = {
				new Fruite("pl", "Jabłko", 3,
						"D:\\skanowanie\\MegaCloud\\Fruite-shop\\resources\\apple.jpg"),
				new Fruite("pl", "Gruszka", 2,
						"D:\\skanowanie\\MegaCloud\\Fruite-shop\\resources\\pear.jpg") };
		FruitXML fruitXML=new FruitXML();
		fruitXML.writeFruitesToXMLFile(fruites);
		
	}

	

}
