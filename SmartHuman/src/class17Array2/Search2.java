package class17Array2;

import java.util.Arrays;

public class Search2 {
    public static void main(String[] args) {
        // Binary search
        // 1. 배열생성
        int[] arr = {7,16,30,25,1,41,78,90,66,33};
        System.out.println(Arrays.toString(arr));

        // 2. 버블 솔트
        int temp = 0;
        for(int j = arr.length-1; j > 0; j--) {
            for(int i = 0; i < j; i++) {
                if(arr[i] >  arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // 3. 이진 탐색
        int lowIndex = 0;
        int highIndex = 0;
        int midindex = 0;
        
        int searchValue = 78;

        lowIndex = 0;
        highIndex = arr.length - 1;
        midindex = (lowIndex + highIndex) / 2;

        // 업다운 게임처럼 찾는다
        while(lowIndex <= highIndex) {
            if(searchValue == arr[midindex]) {
                System.out.println(searchValue +"는" +midindex+"에 있습니다");
                break;
            }else if(searchValue > arr[midindex]) {
                lowIndex = midindex + 1;
                midindex = (lowIndex + highIndex) / 2;
            }else {
                highIndex = midindex - 1;
                midindex = (lowIndex + highIndex) / 2;
            }
        }

    }
}
