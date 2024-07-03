import java.util.Arrays;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution_me(10)));
        System.out.println(Arrays.toString(solution_me(15)));
    }
    public static int[] solution_me(int n) {
        // 1. n이 짝수일때는 리턴 배열 크기가 절반
        int num = 0;
        if(n % 2 == 0) {
            num = n / 2;
        }else {
            num = (n+1) / 2;
        }
        // 2. num크기 만큼 배열 생성
        int[] answer = new int[num];
        // 3. n이하의 홀수만 answer배열에 추가하기
        // 3-1. answer인덱스를 할 변수 생성
        int index = 0;
        // 4. n이하의 수를 1부터 n까지 반복
        for(int i = 1; i <= n; i++) {
            // 5. 홀수를 만나면 answer[index]추가 후 ++;
            if(i % 2 == 1) {
                answer[index] = i;
                index++;
            }
        }
        // 6. answer 배열 리턴
        return answer;
    }
}
