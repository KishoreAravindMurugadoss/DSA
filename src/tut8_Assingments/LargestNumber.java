package tut8_Assingments;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		System.out.println("---------- Greatest Number ----------");
		Scanner s = new Scanner(System.in);
		try {
		System.out.print("Enter an Integer: ");
		String a = s.next();
		System.out.print("Enter an other Integer: ");
		String b = s.next();
		greatestNumber(a, b); 
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter only Integer!");
		}
		finally {
			s.close();
		}
	}

	public static void greatestNumber(String n1, String n2) {

		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);

		if(a > b)
			System.out.println(a + " is the Greatest Number!");
		else if (a == b) 
			System.out.println("Both the numbers are Equal!");
		else if (a < b) 
			System.out.println(b + " is the Greatest Number!");
		else
			System.out.println("Invalid input");
	}

}
