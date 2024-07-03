package aischool.java.Ex03conditional_statement.else_if;

import java.util.Scanner;

public class Ex02else_if {
    
    public static void main(String[] args) {
        
        // 실습) 학점 계산 프로그램
        // 사용사로부터 점수를 입력 받고
        // 점수가 90점 이상이면 A학점 입니다.
        // 80점 이상이면 B학점 입니다.
        // 70점 이상이면 C학점 입니다.
        // 60점 이상이면 D학점 입니다.
        // 60점 미만이면 F학점 입니다. 출력하기

        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 점수 입력받기
        System.out.println("점수를 입력하세요.");
        int score = sc.nextInt();
        // 3) 조건확인해서 출력하기
        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("B학점 입니다.");
        } else if (score >= 70) {
            System.out.println("C학점 입니다.");
        } else if (score >= 60) {
            System.out.println("D학점 입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }   
    }
}
