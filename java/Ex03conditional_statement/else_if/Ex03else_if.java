package aischool.java.Ex03conditional_statement.else_if;

import java.util.Scanner;

public class Ex03else_if {
    
    public static void main(String[] args) {
        
        // 실습) 정보처리기사 합격 기준에 맞춰 합격/불합격 판단하기
        // 기준은 5과목 중 하나라도 8개 미만이면 불합격
        // 5과목 총 개수가 60미만이면 불합격

        // 1) 입력 도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 5과목 점수 입력 받기
        System.out.print("1과목 : ");
        int a = sc.nextInt();
        System.out.print("2과목 : ");
        int b = sc.nextInt();
        System.out.print("3과목 : ");
        int c = sc.nextInt();
        System.out.print("4과목 : ");
        int d = sc.nextInt();
        System.out.print("5과목 : ");
        int e = sc.nextInt();
        // 3) 합격/불합격 판단하기
        if (a < 8 || b < 8 || c < 8 || d < 8 || e < 8) {
            System.out.println("불합격");
        }else if (a + b + c + d + e < 60) {
            System.out.println("불합격");
        }else {
            System.out.println("합격");
        }

    }
}
