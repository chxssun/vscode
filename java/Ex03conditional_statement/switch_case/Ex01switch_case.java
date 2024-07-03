package aischool.java.Ex03conditional_statement.switch_case;

public class Ex01switch_case {
    
    public static void main(String[] args) {
        
        // switch-case statement
        // 문법 구조
        // switch(변수, 값, 식(결과값)) {
        //     case 값1:
        //         실행문1;
        //         break;  // 코드를 빠져나가는 키워드
        //     case 값2:
        //         실행문2;
        //         break;
        //     default:
        //         실행문4;
        //         break;
        // }
        
        // 예제) 홀/짝 구분
        // 1) 변수 선언 및 초기화
        int num = 10;
        // 2) switch-case 구문
        // switch(0값이 나오는 식)
        switch(num % 2) {
            case 0: // 식 값이 0이면 실행
                System.out.println("짝수입니다.");
                break; // 코드 탈출
            case 1: // 식 값이 1이면 실행
                System.out.println("홀수입니다.");
                break; // 탈출
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }

        
    }
}
