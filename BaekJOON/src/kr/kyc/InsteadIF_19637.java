package kr.kyc;

import java.util.Scanner;

/**
 * 
 * @author rlask
 *첫 번째 줄에는 칭호의 개수 N (1 ≤ N ≤ 105)과 칭호를 출력해야 하는 캐릭터들의 개수 M (1 ≤ M ≤ 105)이 빈칸을 사이에 두고 주어진다. (1 ≤ N, M ≤ 105)

두 번째 줄부터 N개의 줄에 각 칭호의 이름을 나타내는 길이 1 이상, 11 이하의 영어 대문자로만 구성된 문자열과 해당 칭호의 전투력 상한값을 나타내는 109 이하의 음이 아닌 정수가 주어진다. 칭호는 전투력 상한값의 비내림차순으로 주어진다. 

N + 2번째 줄부터 M개의 각 줄에는 캐릭터의 전투력을 나타내는 음이 아닌 정수가 주어진다. 해당하는 칭호가 없는 전투력은 입력으로 주어지지 않는다.
 */

public class InsteadIF_19637
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int styleNum = scan.nextInt();
		int characterNum = scan.nextInt();
		System.out.println(styleNum + "," + characterNum);
		String[] style = new String[styleNum];
		int[] styleIF = new int[styleNum];
		for(int i = 0; i<styleNum; i++)
		{
			style[i] = scan.next();
			styleIF[i] = scan.nextInt();
		}
		for(int i = 0; i<characterNum; i++)
		{
			int power = scan.nextInt();
			for(int j = 0; j<styleNum; j++)
			if(power <= styleIF[i])
				System.out.println(style[i]);
		}
	}
	

}
