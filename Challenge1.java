package mypackage;

public class Challenge1 {
	public static void main(String[] args) {
		byte num1 = 2;
		short num2 = 4;
		int num3 = 6;
		long num4 = 50000 + 10* (num1 + num2 + num3);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		short num5 = (short) (1000 + 10 * (num1 + num2 + num3));
		System.out.println(num5);
	}

}
