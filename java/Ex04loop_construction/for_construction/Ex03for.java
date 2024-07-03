package aischool.java.Ex04loop_construction.for_construction;

import java.util.Scanner;

public class Ex03for {
    
    public static void main(String[] args) {
        
        // 실습) 사용자로부터 숫자1개를 입력받고 그 숫자의 약수를 구하고, 약수들의 총합을 구하는 프로그램

        // 1) 입력 도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 입력받기
        System.out.print("숫자를 입력하세요. >> ");
        int num = sc.nextInt();

        // 3) 약수 구하기
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        // 4) 출력하기
        System.out.println("약수의 총합은 " + (sum+num) + " 입니다.");    
    }
}
