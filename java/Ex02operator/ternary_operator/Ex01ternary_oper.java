package aischool.java.Ex02operator.ternary_operator;

import java.util.Scanner;

public class Ex01ternary_oper {
    
    public static void main(String[] args) {
        
        // 삼항연산자 (ternary operator)
        // 조건식? 조건식이 참일 때 : 조건식이 false일 때

        // 실습) 입력한 수가 홀수/짝수 구분
        // 1) 입력 도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 숫자 입력받기
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        // 3) 홀수/짝수 구분
        String result = (num % 2 == 0)? "짝수" : "홀수";
        System.out.println("입력한 숫자는 " + result + " 입니다.");
    }
}
