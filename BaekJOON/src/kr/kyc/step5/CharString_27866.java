package kr.kyc.step5;

import java.util.Scanner;

public class CharString_27866 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		char[] SChar = S.toCharArray();		//S를 char 배열로 변환
		
		int i = scanner.nextInt();
		System.out.println(SChar[i-1]);
	}
}
