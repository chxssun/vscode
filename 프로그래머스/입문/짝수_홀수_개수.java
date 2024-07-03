import java.util.Arrays;

public class 짝수_홀수_개수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution_me(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }
    public static int[] solution_me(int[] num_list) {
        // 1. 결과값은 배열크기 2인 배열선언
        int[] answer = new int[2];
        // 2. arg배열을 순회
        for(int i = 0; i < num_list.length; i++) {
            // 3. 만약 배열이 짝수면 
            if(num_list[i] % 2 == 0) {
                // 4. 리턴할 answer[0]의 요소를 하나씩 증가
                answer[0]++;
            }else {
                // 5. 홀수면 [1]을 하나씩 증가  
                answer[1]++;
            }
        }
        return answer;
    }
    public static int[] solution(int[] num_list) {
        // 1. 리턴할 배열 선언
        int[] answer = new int[2];
        for(int i = 0; i < num_list.length; i++)
            // 2. num_list[i]의 값을 2로 나누면 나머지가 0이나 1이겠지..
            // 3. 그 0이나 1을 인덱스로 사용해버림..
            answer[num_list[i] % 2]++;
        return answer;
    }
}
