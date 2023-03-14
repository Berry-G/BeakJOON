package kr.kyc.step2;

import java.util.Scanner;

public class Test_results_9498 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();
		String result;
		if (score >= 90)
			result = "A";
		else if (score >= 80 && score < 90)
			result = "B";
		else if (score >= 70 && score < 80)
			result = "C";
		else if (score >= 60 && score < 70)
			result = "D";
		else
			result = "F";
		System.out.println(result);
	}
}

/*
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나 머지 점수는 F를
 * 출력하는 프로그램을 작성하시오.
 */