package tut8_Assingments;

import java.util.Scanner;

public class ArmstrongNumberFinder {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Lower Limit: ");
		int lowerLimit = s.nextInt();
		System.out.print("Upper Limit: ");
		int upperLimit = s.nextInt();
		if (lowerLimit > upperLimit) {
			int[] swappedValues = swapValuesIfNeeded(lowerLimit, upperLimit);
			lowerLimit = swappedValues[0];
			upperLimit = swappedValues[1];
		}
		System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are ");
		findArmstrongNumbers(lowerLimit, upperLimit);
		s.close();
	}

	private static int[] swapValuesIfNeeded(int lowerLimit, int upperLimit) {

		if (lowerLimit > upperLimit) {
			System.out.println("Swapping values because lower limit is greater than upper limit!");
			int temp = lowerLimit;
			lowerLimit = upperLimit;
			upperLimit = temp;
		}
		return new int[] {lowerLimit,upperLimit};
	}

	private static void findArmstrongNumbers(int lowerLimit, int upperLimit) {

		for(int i = lowerLimit; i <= upperLimit; i++) {
			if(isArmstrongNumber(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isArmstrongNumber(int number) {

		int originalNumber = number;
		int sum =0;
		int numDigit = (int) Math.log10(number) + 1;
		while(number != 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numDigit);
			number /= 10;
		}
		return sum == originalNumber;
	}

}
