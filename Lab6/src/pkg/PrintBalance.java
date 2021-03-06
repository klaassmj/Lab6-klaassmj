package pkg;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{
	
	/**
	 * Simple Java Method that is *crying out*<--(really?) to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		System.out.println("Please Enter Your Country");
		String country = scanInput.nextLine();
		
		System.out.println("Please Enter Your Language");
		String language = scanInput.nextLine();
		
		Locale curLocale = new Locale(language, country);
		
		ResourceBundle resourceBundle;
		resourceBundle = ResourceBundle.getBundle("MessagesBundle", curLocale);
		
		//Greeting
		//System.out.println("Hello World");
		System.out.println(resourceBundle.getString("Greeting"));
		
		//Get User's Name
		//System.out.println("Please enter your name");
		System.out.println(resourceBundle.getString("GetName"));
		String name = scanInput.nextLine();
		//System.out.println("I am pleased to meet you " + name);
		System.out.println(resourceBundle.getString("PleasedToMeet") + name);
		
		//print today's date, balance and bid goodbye
		//System.out.println("As of : "+ today.toString());
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, curLocale);
		System.out.println(resourceBundle.getString("AsOf") + df.format(today));
		//System.out.println("You owe the school $9876543.21");
		NumberFormat nf = NumberFormat.getCurrencyInstance(curLocale);
		System.out.println(resourceBundle.getString("OweSchool") + nf.format(9876543.21));
		//System.out.println("Good Bye");
		System.out.println(resourceBundle.getString("Farewell"));
	}
}
