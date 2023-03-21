package kr.kyc.step3;

import java.util.Scanner;

public class Recipt_25304 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int totalX = scan.nextInt();
		int kindN = scan.nextInt();
		int sum = totalX;
		for(int i=0; i<kindN; i++)
		{
			int price = scan.nextInt();
			int number = scan.nextInt();
			sum = sum - (price * number);
		}
		if(sum == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}
