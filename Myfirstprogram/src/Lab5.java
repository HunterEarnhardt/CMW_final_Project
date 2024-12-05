// Hunter Earnhardt

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine? ");
		
		int money = key.nextInt();
		
		int coupons = money;
		int CouponsUsed = 0;
		
		// if they have enough to redeem for extra chocolate bars
		if(money >= 6)
		{
			
			while( coupons >= 6)
			{
				// instead of doing minus six and plus one i just minus five
				coupons = coupons - 5;
				CouponsUsed++;
			}
			
			int bars = money + CouponsUsed;
			
			System.out.println("You can buy " + bars + " chocolate bars and will have " + coupons + " coupons remaining afterward!");
		}
		
		// if they don't have enough to redeem any coupons
		else if(money < 6 && money > 0)
		{
			int bars = money;
			// you are not redeeming any coupons so the number of bars is the same a the number of coupons
			int Coupon = bars;
			
			System.out.println("You have bought " + bars + " chocolate bars and will have gained" + Coupon + " coupons but do not have enough to redeam it for an extra chocolate bar.");
		}
		
		// if they put in a negative number
		else
		{
			System.out.println("Invalid value for amount! Exiting the program!");
			System.exit(0);
		}
	}

}
