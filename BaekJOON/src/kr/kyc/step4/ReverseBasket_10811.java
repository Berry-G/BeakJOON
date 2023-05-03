package kr.kyc.step4;

import java.util.Scanner;

public class ReverseBasket_10811 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		//N개 바구니
		int m = scanner.nextInt();		//M번 바꿈
		int []arr = new int[n+1];		//첫 바구니는 비어있고 결과값 출력X
		
		//배열 초기값 설정
		for(int i=0; i<=n; i++)
		{
			arr[i]=i;
		}
		
		//M번 바꿈
		for(int j=0; j<m; j++)
		{
			int a, b;
			a = scanner.nextInt();	//바구니 시작번호
			b = scanner.nextInt();	//바구니 끝번호
			reverseSwap(arr, a, b);
			for(int i=1; i<=n; i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
		for(int i=1; i<=n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	static void reverseSwap(int arr[], int a, int b)
	{
		int temp;
		for(int i=0; i<(b-a)/2; i++)
		{
			temp = arr[i];
			arr[i] = arr[b-a];
			arr[b-a] = temp;

		}
		
		
		
	}
}
