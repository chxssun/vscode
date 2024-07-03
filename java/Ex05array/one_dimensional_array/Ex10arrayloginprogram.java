package aischool.java.Ex05array.one_dimensional_array;

import java.util.Scanner;

public class Ex10arrayloginprogram {
    
    public static void main(String[] args) {
        
        // 실습) 로그인 프로그램 만들기
        // 1) 입력도구 불러오기
        Scanner sc = new Scanner(System.in);

        // 6) 입력 받은 값을 담아주기 위해 선언하기
        String[] id_arr = new String[3];
        int[] pw_arr = new int[3];

        // 8) 가입 횟수 초과 유무를 확인하기위해 선언
        int index = 0;
		
        // 2) 사용자한테 메뉴 선택 받기 출력
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
            // 3) 메뉴확인과 종료조건을 확인하기위한 변수
			int select = sc.nextInt();

            // 4) 메뉴에 맞게 실행하기
			if(select == 1) {

                // 10) 9번 8번을 이용해서 실행유무 확인
                if(index == 3) {
                    System.out.println("가입불가");
                    continue;
                }
                // 5) 사용자한테 입력 받기
				System.out.println("==회원가입==");
                System.out.print("아이디 입력 : ");
                String id = sc.next();
                System.out.print("비밀번호 입력 : ");
                int pw = sc.nextInt();
                System.out.println("가입성공");

                // 7) 입력받은 값을 배열에 넣기
                id_arr[index] = id;
                pw_arr[index] = pw;

                // 9) 가입횟수 확인을 위해 작성
                index++;

            // 11) 2번 입력시 실행할 코드
			}else if(select == 2) {
                // 14) 13여부확인을 위한 변수 선언
                boolean suc = false;
                
                // 12) 사용자한테 입력 받기
				System.out.println("==로그인==");
                System.out.print("아이디 입력 : ");
                String id = sc.next();
                System.out.print("비밀번호 입력 : ");
                int pw = sc.nextInt();

                // 13) 12입력 받은 값이 배열에 있는지 여부 확인
                for(int i = 0; i < id_arr.length; i++) {
                    if(id_arr[i].equals(id) && pw_arr[i] == pw) {
                        // 15) 있는지 없는지 확인하고 변수를 바꿔주기
                        suc = true;
                    }
                }

                // 16) 바꿔진 14 변수를 이용해서 성공/실패 여부를 출력
                if(suc == true) {
                    System.out.println("로그인 성공");
                }else {
                    System.out.println("로그인 실패");
                }
            
            // 17) 3번 입력시 종료하기
			}else if(select ==3) {
				System.out.println("==종료==");
				break;
			}
			
		}
    }
}
