import java.util.Scanner;

public class Homework4 {
	
	public static final double PIE = 3.14;

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("This program will calculate the area of a number of circles at the same time.");
		System.out.println("If you want to sort the areas to be sorted in decending or accending order type 'decending' or 'accending' respectivly. ");
		System.out.println("Alternetivly if you wish for them in their original order type 'none'. ");
		String responce1 = key.next();
		
		System.out.print("Enter the number of circles you wish to calculate: ");
		
		int NumberOfCircles = key.nextInt();
		
		//Check to make sure valid value was entered
		while(NumberOfCircles <= 0)
		{
			System.out.println("The number of circles is invaled. Please enter a valid number of circles.");
			NumberOfCircles = key.nextInt();
		}
		float[] RadiusOfCircle = new float[NumberOfCircles];
		float[] FinalArea = new float[NumberOfCircles];
		
		for(int i = 0; i < NumberOfCircles; i++)
		{
			
		System.out.print("Enter the radias of circle " + i + ":");
		RadiusOfCircle[i] = key.nextFloat();
		
		}
		
		//area of a circle is pie times radius squared
		//calculating area
		for(int i = 0; i < NumberOfCircles; i++)
		{
			FinalArea[i] += RadiusOfCircle[i] * RadiusOfCircle[i] * PIE; 
		}
		
		//organizing into correct order
		switch(responce1)
		{
		case "decending":
			for(int i = 0; i < NumberOfCircles; i++)
			{
				int minIndex = i;
				float smallest = FinalArea[i];
				
				for(int j = i+1; j < NumberOfCircles; j++)
				{
					if(FinalArea[j] < smallest)
					{
						smallest = FinalArea[j];
						minIndex = j;
					}
					
		            if (FinalArea[i] < FinalArea[j]) 
		            {
		              float temp = FinalArea[i];
		              FinalArea[i] = FinalArea[j];
		              FinalArea[j] = temp;
		            }
		         }
		        }

			//print the sorted contents of the array
			for(int i = 0; i < NumberOfCircles; i++)
			{
			System.out.println("The area of circle " + i + " is " + FinalArea[i]);
			}	
			break;
			
		case "accending":
			for(int i = 0; i < NumberOfCircles; i++)
			{
				int maxIndex = i;
				float smallest = FinalArea[i];
				
				for(int j = i+1; j < NumberOfCircles; j++)
				{
					
					if(FinalArea[j] < smallest)
					{
						smallest = FinalArea[j];
						maxIndex = j;
					}
				}
				
				if(smallest < FinalArea[i])
				{
					float temp = FinalArea[i];
					FinalArea[i] = FinalArea[maxIndex];
					FinalArea[maxIndex] = temp;
				}
			}

			//print the sorted contents of the array
			for(int i = 0; i < NumberOfCircles; i++)
			{
			System.out.println("The area of circle " + i + " is " + FinalArea[i]);
			}
			break;
			
		case "none":
			
			for(int i = 0; i < NumberOfCircles; i++)
			{
			System.out.println("The area of circle " + i + " is " + FinalArea[i]);
			}
			
			break;
		}
	}

}
