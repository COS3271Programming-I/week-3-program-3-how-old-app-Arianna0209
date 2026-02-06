package week3;

import java.util.Scanner;
public class HowOldAPP {

	// This program inputs the user's age and tells them how old they will be in five years
	// and whether or not they are a teenager.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Declare the variable for the user's age:
		Integer s;

		// Ask the user to input their age:
        System.out.print("How old are you? ");
        s = userinput.nextInt();

        // Tell the user how old they will be in 5 years:
        System.out.println("\nIn 5 years you will be " + (s + 5) + " years old.");
   
        // Tell the user whether or not they are a teenager:
        System.out.println("It is " + ((s < 20) && (s > 12)) +" that you are a teenager");

        // Tell the user the computer is smart :)
        System.out.println("I am such a smart computer.");

	}

}
