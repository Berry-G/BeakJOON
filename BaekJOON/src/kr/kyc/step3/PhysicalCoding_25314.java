package kr.kyc.step3;

import java.util.Scanner;

public class PhysicalCoding_25314 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String result = "";
		for(int i = 0; i < (N/4); i++)
		{
			result = result + "long ";
		}
		System.out.println(result + "int");
	}
}
