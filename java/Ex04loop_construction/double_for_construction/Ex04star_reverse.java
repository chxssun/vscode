package aischool.java.Ex04loop_construction.double_for_construction;

import java.util.Scanner;

public class Ex04star_reverse {
    
    public static void main(String[] args) {
        
        // 실습) 행의 개수를 입력 받아 별찍기
      Scanner sc = new Scanner(System.in);
      
      System.out.print("행의 개수 : ");
      int num = sc.nextInt();
      for(int j = num; j >= 1; j--) {
         for(int i = 1; i <= j; i++) {
            System.out.print("*");
         }
         System.out.println();
      }
      
      for(int i = 1; i <= 5; i++) {
         System.out.print("*");
      }
      System.out.println();
      for(int i = 1; i <= 4; i++) {
         System.out.print("*");
      }
      System.out.println();
      for(int i = 1; i <= 3; i++) {
         System.out.print("*");
      }
      System.out.println();
      for(int i = 1; i <= 2; i++) {
         System.out.print("*");
      }
      System.out.println();
      for(int i = 1; i <= 1; i++) {
         System.out.print("*");
      }
      System.out.println();
    }
}
