package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommisionCalculator {

	public static void main(String[] args) {
		System.out.println("---------- Commision Calculator ----------");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the total sales: $");
			double totalSales = scanner.nextDouble();
			System.out.print("Enter the Commision rate (%): ");
			double commisionRate = scanner.nextDouble();
			double commisionAmount = calculateCommision(totalSales, commisionRate);
			System.out.print("Commision Amount: $" + commisionAmount);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter only numbers. ");
		} finally {
			scanner.close();
		}

	}

	private static double calculateCommision(double totalSales, double commisionRate) {
		if (commisionRate > 100 || totalSales < 0 || commisionRate < 0) {
			throw new IllegalArgumentException("Invalid Input!!! ");
		}
		return (totalSales * commisionRate) / 100;
	}

}
