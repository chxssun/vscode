package 프로그래머스.입문;
public class 피자_나눠_먹기1 {
    public static void main(String[] args) {
        System.out.println(solution_me(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }
    public static int solution_me(int n) {
        int answer = 0;
        // 1. 사람n이 7명 미만일때
        if(n < 7) {
            // 2. 피자는 1판이 필요
            answer = 1;
        // 3. 사람이 7로 나누고 나머지가 있을때
        }else if (n % 7  != 0) {
            // 4. n/7몫에 1판 추가 해야함
            answer = n /7+1;
        // 5. 사람이 7의 배수면 
        }else {
            // 6. 몫만큼 필요
            answer = n/7;
        }
        return answer;
    }
    public static int solution(int n) {
        return (n + 6) / 7;
    }
}
