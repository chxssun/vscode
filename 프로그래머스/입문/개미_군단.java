package 프로그래머스.입문;
public class 개미_군단 {
    public static void main(String[] args) {
        System.out.println(solution_me(23));
        System.out.println(solution(24));
    }
    public static int solution_me(int hp) {
        int answer = 0;
        // 1. hp가 0이될때 까지 빼기
        while(hp > 0) {
            // 2. 23일때 5보다 큼 
            if(hp >= 5) {
                // 3. 23-5 후
                hp -= 5;
                // 4. 개미한마리 추가
                answer++;
            // 5. 1,2,3 방식 반복
            }else if (hp >= 3) {
                hp -= 3;
                answer++;
            }else {
                hp -= 1;
                answer++;
            }
        }
        return answer;
    }
    public static int solution(int hp) {
        // 24/5 == 4+  24%5==4/3 == 1+   24%5==4%3==1+ 4+1+1 == 6
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}
