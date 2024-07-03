package class17Array2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // 1. 배열 생성
        int[] arr = {45,7,12,82,25};
        System.out.println(Arrays.toString(arr));

        // 2. 비교 Bubble Sort
        // 임시저장공간
        int temp = 0;
        // 4. 그 로직을 배열 수 만큼 반복
        for(int j = arr.length-1; j > 0; j--) {
            // 3. 배열 값중 가장 큰 값을 맨뒤로 보냄
            for(int i = 0; i < j; i++) {
                if(arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
