package aischool.java.Ex04loop_construction.while_construction;

import java.util.Scanner;

public class Ex05ex {
    
    public static void main(String[] args) {
        
        // 숫자를 입력 받아 홀수와 짝수가 각각 몇개 입력 되었는지 출력
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        // 2) 홀수/짝수 초기화
        int add = 0;
        int even = 0;

        while(true) {
            // 3) 숫자입력받기
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            // 4) 숫자 판별
            if(num % 2 == 0) {
                even++;
            }else {
                add++;
            }
            // 5) 종료조건
            if(num == -1) {
                System.out.println("종료");
                break;
            }
            // 6) 출력
            System.out.println("홀수 : " + add);
            System.out.println("짝수 : " + even);
        }
    }
}
