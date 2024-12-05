// Hunter Earnhardt

import java.util.Scanner;
public class Lab4 {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many books did you purchase at BN booksellers this month? ");
		
		int number = key.nextInt(); 
		
		switch(number)
		{
		case 0:
			System.out.println( "You have not earned any points yet. Make a book purchase to start earning points!");
			break;
		case 1:
			System.out.println("Thank you for buying one book. You have learned 5 points!");
			System.out.println("You may redeem these points on your next book purchase!");
			break;
		case 2:
			System.out.println("Thank you for buying two books this month. You have earned 15 points!");
			System.out.println("You may redeem these points on your next book purchase!");
			break;
		case 3:
			System.out.println("Thank you for buying three books this month. You have earned 30 points!");
			System.out.println("You may redeem these points on your next book purchase!");
			break;
		default:
			if (number > 3)
			{
				System.out.println("Thank you for shoping at BN booksellers. You have earned 60 points!");
				System.out.println("You may redeem these points on your next book purchase!");
			}
			else
			{
				System.out.println(" Invalid value entered! Exiting the program!");
				System.exit(1);
			}
			break;
		
		}
	}
}


