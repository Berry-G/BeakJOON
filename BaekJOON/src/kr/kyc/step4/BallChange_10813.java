package kr.kyc.step4;

import java.util.Scanner;

public class BallChange_10813 {

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
			int a, b, temp;
			a = scanner.nextInt();	//바구니 시작번호
			b = scanner.nextInt();	//바구니 끝번호
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		for(int i=1; i<=n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
