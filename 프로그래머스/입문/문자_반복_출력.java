public class 문자_반복_출력 {
    public static void main(String[] args) {
        System.out.println(solution_me("hello", 3));
    }
    public static String solution_me(String my_string, int n) {
        // 1. 문자열을 잘라서 배열로 생성
        String[] arr = my_string.split("");
        // 2. 리턴할 문자열을 담을 변수 생성
        String answer = "";
        // 3. 배열의 값 하나 가져와서 길이만큼 반복
        for(int i = 0; i < arr.length; i++) {
            // 4. 하나를 가져오면 n만큼 추가
            for(int j = 0; j < n; j++) {
                answer += arr[i];
            }
        }
        return answer;
    }
    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
