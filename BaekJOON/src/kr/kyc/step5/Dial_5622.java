package kr.kyc.step5;

import java.util.Scanner;
//import java.util.Arrays;

public class Dial_5622 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String capitalLetter = scanner.nextLine();
		int[] alpha = convert(capitalLetter);
		//System.out.println(Arrays.toString(alpha));	//Check
		int sum = 0;
		for(int i=0; i<capitalLetter.length(); i++)
		{
			sum += alpha[i] + 1;
		}
		System.out.println(sum);
	}
	
	//문자열을 숫자배열로 반환
	static int[] convert(String S)
	{
		char[] chr = S.toCharArray();
		int[] num = new int[S.length()];
		for(int i=0; i<S.length(); i++)
		{
			if('A' <= chr[i] && chr[i] <= 'C')	num[i] = 2;
			else if('D' <= chr[i] && chr[i] <= 'F')	num[i] = 3;
			else if('G' <= chr[i] && chr[i] <= 'I')	num[i] = 4;
			else if('J' <= chr[i] && chr[i] <= 'L')	num[i] = 5;
			else if('M' <= chr[i] && chr[i] <= 'O')	num[i] = 6;
			else if('P' <= chr[i] && chr[i] <= 'S')	num[i] = 7;
			else if('T' <= chr[i] && chr[i] <= 'V')	num[i] = 8;
			else if('W' <= chr[i] && chr[i] <= 'Z')	num[i] = 9;
		}
		return num;
	}

}
