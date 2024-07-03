package aischool.java.Ex03conditional_statement.simple_if;

import java.util.Scanner;

public class Ex01simple_if {
    
    public static void main(String[] args) {
        
        // 제어문 : 컴파일 방향을 원하는 방향으로 제어하는 문법
        
        // 1) 조건문 : 조건식(예/아니오)에 따라서 참이면 실행 거짓이면 다음코드로 넘어가는 문법
        // 2) 종류 : if, if-else, else if, switch-case
        // 3) 문법 구조 : if(조건식) {조건식이 참일 경우 실행시킬 코드}
        // 4) 조건식 : 결과값으로 boolean자료형을 돌려주는 식

        // 실습) 사용자로부터 나이를 입력 받고 나이가 20이상이면 "성인입니다" 출력
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 입력받기
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();
        // 3) 출력하기
        if(age >= 20) {
            System.out.println("성인입니다.");
        }
    }
}
