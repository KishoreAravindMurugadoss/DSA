package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorsOfN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		try {
			int n = s.nextInt();
			System.out.println("The factors of " + n + " are: ");
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.println(i);
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please enter an Integer.");
		} finally {
			s.close();
		}

	}

}
