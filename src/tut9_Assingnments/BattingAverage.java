package tut9_Assingnments;

import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		System.out.println("---------- Batting Average ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Total Runs Scored: ");
		int totalRuns = scanner.nextInt();
		System.out.print("Number of times eliminated: ");
		int out = scanner.nextInt();
		double battingAvg = (double)averageBatting(totalRuns, out);
		System.out.print("Batting Average: " + battingAvg);
		scanner.close();
	}

	private static double averageBatting(int totalRuns, int out) {
		double battingAvg;
		if (out < 0) {
			throw new IllegalArgumentException("Invalid Input for out!");
		}
		else if (out == 0) {
			battingAvg = totalRuns;
		}
		else {
			battingAvg = totalRuns / out;
		}
		return battingAvg;
	}

}
