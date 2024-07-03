package aischool.java.Ex04loop_construction.while_construction;

import java.util.Scanner;

public class Ex08ex {
    
    public static void main(String[] args) {
        
        // 사용자로 부터 정수 2개를 입력 받고, [1] 더하기 또는 [2]빼기 를 입력 받고 연산을 한후 출력하고 다시 실행할지 물어보고 N을 입력하면 프로그램 종료
        
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 입력받기
        while(true) {
            System.out.print("첫번째 정수 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 정수 : ");
            int num2 = sc.nextInt();
            System.out.print("1.더하기 2.빼기 : ");
            int oper = sc.nextInt();

            if (oper == 1) {
                System.out.println("더하기 연산 결과는" + (num1 + num2) + "입니다");
            }else {
                System.out.println("빼기 연산 결과는" + (num1 - num2) + "입니다");
            }
            System.out.print("다시 실행하시겠습니까? (Y/N) : ");
            String yn = sc.next();
            if(yn.equals("N")) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
