package aischool.java.Ex04loop_construction.while_construction;
import java.util.Scanner;

public class Ex09ex {
    
    public static void main(String[] args) {
        
        // 숫자로 알파벳 출력하기
        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i+" ");
        }
        // 개행
        System.out.println();

        // 사용자로부터 숫자를 입력받고 입력받은 숫자*1 부터 숫자는 1로 작아지고, 1은 입력 수만큼 커지는 값을 모두 더한 값을 출력
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);

        // 2) 입력받기
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        // 3) 모두 더한 변수 초기화
        int sum = 0;

        // 4) 반복
        for (int i = num, j = 1; i >= 1; i--, j++) {
            sum += i * j;
        }
        
        // 5) 출력하기
        System.out.println("합계 : " + sum);
    }
}
