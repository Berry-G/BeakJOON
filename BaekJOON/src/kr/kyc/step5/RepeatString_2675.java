package kr.kyc.step5;

import java.util.Scanner;

public class RepeatString_2675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt(); //테스트 케이스의 갯수
		for(int i=0; i<T; i++)
		{
			int R = scanner.nextInt();	//반복 횟수
			String S = scanner.nextLine();
			char[] SChar = S.toCharArray();		//S를 char 배열로 변환
			for(int j=0+1; j<S.length(); j++)
			{
				for(int k = 0; k<R; k++)
				{
					System.out.print(SChar[j]);
				}
			}
			System.out.println();
		}
	}

}
