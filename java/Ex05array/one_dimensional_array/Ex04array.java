package aischool.java.Ex05array.one_dimensional_array;

import java.util.Scanner;

public class Ex04array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // 실습) 사용자로부터 숫자를 5개 입력받는다
      // 입력된 점수를 출력하고, 최고점수, 최저점수 출력
      // 점수의 총합과 평균 출력
      
      // 1) 점수가 저장될수 있는 배열
      int[] score = new int[5];
      
      for(int i = 0; i < score.length; i++) {
         System.out.print(i+1+"번째 입력 >> ");
         score[i] = sc.nextInt();
      }
         
      int max = score[0];
      int min = score[0];
      int sum = 0;
      
      System.out.print("입력된 점수 : ");
      for(int i = 0; i < score.length; i++) {
         System.out.print(score[i] +" ");
         sum += score[i];
         if(score[i] > max) {
            max = score[i];
         }
         if(score[i] < min) {
            min = score[i];
         }
      }
      System.out.println();
      System.out.println("최고 점수 : " + max);
      System.out.println("최저 점수 : " + min);
      System.out.println("총합 : "+sum);
      System.out.println("평균 : "+(double)(sum/score.length));

    }
}
