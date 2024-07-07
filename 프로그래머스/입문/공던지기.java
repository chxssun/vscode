package 프로그래머스.입문;

import java.util.ArrayList;
import java.util.Arrays;

public class 공던지기 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 10;
        System.out.println(solution_me(arr, k));
        System.out.println(solution(new int[]{1,2,3}, 6));

    }
    public static int solution_me(int[] arr, int k){
        // 1. 새로운 ArrayList생성
        ArrayList<Integer> list = new ArrayList<>();
        // 2. 리턴할 int 변수 생성
        int answer = 1;
        // 3. k만큼 arr전체를 다시 만듬
        for(int i = 0; i < k; i++) {
            // 4. arr의 처음 값부터 끝까지 list에 추가
            for(int j = 0; j < arr.length; j++) {
                list.add(arr[j]);
            }
        }
        // 5. 완성된 list의 값을 k만큼 반복 순회는 +2씩
        for(int i = 0; i < list.size(); i+=2) {
            // 6. k==0 k만틈 반복 끝
            if(k==0) {
                break;
            }
            answer = list.get(i);
            k--;
        }
        return answer;
    }
    public static int solution(int[] numbers, int k) {
        return (k-1)*2 % numbers.length+1;
    }
}
