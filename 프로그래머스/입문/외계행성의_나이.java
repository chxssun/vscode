package 프로그래머스.입문;
public class 외계행성의_나이 {
    public static void main(String[] args) {
        System.out.println(solution_me(23));
        System.out.println(solution(97));
    }
    public static String solution_me(int age) {
        String answer = "";
        // 1. 나이가 1자리일때
        if(age < 10) {
            answer += (char)(age+97);
        // 2. 나이가 2자리일때     
        }else if(age < 100) {
            // 3. 23/10==2+97 == 99 == 'c' 추가
            answer += (char)(age/10+97);
            // 4. 23%10==3+97 == 100 == 'd' 추가
            answer += (char)(age%10+97);
        // 5. 나이가 3자리일때 같은 방식
        }else if(age < 1000) {
            answer += (char)(age/100+97);
            answer += (char)(age%100/10+97);
            answer += (char)(age%10+97);
        // 6. 나이는 1000이하까지 받는다
        // 7. 1000은 'baaa'
        }else if(age == 1000) {
            answer = "baaa";
        }
        return answer;
    }
    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        // 1. 나이가 0이 될때까지 반복 age == 23
        // 4. ager == 2 반복
        while(age > 0) {
            // 2. sb에 추가(0번째에 추가, (형변환)((23%10==3)+ (int형변환)'a'==96)==100) 100형변환 == 'd'
            // 5. (char형변환)(2%10) + 97 == 99  =='c' 0번째에 추가 cd (d는 뒤로 밀림)
            sb.insert(0, (char) ((age % 10) + (int)'a'));
            // 3.23/10 == 2
            // 6. 2/10 == 0 종료
            age /= 10;
        }
        return sb.toString();
    }
}
