class Student {
	public static void main(String[] args) {
		int en_mark = 60;
		int tm_mark = 60;
		int mt_mark = 60;
		int sc_mark = 81;
		int sl_mark = 75;

		System.out.println("My Science marks: " + sc_mark); // str + int is takes as str so arithmtric is not valid.
		System.out.println("My Maths, Science, Social marks: " + mt_mark + sc_mark + sl_mark);

		System.out.println("My Total marks: " + (en_mark + tm_mark + mt_mark + sc_mark + sl_mark) + "\n"); // change the preference with`()`

		System.out.println(1 + ") My English marks: " + en_mark);
		System.out.println(1 + 1 + ") My Tamil marks: " + tm_mark);
		System.out.println(1 + 1 + 1 +") My Maths marks: " + mt_mark);
		System.out.println(1 + 1 + 1 + 1 +") My Science marks: " + sc_mark);
		System.out.println(1 + 1 + 1 + 1 + 1 +") My Social marks: " + sl_mark);
	}
}