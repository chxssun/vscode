package aischool.java.Ex05array.one_dimensional_array;

public class Ex03array {
    
    public static void main(String[] args) {
        // 실습) 23, 45, 95, 17, 6, 89, 47, 56, 68, 71  의 최댓값, 최솟값
      int[] arr = {23, 45, 95, 17, 6, 89, 47, 56, 68, 71};
      
      int max = arr[0];
      int min = arr[0];
      
      for(int i = 0; i < arr.length; i++) {
         if(arr[i] > max) {
            max = arr[i];
         }
         if(arr[i] < min) {
            min = arr[i];
         }
      }
      
      // - {} scope(영역) 
      // - 지역변수 : 특정 구역에서만 사용할 수 있도록 선언 및 초기화
      // - 전역변수
      
      System.out.println("최댓값 : "+max);
      System.out.println("최솟값 : "+min);

    }
}
