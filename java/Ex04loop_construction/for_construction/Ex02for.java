package aischool.java.Ex04loop_construction.for_construction;

import java.util.Scanner;

public class Ex02for {
    
    public static void main(String[] args) {
        
        // 실습1) 1에서 100까지 3의 배수만 출력
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
        // 실습2) 1에서 100까지 3의 배수 이면서 5의 배수 출력
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
        // 실습3) 사용자로부터 숫자1개를 입력 받아 그 수의 배수를 10개만 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. >> ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
        System.out.println();
        
    }
}
