package tut8_Assingments;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {

		System.out.println("---------------- Greeting Someone Program ----------------");
		System.out.println();
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println("Hey there! What's your name?");
		String name = s.nextLine();
		System.out.println("It's a pleasure to meet you, " + name);
		s.close();
	}

}
