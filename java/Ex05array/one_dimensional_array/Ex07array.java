package aischool.java.Ex05array.one_dimensional_array;

import java.util.Random;

public class Ex07array {
    
    public static void main(String[] args) {
        
        // 실습) 8칸 배열을 선언하고 랜덤수로 초기화한후 배열을 출력,가장 큰수 가장 작은수도 출력

        // 1) 랜덤 도구 불러오기
        Random rd = new Random();

        // 2) 8칸 배열 생성
        int[] arr = new int[8];

        // 3) 배열에 중복없이 8개 숫자 채우기
        for(int i = 0; i < arr.length; i++) {
            int num = rd.nextInt(100)+1;
            arr[i] = num;
            for(int j = 0; j < i; j++) {
                if(num == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        // 4) max/min 초기화
        int max = arr[0];
        int min = arr[0];

        // 5) 결과 출력
        System.out.print("배열 값 : ");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("최댓값 : "+max);
        System.out.println("최솟값 : "+min);

    }
}
