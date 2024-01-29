package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		System.out.println("---------- Distance Calculator ----------");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the Coordinates of point 1");
			System.out.print("x1: ");
			double x1 = scanner.nextDouble();
			System.out.print("y1: ");
			double y1 = scanner.nextDouble();
			System.out.println("Enter the Coordinates of point 2");
			System.out.print("x2: ");
			double x2 = scanner.nextDouble();
			System.out.print("y2: ");
			double y2 = scanner.nextDouble();
			double distance = calculateDistance(x1,y1, x2, y2);
			System.out.println("Distance between the points is " + distance);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter only numbers. ");
		} finally {
			scanner.close();
		}

	}

	private static double calculateDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
