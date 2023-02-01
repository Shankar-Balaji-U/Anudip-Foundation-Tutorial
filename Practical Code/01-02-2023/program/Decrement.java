class Decrement {
	public static void main(String[] args) {
		int i = 0;

		/*	
			Post decrement:
			decrement is done after the assignment is done. and the previous i value is returned.
		*/ 
		System.out.println(	"if i = " + i + "; then i-- = " + i--);

		/*	
			Pre decrement:
			decrement is done before the assignment is done. and the decremented value is returned.
		*/ 
		System.out.println(	"if i = " + i + "; then --i = " + --i);
	}

}