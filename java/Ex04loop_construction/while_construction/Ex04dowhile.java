package aischool.java.Ex04loop_construction.while_construction;

public class Ex04dowhile {
    
    public static void main(String[] args) {
        
        // do-while문
        // : 반복 횟수가 정해져 있지 않은 경우 사용

        // 문법 구조
        // do {
        //     한번은 실행 시킬 코드 이면서 true일 동안 반복할 코드;
        // } while(조건식);

        // do-while문과 while문의 차이점
        int cnt = 6;

        // cnt가 5일 동안 반복 - syso("반복");
        // while(cnt == 5) {
        //     System.out.println("반복");
            
        // }

        do {
            System.out.println("반복");
        }while(cnt == 5);
    }
}
