package tut9_Assingnments;

import java.util.*;

public class AdditionTill0 {

	public static void main(String[] args) {
		System.out.println("---------- Addition untill 0 ----------");
		Scanner scanner = new Scanner(System.in);
		try {
			boolean loop = true;
			int sum = 0;
			while (loop) {
				System.out.print("Enter: ");
				int n = scanner.nextInt();
				if (n == 0) {
					loop = false;
					System.out.print("Result: ");
					break;
				}
				sum = sum + n;
			}
			System.out.print(sum);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please enter an Integer.");
		} finally {
			scanner.close();
		}

	}

}
