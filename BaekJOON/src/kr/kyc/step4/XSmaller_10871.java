package kr.kyc.step4;

import java.util.Scanner;

public class XSmaller_10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int []arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = scanner.nextInt();
		}

		for(int i=0; i<n; i++)
		{
			if(arr[i] < x)
				System.out.print(arr[i] + " ");
		}
	}
}
