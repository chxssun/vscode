package aischool.java.Ex04loop_construction.while_construction;

import java.util.Scanner;

public class Ex03while {
    
    public static void main(String[] args) {
        
        // 실습) 사용자로부터 숫자를 입력 받는다
        // 입력받은 숫자의 합을 출력한다
        // 사용자가 -1을 입력하면 멈춘다

        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 숫자 입력받기
        int sum = 0;
        while (true) {
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();
            if (num == -1) {
                // 3) 사용자가 -1을 입력하면 멈춘다
                break;
            }else {
                // 4) 입력받은 수의 합을 출력
                sum += num;
                System.out.print("합계 : " + sum);
                System.out.println();
            }
        } 
        // 5) 프로그램 종료
        System.out.println("프로그램 종료");
    }
}
