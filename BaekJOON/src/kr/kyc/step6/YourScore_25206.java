package kr.kyc.step6;

//import java.util.Arrays;
import java.util.Scanner;

public class YourScore_25206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 20;
        int cnt = n;
        for(int i = 0; i<n; i++)
        {
            String subject = scanner.next();
            double score = scanner.nextDouble();
            String grade = scanner.next();
        }
        



        System.out.println(subject);
        System.out.println(score);
        System.out.println(grade);
        System.out.println(gradeToDouble(grade));
        System.out.println("정답" + score*gradeToDouble(grade));

        // 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.


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
        else    return 10;
    }

}