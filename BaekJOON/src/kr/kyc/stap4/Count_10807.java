package kr.kyc.stap4;

import java.util.Scanner;

public class Count_10807 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int []x = new int[n];
		int cnt=0;
		for(int i=0; i<n; i++)
		{
			x[i] = scanner.nextInt();
		}
		int v = scanner.nextInt();
		for(int i=0; i<n; i++)
		{
			if(x[i] == v)
				cnt++;
		}
		System.out.println(cnt);
	}
}
