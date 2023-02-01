class Increment {
	public static void main(String[] args) {
		int i = 0;

		/*	
			Post increment:
			increment is done after the assignment is done. and the previous i value is returned.
		*/ 
		System.out.println(	"if i = " + i + "; then i++ = " + i++);


		/*	
			Pre increment:
			increment is done before the assignment is done. and the incremented value is returned.
		*/ 
		System.out.println(	"if i = " + i + "; then ++i = " + ++i);
	}

}