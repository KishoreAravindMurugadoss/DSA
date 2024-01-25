package tut9_Assingnments;

import java.util.Scanner;

public class NumReverse {

	public static void main(String[] args) {
		System.out.println("---------- Reversing A Number ----------");
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = s.nextInt();
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			num /= 10;
			rev = rev * 10 + rem;
		}
		System.out.print("Result: " + rev);
		s.close();
	}

}
