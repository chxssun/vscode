package 프로그래머스.입문;

import java.util.Arrays;

public class 분수의_덧셈 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution_me(9,2,1,3)));
        System.out.println(Arrays.toString(solution_me(1,2,3,4)));
       
    }
    public static int[] solution_me(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        // 1. 분모 통분 - 다를때에만
        int denom = denom1 * denom2;
        // 2. 분자 통분
        int numerLeft = numer1 * denom2;
        int numerRight = numer2 * denom1;
        int numer = numerLeft + numerRight;

        // 3. 분수 약분
        for(int i = denom; i >= 1; i--) {
            // 분모--;
            if(denom % i == 0 && numer % i == 0) {
                // 분모%분모 == 0 && 분자 % 분모 == 0
                denom /= i;
                numer /= i;
            }
        }
        answer[0] = numer;
        answer[1] = denom;
        return answer;
    }
}
