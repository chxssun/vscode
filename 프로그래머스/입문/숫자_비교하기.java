package 프로그래머스.입문;

public class 숫자_비교하기 {
    
    public static void main(String[] args) {
        System.out.println(solution_me(4, 3));
        System.out.println(solution_me2(4, 4));
    }
    public static int solution_me(int num1, int num2) {
        int answer = 0;
        // 1. 두수를 비교
        if(num1 == num2) {
            // 2. 두수가 같으면 1을 리턴
            answer = 1;
        }else {
            // 3. 다르면 -1을 리턴
            answer = -1;
        }
        return answer;
    }
    public static int solution_me2(int num1, int num2) {
        int answer = 0;
        // 1. 두수를 비교후 같으면 1 : 다르면 -1
        answer = num1 == num2 ? 1 : -1;
        return answer;
    }
}
