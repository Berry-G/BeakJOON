package kr.kyc;

import java.util.Scanner;

public class String_9086 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String str = scanner.next();
		System.out.println(str.substring(size));
		scanner.close();
	}
}

/*
3
ACDKJFOWIEGHE
O
AB
*/