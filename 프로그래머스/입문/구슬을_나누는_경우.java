package 프로그래머스.입문;

public class 구슬을_나누는_경우 {
    public static void main(String[] args) {
        System.out.println(solution_me(5, 3));
        System.out.println(solution_me(30, 18));
        System.out.println(solution(30, 18));
        System.out.println(top(30,18));
        System.out.println(fac(12));
    }
    public static long fac(int num) {
        int result = 1;
        for(int i = num; i >= 1; i--) {
            result*=i;
        }
        return result;
    }
    public static long top(int num1, int num2) {
        int result = 1;
        for(int i = num1; i > num2; i--) {
            result*=i;
        }
        return result;
    }
    // 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
    // 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 * 10 9 8 7 6 5 4 3 2 1
    public static long solution_me(int c, int n) {
        if(c == n) {
            return 1;
        }
        int arg = 1;
        long bottom = 1;
        if(c - n > n) {
            bottom = fac(n);
            arg = c - n;
        }else {
            bottom = fac(c - n);
            arg = n;
        }
        long top = top(c, arg);
        return top / bottom;

        
    }

    public static long solution(int c, int n) {
        if (c == n || n == 0)
            return 1;
        // 1. 리턴할 변수
        long answer = 1;
        // 2. 20 < 10  a== 10  : 큰수는 약분되어 1이 되니 작은수만큼 하면됨
        int a = (c - n < n) ? c - n : n;
        // 3. a의 길이만큼 반복
        for (int i = 0; i < a; i++) {
            // 4. 1*(30-0)  6. 30*29    8. 435*28   10. 4060*27     12. 27450*26
            answer *= (c - i);
            // 5. 30/1      7. 870/2    9. 12180/3  11. 109620/4    13. 712530/5
            answer /= (i + 1);
        }

        return answer;
    }

}
