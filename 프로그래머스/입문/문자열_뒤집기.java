public class 문자열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution_me("jaron"));
        System.out.println(solution1("noraj"));
        System.out.println(solution2("string"));
    }
    public static String solution_me(String my_string) {
        // 1. 뒤집은 문자열 담을 변수
        String answer = "";
        // 2. 사이를 기준으로 split해서 배열 담기
        String[] arr = my_string.split("");
        // 3. 길이만큼 돌면서 거꾸로 담기
        for(int i = arr.length-1; i >= 0; i--) {
            answer += arr[i];
        }
        return answer;
    }
    public static String solution1(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    }
    public static String solution2(String my_string) {
        String answer = "";
        for(int i=my_string.length()-1; i>=0; i--){
            answer+=my_string.charAt(i);
        }
    return answer;
    }
}
