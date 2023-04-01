package kr.kyc.step3;

import java.util.Scanner;

public class Star2_2439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		//별 갯수
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
