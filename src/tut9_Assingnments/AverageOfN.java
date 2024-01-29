package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageOfN {

	public static void main(String[] args) {
		System.out.println("---------- Average Of N numbers ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		try {
			double n = scanner.nextDouble();
			double sum = 0;
			double temp;
			for (int i = 1; i <= n; i++) {
				System.out.print("Enter value for n" + i + " : " );
				temp = scanner.nextDouble();
				sum = sum + temp;
			}
			double avg = sum / n;
			System.out.println("Average of " + n + " numbers is: " + avg);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter only numbers. ");
		} finally {
			scanner.close();
		}


	}

}
