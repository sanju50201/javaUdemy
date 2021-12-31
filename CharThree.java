package mypackage;

public class CharThree {
	public static void main(String[] args) {
		String myString = "This is a string";
		myString = myString + ", and here as well";
		myString = myString + ",one more if this works";
		myString = myString + "\u00dd";
		System.out.println(myString);		
		String numberString = "250.84";
		numberString = numberString + "45.85";
		System.out.println(numberString);
		String lastString = "10";
		int myIntValue = 5;
		lastString = lastString + myIntValue;
		System.out.println(lastString);
		int num1 = 5;
		num1 = num1 + 55;
		System.out.println(num1);
		double doubleValue = 25.35d;
		lastString = lastString + doubleValue;
		System.out.println(lastString);
	}

}
