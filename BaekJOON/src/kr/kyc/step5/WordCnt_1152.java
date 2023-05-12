package kr.kyc.step5;

import java.util.Arrays;
import java.util.Scanner;

public class WordCnt_1152 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String[] words = sentence.split(" "); // 공백을 기준으로 문자열을 나눔
//		System.out.println(Arrays.toString(words));
		int cnt = words.length; // 단어의 개수 = 배열의 크기
		for(int i=0; i<words.length; i++)
		{
			if(words[i].equals(""))
			{
				cnt--;
			}
		}
			
		System.out.println(cnt);
	}
}
