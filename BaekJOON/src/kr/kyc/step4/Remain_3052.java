package kr.kyc.step4;

import java.util.Scanner;

public class Remain_3052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		final int X = 42; // 나누는 숫자
		final int N = 10; // 반복 횟수
		// 중복값 제거를 묻는 문제
		int count = N; // 중복되는 값이 나올때마다 감소시키면

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
			arr[i] = remain(arr[i], X);
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
	
	static int remain(int a, int X)
	{
		return a%X;
	}
}
