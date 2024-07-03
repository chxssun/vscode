package aischool.java.Ex04loop_construction.while_construction;
import java.util.Random;
import java.util.Scanner;

public class Ex10ex {
    
    public static void main(String[] args) {
        
        // 랜덤으로 숫자를 가져오는 기능
        Random rd = new Random();

        int randomNum = rd.nextInt(10)+1;
        // bound : 10 --> 0 ~ 9
        // 0 1 2 3 4 5 6 7 8 9
        // 1 2 3 4 5 6 7 8 9 10
        
        System.out.println(randomNum);

        // 랜덤 숫자 1~10 2개를 가져온다, 그리고 사용자로부터 랜덤 숫자의 더한 값을 입력 받는다, 더한 값이 맞았을 경우 success출력, 틀렸을 경우 fail출력후 계속하시겠습니까? 출력 N을 입력하면 프로그램 종료
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);

        // 2) while사용해서 랜덤값 불러오기
        while(true) {
            int rd1 = rd.nextInt(10)+1;
            int rd2 = rd.nextInt(10)+1;

            System.out.println("=== Plus Game===");
            System.out.print(rd1+ "+" + rd2 + "=");
            int num = sc.nextInt();
            if (num == rd1 + rd2) {
                System.out.println("success");
                break;
            }else {
                System.out.println("Fail");
                System.out.print("계속하시겠습니까? >> ");
                String select = sc.next();

                if (select.equals("N")) {
                    System.out.println("프로그램 종료");
                    break;
                }
            }
        }

    }
}
