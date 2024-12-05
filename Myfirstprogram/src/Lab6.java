//Hunter Earnhardt

import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle: ");
		
		int hight = key.nextInt();
		
		//increasing top of triangle
		for(int h = 0; h <= hight; h++)
		{
			for(int i = 0; i < h; i++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		hight--;
		
		//Descending the bottom side of the triangle
		for(int h = hight - 1; h >= 0; h--)
		{
			for(int i = 0; i <= h; i++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("End of program!");
	
		
		
	}
}
