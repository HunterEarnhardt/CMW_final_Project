//Hunter Earnhardt

import java.util.Scanner;
public class Homework2 {
	
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Jerry is walking on the right side down the road and comes to a T intersection. His right goes futher into the town while left heads out of town.");
		System.out.println("Will Jerry turns left or right?");
		
		String responce1 = key.next();
		
		
		//main branch
		if(responce1.equalsIgnoreCase("Left"))
		{
			System.out.println("Jerry crosses the road and starts walking away from the towm. ");
			System.out.println("Jerry walks until he aproaches an intersection as a car swerves onto the sidewalk when turning and barely misses Jerry.");
			System.out.println("He crosses the street seeing a pizza place that has a good reputation but hears a loud crash to his left down the street where the car went.");
			System.out.println("Type left if Jerry goes left to investigate the odd sound or straight if he ignores the sound and goes to ge pizza.");
			
			String responce2 = key.next();
			
			//Secondary choice1 (main 1)  end of branch 1
			if(responce2.equalsIgnoreCase("left"))
			{
				System.out.println("Jerry desides to investigate the loud sound and starts walking down the same road the car went.");
				System.out.println("After rounding a corner Jerry sees the car that had almost hit him. It was upside down on the side of the road with the back half looking like a pancake!!");
				System.out.println("Jerry call 911 and runs to help the driver out of the car. The driver was eventually taken away by the medics. "); 
				System.out.println("Afterward the sun was heading down and the pizza place was closed so Jerry headed home to get food.");
				System.out.println(" ");
				System.out.println("Thank you for reading this story! If you wish to read another path please reatart the program.");
				System.out.println("Have a good day! ");
			}
			
			//secondary choice2 (main1)
			else
			{
				System.out.println("Jerry's stonach grumbles when he smells the pizza from the store and he starts walking up the streat. He pushes the car and whatever sound he had heard out of his mind.");
				System.out.println("There are many people in the restrount and Jerry noticess his freind Dan sitting at one of the tables. Dan also sees Jerry come in and calls out to Jerry with an offer.");
				System.out.println("Dan explains that he is throwing a pizza party in a few minutes and the driver that was saposed to pick him up is knowwhere to be found. He offers to buy Jerry a pizza if he helps Dan take all of the pizzas to the park. Jerry knows that Dan usualy couses trouble so he is hesitant to accept Dan's offer.");
				System.out.println("Does Jerry accept Dan's offer?");
				
				String responce3 = key.next();
				
				//final branch1 (main1)  end of branch 2 
				if(responce3.equalsIgnoreCase("yes"))
				{
					System.out.println("Jerry desides that free pizza is worth whatever trouble Dan could get him into and agrees to help Dan.");
					System.out.println("Jerry and Dan grab the stack of pizzas and walk down to the park. Dans freinds are waiting and manage to get Jerry to stay and enjoy the party.");
					System.out.println("There would be a few minor problems that Jerry was able to help sort out and it would be around midnight when he got home.");
					System.out.println("Thank you for reading this story. If you wish to explore another path please run the program again.");
				}
				
				//final branch2 (main1)  end of branch 3 
				else
				{
					System.out.println("Jerry desides that he would like to get his pizza and go home so he refuses Dan's offer. Jerry ordered a peperonii pizza and headed home after eating.");
					System.out.println("Jerry would get home safe and sound at a resonable hour.");
					System.out.println("Thank you for reading this story. If you want to read a different path please restart the program. Have a good day.");
				}
			}
		}
		
