package kr.kyc.step5;

import java.util.Scanner;

public class Sangsoo_2908 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		A = reverseNumber(A);
		B = reverseNumber(B);
		
		// A가 무조건 큰 값으로 설정
		if (A < B)
			A = B;

		System.out.println(A);
	}
	
	static int reverseNumber(int x)
	{
		String temp = String.valueOf(x); // String으로 형변환
		char[] tempChar = temp.toCharArray(); // temp를 char 배열로 변환
		char[] resultChar = temp.toCharArray();
		int j=0;
		for (int i = temp.length()-1; i >= 0; i--) {
			resultChar[j]=tempChar[i];
			j++;
		}
		String result = new String(resultChar);
		return Integer.parseInt(result);
		
	}
}
