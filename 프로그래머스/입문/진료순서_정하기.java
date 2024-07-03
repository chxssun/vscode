import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 진료순서_정하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution_me(new int[] {3,76,24})));
        System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5,6,7})));
    }
    public static int[] solution_me(int[] emergency) {
        // 1. emergency크기 만큼 배열을 생성
        int[] answer = new int[emergency.length];
        // 2. 배열 크기만큼 반복
        for(int i = 0; i < answer.length; i++) {
            // 3. 반복할때마다 각 원소를 1로 초기화
            answer[i] = 1;
            // 4. 크기만큼 순회하면서 비교 i가0일때 j는012 i가1일때 j는012 i가2일때 j는012
            for(int j = 0; j < emergency.length; j++) {
                // 5. 1)3<3 통과 2)3<76 ++해서 2위 3)3<24 ++해서 3위
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
    public static int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
        Arrays.sort(emergencySort);
        int size = emergency.length;
        for(int i = 0; i<emergencySort.length; i++){
            int e = emergencySort[i];
            map.put(e, size-i);
        }
        for(int i = 0; i<emergency.length; i++){
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }
}
