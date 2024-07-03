package 프로그래머스.입문;

public class 두_수의_나눗셈 {
    
    public static void main(String[] args) {
        System.out.println(solution_me(3, 2));
        System.out.println(solution(1, 2));
    }
    public static int solution_me(int num1, int num2) {
        int answer = 0;
        // 1. num1 / num2 가 소수로 나와야한다 형변환
        double result = (double)num1/(double)num2;
        // 2. result에 1000을 곱한 정수만 출력
        answer = (int)(result*1000);
        return answer;
    }
    
    public static int solution(int num1, int num2) {
        int answer = 0;
        return num1 * 1000 / num2;
    }
}
