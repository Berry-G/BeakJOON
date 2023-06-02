package kr.kyc.step6;

import java.util.Scanner;

public class Palindrome_10988 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] chr = input.toCharArray();
		int resultCnt = 0;
		for(int i = 0, cnt = input.length()-1; i<input.length()/2; i++)
		{
			//System.out.println(chr[i] + " " + chr[cnt]);
			if(chr[i] != chr[cnt])
				resultCnt++;
			cnt--;
		}
		if(resultCnt == 0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}

/*
 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 * 
 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
 * 
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
 */