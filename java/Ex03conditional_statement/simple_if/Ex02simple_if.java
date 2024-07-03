package aischool.java.Ex03conditional_statement.simple_if;

import java.util.Scanner;

public class Ex02simple_if {
    
    public static void main(String[] args) {
        
        // 실습) 사용자가 입력한 수가 3의 배수 이면서 5의 배수면 "3과 5의 배수 입니다" 출력
        // 1) 입력 도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 입력 받기
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        // 3) 3과 5의 배수인지 확인 후 출력
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("3과 5의 배수 입니다.");
        }
    }
}
