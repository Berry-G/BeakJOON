package kr.kyc.step2;

import java.util.Scanner;

public class Quadrant_14681 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x > 0 && y > 0) System.out.println(1);
		if(x > 0 && y < 0) System.out.println(4);
		if(x < 0 && y > 0) System.out.println(2);
		if(x < 0 && y < 0) System.out.println(3);
	}
}
