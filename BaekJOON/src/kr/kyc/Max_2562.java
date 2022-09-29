package kr.kyc;

import java.util.ArrayList;
import java.util.Scanner;

public class Max_2562
{
	public static void main(String[] args)
	{
		//9개의 자연수 주어지면 max값, i값 출력
		int index = 0;
		int max = 0;
		ArrayList<Integer> num = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<10; i++)
		{
			num.add(scan.nextInt());
			if(max < num.get(i-1))
			{
				max = num.get(i-1);
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index);

		for(int i=0; i<9; i++)
			System.out.println();
	}
}
