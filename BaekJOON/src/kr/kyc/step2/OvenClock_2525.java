package kr.kyc.step2;

import java.util.Scanner;

public class OvenClock_2525 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 현재시간
		int H, M;
		H = scan.nextInt();
		M = scan.nextInt();
		// 조리시간(분)
		int cook = scan.nextInt();

		// 요리 완성 시간 = 현재시간 + 조리시간
		M += cook;

		// 시간 형식을 어기지 않을 때 까지 반복
		while (H >= 24 || M >= 60) {
			if (M >= 60) {
				M -= 60;
				H += 1;

				if (H > 23) {
					H -= 24;
				}
			}
		}

		System.out.println(H + " " + M);

	}
}
