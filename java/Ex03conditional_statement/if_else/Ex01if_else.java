package aischool.java.Ex03conditional_statement.if_else;

import java.util.Scanner;

public class Ex01if_else {

    public static void main(String[] args) {
        
        // if-else문
        // if(조건식) {조건식이 참일 경우 실행 코드}
        // else {조건식이 거짓일 경우 실행 코드}

        // 실습) 사용자로부터 숫자를 입력 받고 짝수/홀수 구분해서 출력하기
        // 1) 입력 도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 입력받기
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        
        // 3) 출력하기
        if(num % 2 == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다.");
        }
    }
    
}
