package aischool.java.Ex05array.one_dimensional_array;

import java.util.Scanner;

public class Ex08array {
    
    public static void main(String[] args) {
        
        // 실습) 사용자에게 숫자를 입력 받아 배열의 인덱스 수 만큼 별을 출략

        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);
        
        // 2) 배열 선언
        int[] arr = new int[5];

        // 3) 반복 숫자 입력 받기 그 숫자로 초기화하기
        for(int i = 0; i < arr.length; i++) {
            System.out.print(i+"번째 별의 수 : ");
            arr[i] = sc.nextInt();
        }

        // 4) 별 출력하기
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+":");
            for(int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
