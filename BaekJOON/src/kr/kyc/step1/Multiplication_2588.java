package kr.kyc.step1;

import java.util.Scanner;

public class Multiplication_2588 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//입력값은 세자리 자연수로 제한
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int a,b,c,d;
		a = A * (B % 10);
		b = A * ((B/10) % 10);
		c = A * ((B/100) % 10); 
		d = A * B;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
