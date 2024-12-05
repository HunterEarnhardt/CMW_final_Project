import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) 
	{
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the Apple tester!!!  \nCreating the first apple!");
		
		//Accessing and printing default apple object
		Apple AD = new Apple();
		AD.writeOutput();
		
		
		System.out.println("Values of  the second apple object: ");
		
		//user enters the values of the apple
		System.out.println("Enter the type of the second apple object: ");
		String type = key.nextLine();
		
		System.out.println("Enter the weight of the second apple object that is between 0 and 2: ");
		double weight = key.nextDouble();
		
		System.out.println("Enter the price of the second apple object that is between 0 and 1: ");
		double price = key.nextDouble();
		
		//Setting the values 
		//printing errors if there is any
		AD.setType(type);
		AD.setWeight(weight);
		AD.setPrice(price);
		
		//printing output
		AD.writeOutput();
		
	}
}
