package aischool.java.Ex05array.one_dimensional_array;

public class Ex02array {

    public static void main(String[] args) {
        
    // 실습) 배열 초기화 3,7,18,71,9,12,24
    // 홀수값이 몇개인지 출력

        int[] arr = {3, 7, 18, 71, 9, 12, 24};

        int cnt = 0;

        System.out.print("array에 들어있는 홀수는 ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
                cnt++;
            }
        }
        System.out.println("이며");
        System.out.print("총 "+cnt+"개 입니다");


    }
    
    


}
