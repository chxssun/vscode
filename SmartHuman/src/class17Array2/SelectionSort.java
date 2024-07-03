package class17Array2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // 선택정렬
        // 1. 배열 생성
        int[] arr = {45,7,12,82,25};
        // 2. 배열중 가장 큰수의 인덱스 값 저장 변수
        int maxindex = 0;
        // 3. 치환 저장 공간
        int temp = 0;

        // 8. 맨뒤는 이미 정해짐, 반복은 하나씩 적게
        for(int j = arr.length-1; j > 0; j--){
            // 4. 배열내 최댓값 찾기
            for(int i = 0; i < j+1; i++) {
                // i = 0 1 2 3 4
                // 5. 최댓값 찾으면
                if(arr[i] > arr[maxindex]) {
                    // 6. 인덱스 추출
                    maxindex = i;
                }
            }
            // 7. 치환
            temp = arr[j];
            arr[j] = arr[maxindex];
            arr[maxindex] = temp;
            System.out.println(Arrays.toString(arr));

        }




    }
}
