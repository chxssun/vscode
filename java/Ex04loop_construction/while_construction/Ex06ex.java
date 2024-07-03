package aischool.java.Ex04loop_construction.while_construction;

import java.util.Scanner;

public class Ex06ex {
    
    public static void main(String[] args) {
        
        // 현재 몸무게랑 목표 몸무게를 입력 받고 주차별 감량 몸무게를 입력받는다
        // 목표몸무게를 달성하면 축하한다는 문구 출력
        
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);

        // 2) 현재몸무게/ 목표 몸무게 입력 받기
        System.out.print("현재 몸무게를 입력하세요 : ");
        int current = sc.nextInt();
        System.out.print("목표 몸무게를 입력하세요 : ");
        int goal = sc.nextInt();
        int week = 0;

        while(true) {
            week++;
            System.out.print(week+"주차 감량 몸무게 : ");
            int minus = sc.nextInt();
            current -= minus;
            if(current <= goal) {
                System.out.println(current+"kg 달성!! 축하합니다.");
                break;
            }
        }
    }
}
