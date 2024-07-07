package 프로그래머스.입문;

public class 합성수_찾기 {
    
    public static void main(String[] args) {
        System.out.println(solution_me(15));
    }
    public static int solution_me(int n) {
        // 1. 리턴할 변수 합성수 개수
        int answer = 0;
        // 2. 1부터 n까지 반복
        for(int i = 1; i <= n; i++) {
            // 3. i의 약수의 개수 담을 변수
            int cnt = 0;
            // 4. i의 약수 구하기
            for(int j = 1; j <= i; j++) {
                // 5. 약수면 cnt추가
                if(i%j==0) {
                    cnt++;
                }
            }
            // 6. i 가 합성수면 answer개수 하나씩 추가
            if(cnt >= 3) {
                answer++;
            }
        }
        return answer;
    }
}
