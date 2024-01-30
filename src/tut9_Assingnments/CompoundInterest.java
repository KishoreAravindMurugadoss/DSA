package tut9_Assingnments;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("P: ");
		double p = scanner.nextDouble();
		System.out.print("T: ");
		double t = scanner.nextDouble();
		System.out.print("N: ");
		double n = scanner.nextDouble();
		System.out.print("R: ");
		double r = scanner.nextDouble();
		double ci = calculateCompoundInterest(p, t, n, r);
		System.out.println("Compound Interest: " + ci);
		System.out.print("Amount: "+ (p + ci));
		scanner.close();
	}

	private static double calculateCompoundInterest(double p, double t, double n, double r) {
		return (p * (Math.pow((1 + (r / n)), n * t))) - p;
	}

}
