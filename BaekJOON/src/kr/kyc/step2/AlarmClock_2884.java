package kr.kyc.step2;

import java.util.Scanner;

public class AlarmClock_2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H, M;
		H = scan.nextInt();
		M = scan.nextInt();
		
//		System.out.println(H + ":" + M);
		
		//입력한 시간에서 45분 감소
		//분이 45분 이상일때
		if(M >= 45) M -= 45;
		else
		{
			H -= 1;
			if(H < 0)
				H = 23;
			M += 15;
		}
		System.out.println(H + " " + M);
		
	}
}
