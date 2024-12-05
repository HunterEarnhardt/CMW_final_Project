import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		 int[] arrayA = new int[10];
		 int[] arrayB = new int[10];
		 
		 for(int i = 0; i < arrayA.length; i++)
			{
				System.out.println("Enter the value of the first array at index " + i + ":");
				
				arrayA[i] = key.nextInt();
				
			}
		 
		 for(int i = 0; i < arrayB.length; i++)
		 {
			 System.out.println("Enter the value of the second array at position " + i + ":");
			 
			 arrayB[i] = key.nextInt();
			 
		 }
		 
		 int sumA = 0;
		 int sumB = 0;
		 for(int i = 0; i < arrayA.length; i++)
		 {
			 sumA = arrayA[i] + sumA;
		 }
		 
		 for(int i = 0; i < arrayB.length; i++)
		 {
			 sumB = arrayB[i] + sumB;
		 }
		 
		 if(sumA == sumB)
		 {
			 System.out.println("The two sets of numbers are equal to each other.");
		 }
		 else
		 {
			 System.out.println("The two sets of numbers are not equal");
		 }

	
	}

}
