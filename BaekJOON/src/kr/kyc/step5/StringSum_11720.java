package kr.kyc.step5;

import java.util.Scanner;

public class StringSum_11720 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine(); // 개행 문자 제거
		String S = scanner.nextLine();
		char[] SChar = S.toCharArray();		//S를 char 배열로 변환
//		System.out.println(S);
//		System.out.println(S.length());
		int sum=0;
		for(int i=0; i<n; i++)
		{
			sum = sum + (int)SChar[i] - 48;
		}
		System.out.println(sum);
	}
}
