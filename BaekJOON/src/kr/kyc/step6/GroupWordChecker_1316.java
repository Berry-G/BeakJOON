package kr.kyc.step6;

import java.util.Scanner;

public class GroupWordChecker_1316 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		int n = scanner.nextInt();
		scanner.nextLine();		//버퍼에 남아있는 엔터 값 삭제

		for (int frame = 0; frame < n; frame++) {
			String word = scanner.nextLine();
			char[] wordArray = word.toCharArray();

			// System.out.println();

			// 입력되는 단어는 소문자 알파벳으로만 제한된다.
			char[] chkChar = new char[26];
			int chkIndex = 0;
			int escape = 0;
			for (int i = 1; i < word.length(); i++) {
				if (wordArray[i] != wordArray[i - 1]) {
					chkChar[chkIndex] = wordArray[i - 1];
					chkIndex++;
				}
				for (int j = 0; j <= chkIndex; j++) {
					/*
					 * 비교문자 확인
					 * System.out.print(j + "번째" + chkChar[j] + " + " + wordArray[i]);
					 * System.out.println();
					 */

					if (chkChar[j] == wordArray[i]) {
						// System.out.println("중복문자 발견");
						escape++;
						break;
					}
				}
				if (escape == 1) {
					// System.out.println("escape");
					break;
				}
			}
			if (escape == 0) {
				cnt++;
			}
			// System.out.println(frame);
		}

		System.out.println(cnt);
	}
}
