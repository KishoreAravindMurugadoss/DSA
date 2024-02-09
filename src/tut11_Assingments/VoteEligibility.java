package tut11_Assingments;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		System.out.println("---------- Vote Eligibility ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Age? ");
		int age = scanner.nextInt();
		boolean bool = isEligible(age);
		if (bool) {
			System.out.println("You are Eligible to vote!");
		}
		else
			System.out.println("You are not Eligible to vote!");
		scanner.close();

	}

	private static boolean isEligible(int age) {
		boolean bool = true;
		if (age < 18) {
			bool = false;
		}
		return bool;
	}

}
