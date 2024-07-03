package aischool.java.Ex04loop_construction.while_construction;

import java.util.Scanner;

public class Ex02while {
    
    public static void main(String[] args) {
        
        // 실습) 사용자로부터 숫자를 입력받는다
        // 입력받은 숫자가 10보다 작을때만 입력 받는다

        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 입력받기
        while (true) {
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();
            if (num < 10) {
                break; 
            } 
        }
        System.out.println("프로그램 종료");
       
    }
}
