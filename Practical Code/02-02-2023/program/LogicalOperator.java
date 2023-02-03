class LogicalOperator
{
	public static void main(String[]args)
	{
		/*
			Logical Symbols
			
			& / &&			AND (If both the condition is true the result will be true)
			| / ||			OR (If any one condition is true the result will be true)
			!			NOT (If the condition is true the result will be false. or Vice-Versa)
			
			&& will not check the next logic is True or Not. if the before logic is False.
			|| It will check the next logic is True. if the before logic is False.
		*/

    	// all true is true
    	System.out.println("For AND gate truth table:");
    	System.out.println("\ttrue \t&& \ttrue \t: " + (true && true));
    	System.out.println("\ttrue \t&& \tfalse \t: " + (true && false));
    	System.out.println("\tfalse \t&& \ttrue \t: " + (false && true));
    	System.out.println("\tfalse \t&& \tfalse \t: " + (false && false));

    	// atleast one true is true
    	System.out.println("\nFor OR gate truth table:");
    	System.out.println("\ttrue \t|| \ttrue \t: " + (true || true));
    	System.out.println("\ttrue \t|| \tfalse \t: " + (true || false));
    	System.out.println("\tfalse \t|| \ttrue \t: " + (false || true));
    	System.out.println("\tfalse \t|| \tfalse \t: " + (false || false));

    	// true is false;  false is true
    	System.out.println("\nFor NOT gate truth table:");
    	System.out.println("\t!true \t: " + !true);
    	System.out.println("\t!false \t: " + !false);
	}
}