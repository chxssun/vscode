package aischool.java.Ex02operator.binary_operator;

import java.util.Scanner;

public class Ex01arithmetic_oper {
    
    public static void main(String[] args) {
        
        // 산술연산자 (aritmetic operator)
        // +, -, *, /, %(나머지)
        int num1 = 10;
        int num2 = 3;
        
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요 : ");
        int num3 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요 : ");
        int num4 = sc.nextInt();

        System.out.println(num3 + num4);
        System.out.println(num3 - num4);
        System.out.println(num3 * num4);
        System.out.println(num3 / num4);
        System.out.println(num3 % num4);
        
        // + : 문자열 연결 연산 가능
        // 문자열 앞/뒤 숫자가 문자열로 변환되어 연산
        System.out.println(7 + 3 + "7"); // 107
        System.out.println(7 + "3" + 7); // 737
        System.out.println("7" + 3 + 7); // 737

        // 실습문제) 사용자로부터 3자리 숫자를 입력 받고 각 자리의 숫자를 출력하세요.
        // 1) 숫자 입력 받기
        System.out.println("3자리 숫자를 입력하세요 : ");
        int num5 = sc.nextInt();
        
        // 2) 각 자리의 숫자 출력
        System.out.println("백의 자리 : " + num5 / 100);
        System.out.println("십의 자리 : " + num5 / 10 % 10);
        System.out.println("일의 자리 : " + num5 % 10);
    }
}
