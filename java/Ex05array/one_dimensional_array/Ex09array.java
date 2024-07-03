package aischool.java.Ex05array.one_dimensional_array;

import java.util.Scanner;

public class Ex09array {
    
    public static void main(String[] args) {
        // 실습) 정답은 1 4 3 2 1
		// 사용자로부터 답을 입력 받아 결과 X, O 로 출력
        // 하나당 점수 20으로 총점을 더해서 출력
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 배열 선언
        int[] answer = {1, 4, 3, 2, 1};

        System.out.println("===채점하기===");
        System.out.println("답을 입력하세요");

        // 3) 답 입력받기
        int[] userAnswer = new int[5];
        for(int i = 0; i < userAnswer.length; i++) {
            System.out.print(i+1+"번답 >> ");
            userAnswer[i] = sc.nextInt();
        }
        
        // 4) 결과 출력하기
        System.out.println("정답확인");
        int score = 0;
        for(int i = 0; i < userAnswer.length; i++) {
            if(userAnswer[i] == answer[i]) {
                System.out.print("O ");
                score += 20;
            } else {
                System.out.print("X ");
            }
        }
        System.out.println("총점 : " + score);


        
           
    }
}
