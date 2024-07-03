package aischool.java.Ex05array.one_dimensional_array;

import java.util.Scanner;

public class Ex10buildup {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int select = 0;

        // while (true) { 
        //     System.out.print("[1]가입 [2]로그인 [3]종료");
        //     select = sc.nextInt();
        //     if(select == 1) {
        //         System.out.println("==가입==");
        //     }else if(select == 2) {
        //         System.out.println("==로그인==");
        //     }else if(select == 3) {
        //         System.out.println("종료");
        //         break;
        //     }else {
        //         System.out.println("잘못 입력하셨습니다.");
        //     }
        // }

        int select = 0;
        
        String[] id_arr = new String[3];
        int[] pw_arr = new int[3];
        int join_cnt = 0;

        while (true) { 
            System.out.print("[1]가입 [2]로그인 [3]종료");
            select = sc.nextInt();
            if(select == 1) {
                if(join_cnt == 3) {
                    System.out.println("회원가입이 불가능합니다.");
                    continue;
                }
                System.out.println("==가입==");
                System.out.print("아이디를 입력해주세요. >> ");
                String id = sc.next();
                System.out.print("비밀번호를 입력해주세요. >> ");
                pw_arr[join_cnt] = sc.nextInt();
                System.out.println("회원가입이 완료되었습니다.");
                join_cnt++;
            }else if(select == 2) {
                System.out.println("==로그인==");
            }else if(select == 3) {
                System.out.println("종료");
                break;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        
    }
}