		//Main branch 2
		else
		{
			System.out.println("Jerry turns right and continue walking until he finds a hot dog stand.");
			System.out.println("Jerry is slightly hungry but he could wait to eat back at his house. That is assuning that there is no large crowds to slow him down on his way home.");
			System.out.println("Please type Yes if Jerry stops and gets a hotdog or type no if he desides to eat at home.");
			
			String responce2 = key.next();
			
			//Secondary choice1 (main2)
			if(responce2.equalsIgnoreCase("Yes"))
			{
				System.out.println("Jerry thinks about it and decides to get a hotdog just incase there is a large crowd to slow his trip home.");
				System.out.println("After siting down on a bench to enjoy his hotdog, Jerry desides to finish is walk. However he cant deside if he shoould walk down to the park or to the historic area of town that has a statue.");
				System.out.println("Type park if Jerry should head to the park or statue if he should head to the historic area.");
				
				String responce3 = key.next();
				
				// Third choice 1 (main2) end of branch 4
				if(responce3.equalsIgnoreCase("park"))
				{
					System.out.println("With the park being closer to his house Jerry heads to there but finds there is trash everywhere. It looks like a large croud had been partying and had just left.");
					System.out.println("After finishing his walk and with the sun setting Jerry heads home to get some sleep. ");
					
					System.out.println("  ");
					System.out.println("You have finished this path of the story. If you wish to read a different path please restart the program.");
					System.out.println("Thank you!");
				}
				
				//final branch2 (main2) end of branch 5
				else
				{
					System.out.println("Jerry figured that it would be nice to see the Historic part of town. He dosent usually get to see that part of town at a pleasant place.");
					System.out.println("When he arived Jerry saw that there was two events going on. There was a naval guided tour of the port and a recreation of a cival war battle. ");
					System.out.println("Which event will Jerry go to? Type tour if Jerry goes to the naval tour and battle if he goes to the recreation.");
					
					String responce4 = key.next();
					
					// end of branch 6
					if(responce4.equalsIgnoreCase("tour"))
					{
						System.out.println("Jerry went to the free guided tour of the port that showed the old ships that were saved in the harbor along with some of the other interesting things around the port.");
						System.out.println("After that Jerry went home and had a good night of sleep.");
						System.out.println("Thank you for reading this story!");
						System.out.println("If you wish to read a different path please run the program again. Have a nice day.");
					}
					
					//end of branch 7
					else
					{
						System.out.println("Jerry desided that because he didn't live in a major port that he would be more interested in the recreation of the civil war battle.");
						System.out.println("Jerry decideses to go to the recreation of the battle. After the performance Jerry went on the feild and took one of the fired  bullets as a suverneer. ");
						System.out.println("Jerry then left and went to his house to get some dinner.");
						System.out.println("Thank you for reading this story! If you wish to read a different path please run the program again.");
						System.out.println("Have a good day!");
					}
				}
				
			}
			
			//secondary choice2 (main2)
			else
			{
				System.out.println("Jerry desides to continue on his walk and not get a hotdog. He walks down the road to the park. ");
				System.out.println("There was a party gooing on and the people who are there looked upset. ");
				System.out.println("When Jerry got close he saw some people that he thought he knew in the crowd. He was getting hungery so he was unsure if he wanted to ignore them and head home for food or to go ask what was going on.");
				System.out.println("What should Jerry do? Should he investigate or head home?");
				
				String responce3 = key.next();
				
				//Third choice
				if(responce3.equalsIgnoreCase("investigate")) 
				{
					System.out.println("Letting his curiosity get the better of him Jerry went up to one of the party attenders and asked what everyone was upset about. ");
					System.out.println("The man said that it was saposed to be a pizza party but the people who had ordered and went to get the pizza didn't come back.");
					System.out.println("By the time the man had finished explaining the croud around Jerry had become roudy with some begining to make a scene while others began ordering their own food.");
					System.out.println("Jerry was somehow pulled into the cinter of the crowed and had to make a choice. Does he Stay and see what happens or does he lisgn to his stomach and go home to eat? ");
					System.out.println("Type stay if Jerry waits to see or go if he heads home.");
					
					String responce4 = key.next();
					
					// fourth choice    end of branch 8
					if(responce4.equalsIgnoreCase("stay")) 
					{
						System.out.println("Jerry desides to stay and see what happens but he does not want to be in the middle of the roudy croud. \n"  + "He manages to make it to a bench on the outskirts of the park but waits until he calls his freind Dan who tells everyonr that the car that had been meant to bring the pizzas had crashed and the party would be relocated closer to the pizza shop. \n" + "After that and being very hungery Jerry went home and had his dinner admitedly a lot later than he had wished.");
						
						System.out.println("Thank you for reading this story! Have a good day.\n" + "If you wish to read another path of this story please run the program again");
					}
					
					// end of branch 9
					else 
					{
						System.out.println("Jerry desides that the group of people is to roudy and he is to hungery so he heads home to eat dinner.\n" + "Later he would find out that the person who was saposed to pick up th pizzas was driving drunk and crashed. He was releived to hear that his freind Dan who was at the pizza place was not in the car. /n" + "The party was disbanded and all the people went back to their homes.");
						
						System.out.println("Thank you for reading this story! Have a good day.\n" + "If you wish to read another path of this story please run the program again");
					} // final choice ending bracket
				} // third choice ending bracket
			} // second choice ending bracket
		} // first choice ending bracket

	
	}

}
