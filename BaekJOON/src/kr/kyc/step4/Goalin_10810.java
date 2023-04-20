package kr.kyc.step4;

import java.util.Scanner;

public class Goalin_10810 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		//N개 바구니
		int m = scanner.nextInt();		//M번 바꿈
		int []arr = new int[n+1];		//첫 바구니는 비어있음
		for(int i=0; i<=n; i++)
		{
			arr[i]=0;
		}
		for(int j=0; j<m; j++)
		{
			int a = scanner.nextInt();	//바구니 시작번호
			int b = scanner.nextInt();	//바구니 끝번호
			int c = scanner.nextInt();	//공 넣기
			for(int i = a; i<=b; i++)
			{
				arr[i] = c;
			}
		}
		for(int i=1; i<=n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
