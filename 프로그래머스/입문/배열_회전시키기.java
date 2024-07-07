package 프로그래머스.입문;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열_회전시키기 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution_me(new int[]{1,2,3}, "right")));
        System.out.println(Arrays.toString(solution_me(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }
    public static int[] solution_me(int[] numbers, String direction) {
        // 1. 리턴할 배열 크기는 동일하게 생성
        int[] answer = new int[numbers.length];
        // 2. direction 이 roght면
        if(direction.equals("right")){
            // 3. answer첫번째에 numbers 마지막 인덱스의 값을 넣고 나머지는 반복문
            answer[0] = numbers[numbers.length-1];
            // 4. 1번 인덱스 부터 마지막 인덱스까지 반복
            for(int i = 1; i < numbers.length; i++) {
                // 5. 1번 인덱스에 0번 넣고 2번인덱스에 1번 넣고
                answer[i] = numbers[i-1]; 
            }
        }
        // 6. direction 이 left면
        if(direction.equals("left")){
            // 7. 먼저 for문으로 넣고
            for(int i = 0; i < numbers.length-1; i++){
                answer[i] = numbers[i+1];
            }
            // 8. 마지막 인덱스만 넣기
            answer[numbers.length-1] = numbers[0];
        }
        return answer;
    }
}
