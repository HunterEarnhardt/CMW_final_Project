// Hunter Earnhardt

import java.util.Scanner;
public class Homework1 {

	public static <Split> void main(String[] args) {
		Scanner key = new Scanner(System.in);
		// basic questions name, number, age, major, school year, and date
		
		System.out.println("Please enter you first name.");
		String FirstName = key.next();
		
		System.out.println("Enter your last name.");
		String LastName = key.next();
		
		System.out.println("Please enter your age(in years) ");
		int age = key.nextInt();
		
		System.out.println("Enter your phone number(numbers only)");
		String PhoneNumber = key.next();
		String AreaCode = PhoneNumber.substring(0,3);
		String SecondSet = PhoneNumber.substring(3,6);
		String FinalCode = PhoneNumber.substring(6,10);
		
		System.out.println("What is your major(if spaces are neede use _)");
		String Major = key.next();
		
		System.out.println("What is your school year?(Freshman, etc)");
		String SchoolYear = key.next();
		
		//Current Date
		System.out.println("What is today's date? (mm/dd/yyyy)");
		String Date = key.next();
		String DateMonth = Date.substring(0,2);
		String DateDay = Date.substring(3,5);
		String DateYear = Date.substring(6,10);
		
		// Additional questions (what is your favorite Color, Food, and sport)
		System.out.println("What is your favorite comedy movie, Drink, and game?(Please have spaces as _");
		String ComedyMovie = key.next();
		String Drink = key.next();
		String Game = key.next();
		
		int BirthYear = 2024 - age;
		
		
		//Final print statement for the answer
		System.out.println(" Here’s an quick intro for" + FirstName + LastName);
		System.out.println("“You were born in the year "+ BirthYear +". In your free time, you love to watch "+ ComedyMovie +" \r\n"
				+ " You always have "+ Drink +"in your fridge because it is one of your favorite drinks. Your Favorite\r\n"
				+ " game to play is "+ Game +". You are a "+ SchoolYear +" at USC majoring in "+ Major + ". You can be\r\n"
				+ " reached at (" + AreaCode + ")" + SecondSet + "-" + FinalCode + ". You are now officially a Gamecock!”\r\n"
				+ " Last Updated: "+ DateDay + "/"+ DateMonth +"/" + DateYear);
	
	
	
	
	}

}
