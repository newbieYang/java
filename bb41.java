import java.util.Scanner;

public class bb41 {

public static void main (String args[]) {
	
		/*
		 * Write a fragment of code that will read words from the keyboard until the
		 * word done is entered. For each word except done, report whether its first
		 * character is equal to its last character.
		 * 
		 * For the required loop, use a
		 * 
		 * while statement do-while statement
		 */
	System.out.println("enter a word");
	Scanner input = new Scanner(System.in);
	String entered = input.nextLine();
	String done = "done";
	boolean b = entered.contentEquals(done);
	do {
		char a = entered.charAt(0); // find the first char named a
		int i = entered.length();// find the length of the string 
		int j = entered.lastIndexOf(a); // find the last index of char named a 
		// if the last index of char named a is equal to (length of string - 1), the first char is equal to the last
		if (j == i-1) {
			System.out.println("the first characater is as same as the last one");}
		else {System.out.println("the first characater is not as same as the last one");}
		Scanner keyboard = new Scanner(System.in);
		entered = keyboard.nextLine();
		b = entered.equals(done);
		//make a statement for the next condition of this loop
   }while (b == false);
}


}
