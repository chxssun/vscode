package 프로그래머스.입문;
public class 최빈값_구하기 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4};
        System.out.println(solution_me(arr));
        int[] arr1 = {1,1,2,2};
        System.out.println(solution_me(arr1));
        int[] arr2 = {1};
        System.out.println(solution_me(arr2));

        
    }
    public static int solution_me(int[] array) {
        // 1. 최빈값 변수
        int answer = 0;
        // 2. 최고 빈도수 변수
        int maxCnt = 0;
        // 3. 원소 하나씩 차례대로 비교
        for(int i = 0; i < array.length; i++) {
            // 4. cnt변수 생성
            int cnt = 0;
            // 5. arr[i]랑 나머지 원소 비교
            for(int j = 0; j < array.length; j++) {
                // 6. 같으면
                if(array[i] == array[j]) {
                    // 7. 개수 추가
                    cnt++;
                }
                // 8. maxCnt보다 cnt가 크면
                if(cnt > maxCnt) {
                    // 9. 최빈값으로 재할당
                    maxCnt = cnt;
                    // 10. 최빈값인 숫자를 재할당
                    answer = array[i];
                    // 11. 최빈값과 새로운 array[i]가 다르고 maxCnt와 cnt가 같으면
                }else if(answer != array[i] && maxCnt == cnt) {
                    // 12. 최빈값이 여러개이므로 -1반환
                    answer = -1;
                }
                
            }
        }
        return answer;
    }
}
