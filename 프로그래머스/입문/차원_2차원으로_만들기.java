package 프로그래머스.입문;

import java.util.Arrays;

public class 차원_2차원으로_만들기 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        System.out.println(Arrays.deepToString(solution_me(num_list, n)));
        System.out.println(Arrays.deepToString(solution(num_list, n)));
        System.out.println(0%2);
    }
    public static int[][] solution_me(int[] num_list, int n) {
        // 1. 리턴할 2차원 배열 변수 선언 - 길이는 행은 [묶음 개수] 열은 [묶을 개수] 
        int[][] answer = new int[num_list.length / n][n];
        // 2. num_list의 인덱스를 할 변수
        int cnt=0;
        // 3. 행 개수 만큼 반복
        for(int i = 0; i < answer.length; i++) {
            // 4. 열 개수 만큼 반복
            for(int j = 0; j < n; j++) {
                // 5. answer[행][열] 에 num_list[0]값 넣기
                answer[i][j] = num_list[cnt];
                // 6. 인덱스 하나씩 추가
                cnt++;
            }
        }
        return answer;
    }
     public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            // [0/2==0][0%2==0] / [1/2==0][1%2==1] / [2/2==1][2%2==0]
            answer[i/n][i%n]=num_list[i];
        }

        return answer;
    }
}
