package tut9_Assingnments;

import java.util.Scanner;

public class NumberSumCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int sumNegative = 0;
		int sumPositiveOdd = 0;
		int sumPositiveEven = 0;
		
		do {
			System.out.print("Enter: ");
			number = scanner.nextInt();
			if (number < 0) {
				sumNegative += number;
			} else if (number > 0) {
				if (number % 2 == 0) {
					sumPositiveEven += number;
				} else 
					sumPositiveOdd += number;
			}
		} while (number != 0);
		
		System.out.println("Sum of Negative Numbers: " + sumNegative);
		System.out.println("Sum of Positive Even Numbers: " + sumPositiveEven);
		System.out.println("Sum of Positive Odd Numbers: " + sumPositiveOdd);
		
		scanner.close();

	}

}
