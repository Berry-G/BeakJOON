package kr.kyc.step4;

import java.util.Scanner;

public class NoReport_5597 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[30];
		int[] result = new int[2];
		for(int i=0; i<28; i++)
		{
			arr[i] = scanner.nextInt();
		}
		for(int i=0; i<28; i++)
		{
			int cnt = 0;
			for(int j=0; j<30; j++)
			{
				if(arr[i] == j)
				{
					cnt++;
				}
				if(cnt > 0)
				{
					result[cnt] = j;
				}

			}
		}
	}
}
