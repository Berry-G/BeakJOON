package kr.kyc.step1;

import java.util.Scanner;

public class FAO_10869 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);

		scan.close();
	}
}
