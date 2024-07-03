package aischool.java.Ex04loop_construction.while_construction;

import java.util.Random;
import java.util.Scanner;

public class Ex11ex {
    
    public static void main(String[] args) {
        
        // 실습) 업다운 게임
        // 1) 랜덤기능 불러오가
        Random rd = new Random();
        // 2) 입력기능 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 3) 타이틀 출력
        System.out.println("===1부터 100까지 숫자 맞히기 게임===");

        // 4) 랜덤 숫자 생성
        int ranNum = rd.nextInt(100)+1;

        // 5) 입력기능 반복
        while(true) {

            // 6) 입력문 출력 후 입력값 저장
            System.out.print("1과 100사이 숫자를 입력 하세요 >> ");
            int num = sc.nextInt();

            // 7) 숫자 비교
            if(num > ranNum) {
                // 8) 입력이 큰 경우
                System.out.println("다운");
            }else if(num < ranNum) {
                // 9) 입력이 작은 경우
                System.out.println("업");
            }else {
                // 10) 정답일 경우
                System.out.println(num+"정답입니다.");
                break;
            }
        }
    }
}
