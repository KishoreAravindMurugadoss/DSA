package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class N_Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		try {
			int n = scanner.nextInt();
			int facto = 1;
			int dup = n;
			while(dup > 0) {
				facto = facto * dup;
				dup--;
			}
			System.out.print(n + " Factorial is " + facto);
		} catch(InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter an Integer. ");
		} finally {
			scanner.close();
		}

	}

}
