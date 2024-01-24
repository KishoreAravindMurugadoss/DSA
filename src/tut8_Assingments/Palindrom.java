package tut8_Assingments;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		System.out.println("---------- Palindrome ----------");
		Scanner s = new Scanner(System.in);
		System.out.print("Type Something... ");
		String str  = s.nextLine();
		if(isPalindrom(str))
			System.out.println("The given String is a Palindrome!");
		else
			System.out.println("The given String is not a Palindrome!");
		s.close();
	}

	private static boolean isPalindrom(String str) {

		str = str.replaceAll("//s", "").toLowerCase();
		int length = str.length();
		for(int i = 0; i < length / 2; i++) {
			if(str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

}
