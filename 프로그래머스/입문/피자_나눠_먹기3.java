package 프로그래머스.입문;
public class 피자_나눠_먹기3 {
    public static void main(String[] args) {
        System.out.println(solution_me(4, 12));
        System.out.println(solution(4, 12));
    }
    public static int solution_me(int slice, int n) {
        // 1. 피자 개수 변수
        int answer = 1;
        // 2. 만약 조각이 사람보다 적으면 피자를 더 시켜야함
        if(slice < n) {
            while(true){
                // 3. 만약 조각과 피자를 곱해서 사람수보다 많으면 멈춤
                if(slice*answer >= n) {
                    break;
                }else {
                    // 4. 사람수보다 부족하면 피자 추가
                    answer++;
                }
            }
        }
        // 5. 피자개수 리턴
        return answer;
    }
    public static int solution(int slice, int n) {
        // n%slice > 0 나머지가 있으면..몫에서 1판만 추가하면 나머지도 다 먹지
        // n%slice == 0 몫만큼 하나씩 먹겟지 
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
