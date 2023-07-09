package kr.kyc.step6;

import java.util.Scanner;

public class YourScore_25206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 20;
        // int cnt = n;    //Pass를 제외한 총 과목갯수
        //전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
        double majorSum = 0;   //전공과목별 (학점 × 과목평점)의 합
        double scoreSum = 0;   //학점의 합
        for(int i = 0; i<n; i++)
        {
            String subject = scanner.next();
            double score = scanner.nextDouble();
            String grade = scanner.next();

            if(!grade.equals("P"))
            {
                majorSum = majorSum + (score * gradeToDouble(grade));
                scoreSum = scoreSum + score;
            }

            // System.out.println(scoreSum);
        }

        // System.out.println(majorSum);
        // System.out.println(scoreSum);
        System.out.println(majorSum / scoreSum);

    }

    static double gradeToDouble(String grade)
    {
        if(grade.equals("A+")) return 4.5;
        else if(grade.equals("A0")) return 4.0;
        else if(grade.equals("B+")) return 3.5;
        else if(grade.equals("B0")) return 3.0;
        else if(grade.equals("C+")) return 2.5;
        else if(grade.equals("C0")) return 2.0;
        else if(grade.equals("D+")) return 1.5;
        else if(grade.equals("D0")) return 1.0;
        else if(grade.equals("F")) return 0.0;
        else    return 0;
    }

}