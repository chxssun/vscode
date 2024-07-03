package aischool.java.보충수업;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04값바꾸기 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 50, 3, 60, -3};

        System.out.print("바꿀 배열의 인덱스 번호 입력 >> ");
        int index = sc.nextInt();
        System.out.print("바꿀 숫자 입력 >> ");
        arr[index] = sc.nextInt();

        System.out.println(Arrays.toString(arr));


    }
}
