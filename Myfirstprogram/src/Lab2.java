// Hunter Earnhardt
/*
 * V=u+at
 * S= ut+1/2 at^2
 */

import java.util.Scanner;
public class Lab2 {

	public static final double a = 9.8 ;
	
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);

		System.out.println(" Enter the initial velocity of the ball (in meters per second) at point A: ");
		// starting to make boxes for the variables
		double initialvelocity = key.nextDouble();
		
		System.out.println(" Enter the time the travel lasted in seconds");
		
		double time = key.nextDouble();
		
		double volocity = initialvelocity + a * time;
		// first problem answer
		System.out.println( " Final Velocity of the ball = " + volocity + " m/s");

		double distancetraveled = (initialvelocity * time) + (0.5 * a * Math.pow(time, 2));
		// second problem answer
		System.out.println("Distance traveled by the ball (S) " + distancetraveled + " meters");
	}

}
