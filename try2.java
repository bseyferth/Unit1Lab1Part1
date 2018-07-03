import java.util.Scanner;
public class try2 {
	public static void main(String[] args) {
		
		//declares variables 
		
		char input1Number1;
		char input1Number2;
		char input1Number3;
		char input2Number1;
		char input2Number2;
		char input2Number3;
		String input1;
		String input2;
		boolean result;
				
		//prints first line of command
		
		System.out.println("Enter the first 3 digit number:");
		Scanner scnr1 = new Scanner (System.in);
		
		//enters loop if entry is not a number
		
		while (!scnr1.hasNextInt()) {
			//requires re-entry of the number and reclassifies scanner
			System.out.println("That is not a number!");
			System.out.println("Please re-enter a 3 digit number:");
			scnr1.next();
		}
		
		//assigns the scanner to a string input
		input1 = scnr1.next();
		
		//Verifies the length is 3 digits
		 while (input1.length() != 3) {
			//requires re-entry of the number and reclassifies scanner
			System.out.println("That is not 3 digits");
			System.out.println("Please re-enter a 3 digit number:");
			input1 = scnr1.next();			
		}

		//Breaks the entry up into individual pieces		
		input1Number1 = input1.charAt(0);
		input1Number2 = input1.charAt(1);
		input1Number3 =input1.charAt(2);
		
		//asks for the second number entry
		System.out.println("Enter the second 3 digit number:");
		Scanner scnr2 = new Scanner (System.in);
		
		//enters loop if entry is not a number
		while(!scnr2.hasNextInt()) {
			//requires re-entry of the number and reclassifies scanner			
			System.out.println("That is not a number!");
			System.out.println("Please re-enter the second 3 digit number:");
			scnr2.next();
		}
		
		//assigns scanner 2 to a string value
		input2=scnr2.next();
		
		//Verifies the length is 3 digits
		while (input2.length() != 3) {
			//requires re-entry of the number and reclassifies scanner	
			System.out.println("That is not 3 digits");
			System.out.println("Please re-enter a 3 digit number:");
			input2 = scnr2.next();			
		}
		
		//breaks the second entry into its parts
		input2Number1 = input2.charAt(0);
		input2Number2 = input2.charAt(1);
		input2Number3 =input2.charAt(2);
		
		//turns now guaranteed 3 digit numeric characters into integers for math purposes		
		int a = Character.getNumericValue (input1Number1);
		int b = Character.getNumericValue (input1Number2);		
		int c = Character.getNumericValue (input1Number3);
		int d = Character.getNumericValue (input2Number1);
		int e = Character.getNumericValue (input2Number2);		
		int f = Character.getNumericValue (input2Number3);		
		
		//creates an outputs for each spot in the line i.e (tens.hudreds.thousands)
		int output1 = a + d;
		int output2 = b + e;
		int output3 = c + f;
		
		//runs test on output to and establishes final results
		if((output1 == output2) && (output2 == output3)) {
			result = true;
		}
		else {
			result = false;
		}
		
		//results printed for user
		System.out.print("Your results are: " + result);
		
		//closes scanners
		scnr1.close();
		scnr2.close();
		
	}
}
