package tut9_Assingnments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter: ");
		String input = scanner.next();
		String reversed = reversing(input);
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reversed);

	}

	private static String reversing(String input) {
		StringBuilder sBuilder = new StringBuilder(input);
		sBuilder.reverse();
		return sBuilder.toString();
	}

}
