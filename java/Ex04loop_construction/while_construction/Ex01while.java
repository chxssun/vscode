package aischool.java.Ex04loop_construction.while_construction;

import java.util.Scanner;

public class Ex01while {
    
    public static void main(String[] args) {
        
        // while문
        // 반복횟수가 정해져 있지 않은 경우 사용
        
        // 문법 구조
        // while(조건식) {
        //     반복할 문장;
        // }
        
        // 1) 조건식으로 종료
        int num = 1;
        while(num <= 10) {
            System.out.println(num);
            num++;
        }
        
        // 2) 조건식을 true
        // 종료 조건을 따로 준다
        int num2 = 1;
        while(true) {
            System.out.println(num2);
            num2++;
            if(num2 > 10) {
                break;
            }
        }
        
        // 실습) 사용자로부터 숫자를 받는다
        // 사용자가 7을 입력 하면 멈춘다
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 조건이 만족할때 까지 입력 받기
        while (true) { 
            System.out.print("정수 입력 : ");
            int num3 = sc.nextInt();
            // 3) 조건이 만족하면 멈추기
            if(num3 == 7) {
                System.out.println("프로그램 종료");
                break;
            }
        }

        // 4) 다른방법
        int cnt = 0;
        while(cnt != 7) {
            System.out.print("정수 입력 : ");
            cnt = sc.nextInt();
        }
        System.out.println("프로그램 종료");
        
        
        
    }
}
