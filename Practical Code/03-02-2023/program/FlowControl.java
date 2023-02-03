class FlowControl {
	public static void main(String[] args) {

		boolean isTrue = true;
		// Simple if statement
		System.out.println("1) simple if statement example");
		if (isTrue) {
			System.out.println("Yes, it is " + isTrue + "\n");
		}

		// if-else statement
		System.out.println("2) if-else statement example");
		if (!isTrue) {
			System.out.println("Yes, it is " + isTrue + "\n");
		} else {
			System.out.println("No, it is " + !isTrue + "\n");
		}

		// Nested if-else statement
		System.out.println("3) Nested if-else statement example");
		if (isTrue) {
			if (isTrue) {
				if (!isTrue || isTrue) {
					System.out.println("Yes, it is " + isTrue + "\n");
				} else {
					System.out.println("You idiot (* ~ *)" + "\n");
				}
			}
		}

		// if-else ladder statement
		System.out.println("3) if-else ladder statement example");
		if (!isTrue) {
			System.out.println("Yes, it is " + isTrue + "\n");
		} else if (!isTrue || isTrue) {
			System.out.println("Yes, it is " + (!isTrue || isTrue) + "\n");
		} else {
			System.out.println("You idiot (* ~ *)" + "\n");
		}
	}
}