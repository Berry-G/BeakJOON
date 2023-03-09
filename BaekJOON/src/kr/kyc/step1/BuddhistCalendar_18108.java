package kr.kyc.step1;

import java.util.Scanner;

public class BuddhistCalendar_18108 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		//불기 연도 2541 -> 서기 연도 1998
		System.out.println((A - 543));

		scan.close();
	}
}
