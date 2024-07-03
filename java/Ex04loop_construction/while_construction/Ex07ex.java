package aischool.java.Ex04loop_construction.while_construction;

import java.util.Scanner;

public class Ex07ex {
    
    public static void main(String[] args) {
        
        // 숫자, 문자한개(char)의 같다를 비교할 때 : == 기호사용
        // 문자열이 같은지 비교할 때 : 변수.equals("데이터")

        String name = "김창선";

        if(name.equals("김창선")) {
            System.out.println("로그인 성공");
        }
        
        // 입력하는 기능에서 문자열 입력 : sc.next();

        //1) 입력하는 도구 불러오기
        Scanner sc = new Scanner(System.in);

        // 로그인 실패 카운트 변수
        int cnt = 0;

        while (true) { 
            // 2) 아이디랑 비번 입력
        System.out.print("아이디 입력 : ");
        String id = sc.next();
        System.out.print("비번 입력 : ");
        int pw = sc.nextInt();

        // 3) 로그인 성공 여부 확인
        if(id.equals("Hello") && pw == 1234) {
            System.out.println("로그인 성공");
            break;
        }else {
            // 4) 로그인 실패시 카운트 +1
            cnt++;

            // 5) 로그인 실패 3회시 본인인증 출력
            if(cnt < 3) {
                // 로그인 실패
                System.out.println("아이디 비번 3회 틀림 인증하세요");
                // 시도할수 있는 기회 남은 상태
                System.out.print("계속? (Y/N) >>");
                String yn = sc.next();
                if(yn.equals("N")) {
                    System.out.println("프로그램 종료");
                    break;
                }
            }else {
                // 로그인 실패 3회시 본인 인증 출력
                System.out.println("아이디 비번 3회 틀림 인증하세요");
                System.out.println("본인인증을 받으세요");
                break;
            }
        }
            
        }
        
    }
}
