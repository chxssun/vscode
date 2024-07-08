package 프로그래머스.입문;

public class 팩토리얼 {
    public static void main(String[] args) {
        int num = 7;
        int facnum = 1;
        int cnt = 1;
        while (facnum <= num) { 
            facnum = fac(cnt);
            cnt++;
        }
        System.out.println(cnt-2);
        
        
    }
    public static int fac(int num) {
        int answer = 1;
        for(int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }
}
