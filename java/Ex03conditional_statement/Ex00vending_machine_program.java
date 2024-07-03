package aischool.java.Ex03conditional_statement;

import java.util.Scanner;

public class Ex00vending_machine_program {
    
    public static void main(String[] args) {
        
        // 실습) 자판기 프로그램
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);

        // 2) 보유 금액 입력 받기
        System.out.println("보유 금액을 입력하세요.");
        int money = sc.nextInt();

        // 3) 메뉴 선택 받기
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1. 아우터(700원), 2. 이구동성(1000원), 3. 에그몽(500원) >> ");
        int menu = sc.nextInt();

        // 4) 메뉴 선택에 따른 금액 초기화
         switch (menu) {
            case 1: 
            menu = 700;
            break;
            case 2:
            menu = 1000;
            break;
            case 3:
            menu = 500;
            break;
            default:
            System.out.println("메뉴를 잘못 선택하셨습니다.");
            break;
         }

         // 5) 보유 금액에서 메뉴 금액 차감한 금액 변수 선언
         int change = money - menu;

         // 6) 메뉴 금액이 보유 금액보다 클 경우
         if (change < 0) {
            System.out.println("돈이 부족해요 ㅠㅠ");
            // 다시 보유 금액으로 초기화
            change = money;
         } 
         System.out.println("잔돈 : "+change+"원");

         // 7) 잔돈의 천원짜리 걔수, 5백원 짜리 개수, 100원 짜리 개수 구하기
         int change_1000 = change / 1000;
         int change_500 = change % 1000 / 500;
         int change_100 = change % 1000 % 500 / 100;
         System.out.println("천원 : "+change_1000+"개, 오백원 : "+change_500+"개, 백원 : "+change_100+"개");
    }
}
