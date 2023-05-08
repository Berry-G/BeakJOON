package kr.kyc.step5;

import java.util.Scanner;

public class FindAlphabet_10809 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		char[] SChar = S.toCharArray();		//S를 char 배열로 변환
		
		for(char j='a'; j<='z'; j++)
		{
			int cnt = 1;
			for(int i=0; i<S.length(); i++)
			{
				if(j == SChar[i])
				{
					System.out.print(i + " ");
					cnt--;
					break;
				}
			}
			if(cnt==1)
				System.out.print("-1 ");
		}
	}
	
}
