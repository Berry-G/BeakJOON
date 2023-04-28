package kr.kyc.step4;

import java.util.Scanner;

public class NoReport_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[31];
        int[] result = {0, 0};
        int count=0;
        for(int i=0; i<28; i++)
        {
            int num = scanner.nextInt();
            arr[num] = 1;
        }
        for(int i=1; i<=30; i++)
        {
            if(arr[i] == 0)
            {
                result[count] = i;
                count++;
            }
        }
        for(int i=0; i<2; i++)
        {
            System.out.println(result[i]);
        }
    }
}