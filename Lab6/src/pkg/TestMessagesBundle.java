package pkg;

import static org.junit.Assert.*;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;


public class TestMessagesBundle {
	
	@Test
	public void testEnglish(){
		ResourceBundle test;
		test = ResourceBundle.getBundle("MessagesBundle", new Locale("en", "US"));
		assertEquals(test.getString("Greeting"), "Hello World");
		assertEquals(test.getString("GetName"), "Please enter your name");
		assertEquals(test.getString("PleasedToMeet"), "I am pleased to meet you ");
		assertEquals(test.getString("AsOf"), "As of : ");
		assertEquals(test.getString("OweSchool"), "You owe the school ");
		assertEquals(test.getString("Farewell"), "Good Bye");
	}
	
	@Test
	public void testGerman(){
		ResourceBundle test;
		test = ResourceBundle.getBundle("MessagesBundle", new Locale("de", "DE"));
		assertEquals(test.getString("Greeting"), "Hallo Welt");
		assertEquals(test.getString("GetName"), "Bitte geben Sie Ihren Namen");
		assertEquals(test.getString("PleasedToMeet"), "Ich freue mich, Sie kennen zu lernen ");
		assertEquals(test.getString("AsOf"), "Stand : ");
		assertEquals(test.getString("OweSchool"), "Du schuldest der Schule ");
		assertEquals(test.getString("Farewell"), "Auf Wiedersehen");
	}
	
	@Test
	public void testFrench(){
		ResourceBundle test;
		test = ResourceBundle.getBundle("MessagesBundle", new Locale("fr", "FR"));
		assertEquals(test.getString("Greeting"), "Bonjour tout le monde");
		assertEquals(test.getString("GetName"), "S'il vous plaît entrer votre nom");
		assertEquals(test.getString("PleasedToMeet"), "Je suis heureux de vous rencontrer ");
		assertEquals(test.getString("AsOf"), "En date du : ");
		assertEquals(test.getString("OweSchool"), "Vous devez l'école ");
		assertEquals(test.getString("Farewell"), "Au revoir");
	}

}
