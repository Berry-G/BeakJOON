package kr.kyc.step6;

import java.util.Scanner;

public class WordStudy_1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char[] wordArray = word.toCharArray();		//word를 char 배열로 변환
		for(int i=0; i<word.length(); i++)
		{
			System.out.println(wordArray[i]);
			
		}
	}

}
