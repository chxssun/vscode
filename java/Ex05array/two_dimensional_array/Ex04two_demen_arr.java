package aischool.java.Ex05array.two_dimensional_array;

public class Ex04two_demen_arr {
    
    public static void main(String[] args) {
        
        // 실습) 배열 내 수들의 차이가 가장 작게 나는 수들의 인덱스를 출력
        // 배열은 92, 32, 52, 9, 81, 2, 68
        // 9와 2의 차이가 7이므로 출력은
        // 9와 2의 인덱스인 3과 5가 출력되야함

        int[] arr = {92, 32, 52, 9, 81, 2, 68};

        int[] min = new int[2];

        int minNum = arr[0] > arr[1]? arr[0] - arr[1]: arr[1] - arr[0];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] != arr[j]) {
                    int a = arr[i] > arr[j]? arr[i] - arr[j] : arr[j] - arr[i];
                    if(a < minNum) {
                        minNum = a;
                        min[0] = i;
                        min[1] = j;
                    }
                }
            }
        }
        System.out.print("result : [" + min[0] +", "+ min[1]+"]");
    }
}
