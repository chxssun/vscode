package aischool.java.Ex04loop_construction.double_for_construction;

import java.util.Scanner;

public class Ex03starprint {
    
    public static void main(String[] args) {
        
        System.out.print("*");
        System.out.println();
        
        System.out.print("*");
        System.out.print("*");
        System.out.println();
        
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();
        
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();
        
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();
        
        for(int i = 1; i <= 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= 4; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        
        // 실습) 별찍기
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
        
        // 실습) 단수 입력 받고 어느수까지 곱셈할껀지 출력
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 단수 입력 받기
        System.out.print("단수입력 : ");
        int num1 = sc.nextInt();
        
        // 3) 어느 수까지 할지 입력 받기
        System.out.print("어느 수까지 출력 : ");
        int num2 = sc.nextInt();
        
        // 4) 단수 출력
        System.out.println(num1+"단");
        
        // 5) 곱셈 출력
        for(int i = 1; i <= num2; i++) {
            System.out.println(num1+"*"+i+"="+num1*i);
        }
    }
}
