package kr.kyc.step3;

import java.util.Scanner;

public class Sum_8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		num = num * (num + 1) / 2;
		System.out.println(num);
	}
}
