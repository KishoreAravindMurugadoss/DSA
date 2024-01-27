package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestUntil0 {

	public static void main(String[] args) {

		System.out.println("---------- Greatest untill 0 ----------");
		Scanner scanner = new Scanner(System.in);
		try {
			boolean loop = true;
			int g = 0;
			while (loop) {
				System.out.print("Enter: ");
				int n = scanner.nextInt();
				if (n != 0) {
					if (g < n) {
						g = n;
					}
				} else {
					loop = false;
					System.out.print("Greatest number: ");
					break;
				}
			} 
			System.out.print(g);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter only Integer type.");
		} finally {
			scanner.close();
		}
	}

}
