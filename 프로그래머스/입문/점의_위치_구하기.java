package 프로그래머스.입문;

public class 점의_위치_구하기 {
    public static void main(String[] args) {
        System.out.println(solution_me(new int[]{2,4}));
        System.out.println(solution(new int[]{-7,9}));
    }
    public static int solution_me(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        }else if(dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        }else if(dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        }else if(dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }
    public static int solution(int[] dot) {
        int xParam = dot[0] < 0 ? 1 : 0;
        int yParam = dot[1] < 0 ? 2 : 0;

        return 1 + ((xParam | yParam) ^ (yParam >> 1));
    }
}
