package kr.kyc.step6;

import java.util.Scanner;

public class CroatianAlphabet_2941 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char[] wordArray = word.toCharArray();		//word를 char 배열로 변환
		int cnt=0;
		/*
		 * 크로아티아 알파벳
		 * c=, c-, dz=, d-, lj, nj, s=, z=
		 */

		String[] croatian2len = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
		String[] croatian3len = {"dz="};
		if(word.length() < 2)
		{

		}
		else {
			for(int i=0; i < word.length()-1; i++)
			{
				String compare2 = charToString(i, i+2, wordArray);
//				System.out.println(compare2);
				//3글자 크로아티안 예외처리
				if(compare2.equals("dz") && i != word.length()-2)
				{
					String compare3 = charToString(i, i+3, wordArray);
					if(compare3.equals(croatian3len[0]))
						cnt++;
//					System.out.println(compare3);
				}
				for(int j=0; j<croatian2len.length; j++)
				{
					if(compare2.equals(croatian2len[j]))
					{
						cnt++;
						break;
					}
				}
			}
		}
		
		System.out.println(word.length()-cnt);
	}
	
	static String charToString(int start, int end, char[] text)
	{
		char[] arr = new char[end - start];
		int cnt=0;
		for(int i = start; i < end; i++)
		{
			arr[cnt] = text[i];
			cnt++;
		}
		String str = new String(arr);
		return str;
	}
}
