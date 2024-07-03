package aischool.java.Ex03conditional_statement.if_else;

import java.util.Scanner;

public class Ex02if_else {
    
    public static void main(String[] args) {
        
        // 실습) 1만원짜리 선물 구매시 지불해야하는 금액 계산, 사용자로 부터 구매 개수 입력받기, 단 11개 이상 구매시 10%할인
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 상품 개수 입력 받기
        System.out.print("구매 개수를 입력하세요.");
        int count = sc.nextInt();
        // 3) 상품 개수에 따른 금액 계산
        int price = 10000;
        if (count >= 11) {
            // 개수가 11이상 이면 10%할인
            price = (int)(price * count * 0.9);
        }else {
            // 개수가 11미만 이면 원가
            price = price * count;
        }
        // 4) 출력
        System.out.println("가격은 "+price + "원 입니다.");
    }
}
