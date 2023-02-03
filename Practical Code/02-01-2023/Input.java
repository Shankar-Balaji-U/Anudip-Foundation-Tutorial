import java.util.Scanner;

class Input
{
	public static void main(String[]args)
	{
		// Scanner is a class where the input method is return. 
		// To use the methods we have to create a object of a Scanner class.
		Scanner inputOne = new Scanner(System.in);
		Scanner inputTwo = new Scanner(System.in);

		System.out.print("Enter your first name: ");

		// To get a string input after the space.
		String firstName = inputOne.next(); 
		// Entered string Shankar Balaji
		// Input string Shankar

		System.out.print("Enter your last name: ");

		// To get a string input after the new line.
		String lastName = inputTwo.nextLine(); 
		// Entered string Shankar Balaji
		// Input string Shankar Balaji

		System.out.println("Your full name is " + firstName + " " + lastName);
	}
}
