package kr.kyc.step6;

import java.util.Scanner;

public class GroupWordChecker_1316 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt=0;
		int n = scanner.nextInt();
		for(int i = 0; i<=n; i++)
		{
			String word = scanner.nextLine();
			char[] wordArray = word.toCharArray();		//word를 char 배열로 변환
			
			for(int j=0; j<word.length(); j++)
			{
				char[] saveArray = new char[26];
				System.out.print(wordArray[j]);
			}
		}
		
		System.out.println(cnt);
	}
}
