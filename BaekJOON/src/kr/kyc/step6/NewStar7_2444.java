package kr.kyc.step6;

import java.util.Scanner;

public class NewStar7_2444 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int starSize = scanner.nextInt(); // N * 2 - 1

		printStarPattern(starSize);
	}

	static void printStarPattern(int size) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size - 1; i++) {
			for (int j = i; j < size - 1; j++) {
				sb.append(" "); // space
			}

			for (int j = 1; j < (i + 1) * 2; j++) {
				sb.append("*");
			}

			sb.append(System.lineSeparator());
		}

		for (int i = 1; i < 2 * size; i++) {
			sb.append("*");
		}

		sb.append(System.lineSeparator());

		int k = size;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				sb.append(" "); // space
			}

			for (int j = 0; j < (k - 1) * 2 - 1; j++) {
				sb.append("*");
			}

			k--;
			sb.append(System.lineSeparator());
		}

		System.out.print(sb.toString());
	}
}