package kr.kyc.step6;

import java.util.Arrays;
import java.util.Scanner;

public class WordStudy_1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char[] wordArray = word.toCharArray();		//word를 char 배열로 변환
		int[] wordCnt = new int[26];
		for(int i=0; i<word.length(); i++)
		{
			System.out.println(wordArray[i]);
			for(int j=0; j<26; j++)
			{
				if(wordArray[i] == 'a' + j || wordArray[i] == 'A' + j)
				{
					wordCnt[j]++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(wordCnt));
	}

}