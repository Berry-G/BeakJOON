package kr.kyc.step2;

import java.util.Scanner;

public class ThreeDice_2480 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		int price = 0;

		if(num1 == num2 && num2 == num3)
		{
			price = 10000 + (num1*1000);
		}
		else if (num1 == num2 || num1 == num3)
		{
			price = 1000 + (num1 * 100);
		}
		else if (num2 == num3)
		{
			price = 1000 + (num2 * 100);
		}
		else
		{
			int max = 0;
			if(num1 > num2 && num1 > num3) max = num1;
			else if(num2 > num1 && num2 > num3) max = num2;
			else if(num3 > num1 && num3 > num2) max = num3;
			price = max * 100;
		}
	}
}

/*
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은
 * 눈)×100원의 상금을 받게 된다. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 */
