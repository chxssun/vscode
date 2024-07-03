
import java.util.Arrays;
public class 중앙값_구하기 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 10, 1, 2, 3, 4};
        System.out.println(solution_me(arr));

    }
    public static int solution_me(int[] arr) {
        int answer = 0;
        // 1. 배열 정렬
        Arrays.sort(arr);
        // 2. 중앙값구하기
        answer = arr[arr.length/2];
        return answer;
    }
}
