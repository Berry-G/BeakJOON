package kr.kyc.step6;

import java.util.Scanner;

public class Star7_2444 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // N * 2 - 1
		
		//첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
		for(int i=0; i<n-1; i++)
		{
			for(int j=i; j<n-1; j++)
			{
				System.out.print("O");		//space
			}
			//for(int )
			for(int j=2; j<(i+1)*4; j=j+2)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				System.out.print("O");		//space
			}

			for(int j=i+15; j<(n)*2; j=j+2)
			{
				System.out.print("*");
			}
			System.out.println();
		}
					
	}

}
