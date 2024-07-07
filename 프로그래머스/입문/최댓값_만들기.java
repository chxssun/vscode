package 프로그래머스.입문;

public class 최댓값_만들기 {
    public static void main(String[] args) {
        System.out.println(solution_me(new int[]{12,2,1}));
    }
    public static int solution_me(int[] numbers){
        // 1. 최댓값 변수
        int max = 0;
        // 2. 최댓값 아래 변수
        int max2 = 0;
        // 3. 최댓값 먼저 구하기
        // 4. 값은 값이 있는지 판단할 변수
        boolean isNum = false;
        // 5. 최댓값의 인덱스 변수
        int index = 0;
        for(int i = 1; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        // 6. 최댓값이 2개인지 확인
        for(int i = 0; i < numbers.length; i++) {
            if(i != index) {
                if(max == numbers[i]) {
                    isNum = true;
                    break;
                }
            }
        }
        if(isNum) {
            return max*max;
        }
        // 4. 2번째로 큰 값 구하기
        for(int i = 0; i < numbers.length; i++) {
            if(max2 < numbers[i] && max > numbers[i]) {
                max2 = numbers[i];
            }
        }
        return max*max2;
    }
}
