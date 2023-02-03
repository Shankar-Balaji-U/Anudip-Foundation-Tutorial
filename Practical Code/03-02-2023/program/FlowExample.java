import java.util.Scanner;

class FlowExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("To start program enter 'start': ");
		String str = input.next();

		if (str.equals("start")) {
			System.out.println("Let's start...");
		}


		System.out.print("Choose a number between 0 - 10: ");
		int value = input.nextInt();

		// if-else statement
		if ((0 <= value) & (value <= 10)) {
			System.out.println("Your are an Honest person (- 0 -)");
		} else {
			System.out.println("You idiot (* ~ *)");
		}
	}
}