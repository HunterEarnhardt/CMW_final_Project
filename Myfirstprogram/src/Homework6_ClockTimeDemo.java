import java.util.Scanner;
public class Homework6_ClockTimeDemo {
	
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		Homework6_TimeConverter TC = new Homework6_TimeConverter();
		
		String Do = "Yes";
		
		while(Do.equalsIgnoreCase("yes"))
		{
		System.out.println("Enter the hours on the military clock: ");
		int hours = key.nextInt();
		
		System.out.println("Enter the minutes on the military clock: ");
		int minutes = key.nextInt();
		
		System.out.println("Enter the seconds on the military clock: ");
		int seconds = key.nextInt();
		
		TC.setHours(hours);
		TC.setMinutes(minutes);
		TC.setSeconds(seconds);
		
		TC.UpdateTime();
		TC.DisplayTime();
		
		key.nextLine();
		
		System.out.println("Enter 24 hour clock time in the format “hours:minutes:seconds” ");
		String Time = key.nextLine();
		
		TC.UpdateTime(Time);
		TC.DisplayTime();
		
		System.out.println("Would you like to do this again? Enter “Yes” or “No”:");
		Do = key.next();
		}
		
		
		
	}
}
