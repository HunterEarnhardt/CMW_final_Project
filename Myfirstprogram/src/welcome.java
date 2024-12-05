import java.util.Scanner;

public class welcome {

	public static void main(String[] args) {
		 String message = "java" + "is" + "fun";
		 System.out.println(message);
		 Scanner key = new Scanner(System.in);

		 String PhoneNumber = key.next();
		 
		 String[] PhonePart = PhoneNumber.split(PhoneNumber,3); 
		 System.out.println(PhonePart +" and "+ PhoneNumber);
	
	}

}
