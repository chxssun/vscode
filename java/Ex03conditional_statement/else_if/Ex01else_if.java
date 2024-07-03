package aischool.java.Ex03conditional_statement.else_if;

import java.util.Scanner;

public class Ex01else_if {
    
    public static void main(String[] args) {
        
        // if - else if - else : 두 개 이상의 조건식을 판별

        // 실습) 사용자로부터 숫자를 입력받고 그 숫자가 홀수인지, 짝수인지, 0인지 구별해서 출력
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 입력받기
        System.out.print("숫자를 입력하세요.");
        int num = sc.nextInt();
        // 3) 판별
        if (num == 0) {
            System.out.println("입력한 숫자는 0입니다.");
        } else if (num % 2 == 1) {
            System.out.println("입력한 숫자는 홀수입니다.");
        } else {
            System.out.println("입력한 숫자는 짝수입니다.");
        }
    }
}
