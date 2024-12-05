//Hunter M Earnhardt

import java.util.Scanner;
public class Lab3 {
	
	public static final double P = 99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* each price is $99
		 * 10-19 20%
		 * 20-49 30%
		 * 50-99 40%
		 * 100 or more 50%
		 */
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the total number of software packages ordered: ");
		
		double Quantity = key.nextDouble();
		
		if(Quantity <=9 )
		{
			System.out.println(" Invalid value for package count! Exiting the program! ");
			System.exit(0);
		}
		else if(Quantity <=19 && Quantity >9)
		{
			double price = Quantity * P;
			double discount = price * .20;
			double Totalprice = price - discount;
			System.out.println("Total Bill amount (before discount)= "+ price);
			System.out.println("Amount of discount= "+ discount);
			System.out.println("Total bill amount (after discount)= "+ Totalprice);
		}
		else if(Quantity <=50 && Quantity >19)
		{
			double price = Quantity * P;
			double discount = price * .30;
			double Totalprice = price - discount;
			System.out.println("total bill amount (before discount)= "+ price);
			System.out.println("Amount of discount= "+ discount);
			System.out.println("Total bill amount (after discount)= "+ Totalprice);
		}
		else if(Quantity <=99 && Quantity >49)
		{
			double price = Quantity * P;
			double discount = price * .40;
			double Totalprice = price - discount;
			System.out.println("total bill amount (before discount)= "+ price);
			System.out.println("Amount of discount= "+ discount);
			System.out.println("Total bill amount (after discount)= "+ Totalprice);
		}
		else if(Quantity >=100)
		{
			double price = Quantity * P;
			double discount = price * .50;
			double Totalprice = price - discount;
			System.out.println("total bill amount (before discount)= "+ price);
			System.out.println("Amount of discount= "+ discount);
			System.out.println("Total bill amount (after discount)= "+ Totalprice);
		}
	}
}
