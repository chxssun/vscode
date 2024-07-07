package 프로그래머스.입문;

public class 주사위의_개수 {
    
    public static void main(String[] args) {
        System.out.println(solution_me(new int[]{10,8,6}, 3));

    }
    public static int solution_me(int[] box, int n){
        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;
        return a * b * c;
    }
}
