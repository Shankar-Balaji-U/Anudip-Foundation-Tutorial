import java.util.Scanner;

class FlowControl {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		if(age > 8) {
			System.out.println("Give yellow color balloon to them.");
		} else {
					
			System.out.print("Enter your gender: ");
			String gender = input.next();

			if(gender.equals("boy")) {
				System.out.println("Give blue color balloon to them.");
			} else if(gender.equals("girl")) {
				System.out.println("Give pink color balloon to them.");
			} else {
				System.out.println("Sorry, gender not found.");
			}
		}
	}
}
