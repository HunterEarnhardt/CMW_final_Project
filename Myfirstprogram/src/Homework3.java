//Hunter Earnhardt

import java.util.Random;
import java.util.Scanner;
public class Homework3 {

	public static final int RESPONCE = 3;
	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Lets play a best out of three game of rock paper scissors against the computor.");
		
		
		
		String systemchoice = "";
		int totalplayerwin = 0;
		int totalcomputerwin = 0;
		int totaltie = 0;
		
		do {
		
			System.out.println("What is your move? Type rock, paper, or scissors.");
			String responce = key.next();
		
			int choice = r.nextInt(RESPONCE);
		switch(choice)
		{
		case(0):
			systemchoice = "rock";
			break;
		case(1):
			systemchoice = "paper";
			break;
		case(2):
			systemchoice = "scissors";
			break;
		}
		 
		if(responce.equals(systemchoice))
		{
			System.out.println("you chose " + responce + " and the computer chose " + systemchoice + ". It is a tie!");
			totaltie++;
		}
		//computer wins
		else if(responce.equals("rock") && systemchoice.equals("paper"))  //rock --> paper
	    {
	        System.out.println("You chose " + responce + " and the computer chose " + systemchoice + ". The computer wins!");
	        totalcomputerwin++;
	    }
		else if(responce.equals("scissors") && systemchoice.equals("rock"))  //scissors --> rock
		{
			System.out.println("You chose " + responce + " and the computer chose " + systemchoice + ". The computer wins!");
		    totalcomputerwin++;
		}	
		else if(responce.equals("paper") && systemchoice.equals("scissors"))  //paper --> scissors
		{
		    System.out.println("You chose " + responce + " and the computer chose " + systemchoice + ". The computer wins!");
		    totalcomputerwin++;
		}
		//player wins
	    else if(responce.equals("paper") && systemchoice.equals("rock"))   //paper --> rock
	    {
	        System.out.println ("You chose " + responce + " and the computer chose " + systemchoice + ". you win!");
	        totalplayerwin++;
	    }
	    else if(responce.equals("rock") && systemchoice.equals("scissors"))  //rock --> scissors
	    {
	    	System.out.println("You chose " + responce + " and the computer chose " + systemchoice + ". you win!");
	    	totalplayerwin++;
	    }
	    else if(responce.equals("scissors") && systemchoice.equals("paper"))  //scissors --> paper
	    {
	    	System.out.println("You chose " + responce + " and the computer chose " + systemchoice + ". you win!");
	    	totalplayerwin++;
	    }
			
	}while(totalplayerwin < 2 && totalcomputerwin < 2 && totaltie < 2);
		
		if(totalplayerwin >= 2)
		{
			System.out.println("You have won the game! congraduation.");
			System.exit(0);
		}
		else if(totalcomputerwin >= 2)
		{
			System.out.println("The computer won! please play again.");
			System.exit(0);
		}
		else if(totaltie >= 2)
		{
			System.out.println("You and the computer have tied please play again.");
			System.exit(0);
		}
		
		
		
	}

}
