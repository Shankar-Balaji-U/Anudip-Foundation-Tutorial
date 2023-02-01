class IncreDecreExamples {
	public static void main(String[] args) {

		// Example First
		int i = 0, j = 0;
		j = ++i + i + i++ + ++i + i++;

		System.out.println(	"1) Example for increment" + 
							"\n\tif i = 0, j = 0; \n\tj = ++i + i + i++ + ++i + i++" + 
							"\n\tthen i is is " + i + 
							"\n\tthen j is is " + j);

		// Example Second 
		int value = 0;
		value = value++;
		System.out.println(	"\n2) Example for increment" + 
							"\n\tif value = 0;" + 
							"\n\tthen value = value++ is " + value);

		// Example Three
		value = 0;
		value = value++ + value;
		System.out.println(	"\n3) Example for increment" + 
							"\n\tif value = 0;" + 
							"\n\tthen value = value++ + value is " + value);

		// Example Four
		i = j = 0;
		System.out.println(	"\n4) Example for decrement" + 
							"\n\tif i = 0, j = 0;" + 
							"\n\tthen --i is " + --i + 
							"\n\tthen i-- is " + i-- + 
							"\n\tthen i is " + i);
	}
}