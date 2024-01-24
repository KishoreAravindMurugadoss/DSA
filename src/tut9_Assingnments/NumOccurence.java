package tut9_Assingnments;

import java.util.Scanner;

public class NumOccurence {

	public static void main(String[] args) {

		System.out.println("---------- No of Occurence of a Number ----------");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = s.nextInt();
		System.out.print("Enter the target: ");
		int target = s.nextInt();
		int count = 0;
		while (num > 0) {
			int rem = num;
			
			rem %= 10;
			num /= 10;
			if (rem == target) {
				count++;
			}
		}
		if (count == 0)
			System.out.println("Target Not Found!");
		else
			System.out.println(count);
		s.close();
	}

}
