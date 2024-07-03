package aischool.java.Ex05array.one_dimensional_array;

import java.util.Scanner;

public class Ex05array {
    
    public static void main(String[] args) {
        // 실습 숫자10개를 입력받아 3의 배수인 숫자를 출력
      // 1) 입력 기능 가져오기
      Scanner sc = new Scanner(System.in);
      
      // 2) 배열 선언 및 생성
      int[] arr = new int[10];
      
      // 3) 입력10개 받기, 10개 초기화 하기
      for(int i = 0; i < arr.length; i++) {
         System.out.print(i+1+"번째 정수 입력 >> ");
         arr[i] = sc.nextInt();
      }
      
      // 4) 3의 배수인 것만 출력하기
      System.out.print("3의 배수 : ");
      for(int i = 0; i < arr.length; i++) {
         if(arr[i] % 3 == 0) {
            System.out.print(arr[i]+" ");
         }
      }

    }
}
