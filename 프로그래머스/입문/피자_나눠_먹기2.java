package 프로그래머스.입문;
public class 피자_나눠_먹기2 {
    public static void main(String[] args) {
        System.out.println(solution_me(6));
        System.out.println(solution(7));
    }
     public static int solution_me(int n) {
        int answer = 0;
        // 1. 피자 갯수 변수
        int cnt = 1;
        while(true) {
            // 2. 사람수 * 피자 % 6 == 0 이면 피자는 6조각 
            if((n*cnt)%6 == 0) {
                // 3. 사람 6명 6조각 피자 1판 이면 됨
                answer = n*cnt/6;
                break;
            // 4. 나머지가 0이 아니라는 것은 피자가 남거나 부족하다는 뜻     
            }else {
                // 5. 피자 추가 // 최소 공배수까지
                cnt++;
            }
        }
        return answer;
    }
    public static int solution(int n) {
        int answer = 1;
        while (true) {
            if (6 * answer % n == 0) {
                return answer;
            }
            answer++;
        }
    }
}
