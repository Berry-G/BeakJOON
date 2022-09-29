package kr.kyc;

import java.util.Scanner;

public class Addcycle_1110
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int tempX = x;
		int xl, xr, result;
		for(int i = 0; i<9999; i++)
		{
			xl = leftX(x);
			xr = rightX(x);
			result = xl + xr;
			x = (xr*10)+(result%10);
//			System.out.println(x);
			if(x == tempX)
			{
				System.out.println(i+1);
				break;
			}
		}
	}
	
	static int leftX(int x)
	{
		return x/10; 
	}
	
	static int rightX(int x)
	{
		return x%10; 
	}
}
