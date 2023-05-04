package kr.kyc.step4;

import java.util.Scanner;

public class AVG_1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		//N개 과목
		double []score = new double[n];
		double max=0, sum=0;
		for(int i = 0; i < n; i++)
		{
			score[i] = scanner.nextInt();
			max = Math.max(max, score[i]);
		}
		//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		for(int i = 0; i < n; i++)
		{
			score[i] = score[i] / max * 100;
			sum += score[i];
		}
		System.out.println(sum/n);
	}
}
