package 프로그래머스.입문;

import java.util.HashMap;
import java.util.Map;

public class 가위바위보 {
    public static void main(String[] args) {
        System.out.println(solution_me("205"));
        System.out.println(solution("205002"));
    }
    public static String solution_me(String rsp) {
        // 1. 리턴할 최종 값 변수
        String answer = "";
        // 2. rsp를 하나씩 나눠 배열로 생성
        String[] arr = rsp.split("");
        // 3. 배열의 값을 하나씩 불러와서 각 값으로 추가
        for(int i = 0; i < arr.length; i++) {
            // 4. 만약 2면 0을 추가
            if(arr[i].equals("2")){
                answer+="0";
            // 5. 만약 0이면 5를 추가
            }else if(arr[i].equals("0")) {
                answer += "5";
            // 6. 만약 5면 2를 추가
            }else if(arr[i].equals("5")) {
                answer += "2";
            }else {
                answer += "";
            }
        }
        return answer;
    }
    public static String solution(String rsp) {
        //2 - 가위, 0 - 바위, 5 - 보
        Map<String, String> winNumbers = new HashMap<>();
        winNumbers.put("2", "0");
        winNumbers.put("0", "5");
        winNumbers.put("5", "2");

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            answer.append(winNumbers.get(rsp.substring(i, i+1)));
        }
        return answer.toString();
    }
}
