package kr.kyc.step6;

//import java.util.Arrays;
import java.util.Scanner;

public class WordStudy_1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char[] wordArray = word.toCharArray();		//word를 char 배열로 변환
		int[] wordCnt = new int[26];
		for(int i=0; i<word.length(); i++)
		{
			for(int j=0; j<26; j++)
			{
				if(wordArray[i] == 'a' + j || wordArray[i] == 'A' + j)
				{
					wordCnt[j]++;
					break;
				}
			}
		}
		int max=0;
		char answer = 0;
		for(int i=0; i<26; i++)
		{
			char spell = (char) ('A' + i);
			//System.out.println(spell + "=" + wordCnt[i]);
			if(wordCnt[i] > max)
			{
				max = wordCnt[i];
				answer = spell;
			}
			else if(wordCnt[i] == max)
			{
				answer = '?';
			}
		}
		System.out.println(answer);
	}

}