package mypackage;

import java.util.Iterator;

public class ReverseString{
	public static void main(String[] args) {
		String firstString = "Sanju";
		String reversedString = "";
		char ch;
		System.out.println("Original String: " + firstString);
		for(int i = 0; i < firstString.length(); i++) {
			ch = firstString.charAt(i);
			reversedString = ch + reversedString;
		}
		System.out.println("The reversed String is: " + reversedString);
	}
}