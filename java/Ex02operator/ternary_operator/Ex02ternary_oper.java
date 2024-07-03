package aischool.java.Ex02operator.ternary_operator;

import java.util.Scanner;

public class Ex02ternary_oper {
    
    public static void main(String[] args) {

        // 실습) 입력한 두 수 중 큰 수에서 작은 수를 뺀 값을 구하기
        // 1) 입력 도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 입력받기
        System.out.println("첫 번째 수를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("두 번째 수를 입력하세요.");
        int num2 = sc.nextInt();
        // 3) 출력하기
        System.out.println("큰 수에서 작은 수를 뺀 값은 " + (num1 > num2? num1 - num2 : num2 - num1) + " 입니다.");
    }
}
