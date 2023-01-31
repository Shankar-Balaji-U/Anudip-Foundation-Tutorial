class DataTypes {
	public static void main(String[] args) {
		int age = 60;
		char initial_name = 'U';
		String full_name = "Shankar Balaji";
		float height = 6.3f;
		boolean isInfo = true;

		int birthDays = 04;
		int birthMonth = 11;
		int birthYear = 1999;

		int todayDays = 31;
		int todayMonth = 1;
		int todayYear = 2023;

		double totalDays = (todayYear - birthYear) * 365 + 6;
		// double birthSeconds = totalYears;

		System.out.println("My name is " + initial_name + " " + full_name + " and my age " + age);
		System.out.println("My height is " + height + "feet");
		System.out.println("Total days from the birth " + birthDays);
		System.out.println("The above informations are " + isInfo);
	}
}