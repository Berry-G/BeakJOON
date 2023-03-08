package kr.kyc;

import java.util.Scanner;

public class String_9086 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			String str = scanner.next();
			// 첫글자 추출
			String fChar = str.substring(0, 1);
			// 마지막글자 추출
			String lChar = str.substring(str.length() - 1, str.length());
			String result = fChar + lChar;
			System.out.println(result);
		}
		scanner.close();
	}
}
