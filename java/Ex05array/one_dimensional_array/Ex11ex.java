package aischool.java.Ex05array.one_dimensional_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11ex {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<String> id_list = new ArrayList<>();
      ArrayList<String> pw_list = new ArrayList<>();
      int program = 0;
      String id = "";
      String pw = "";

      while (program != 3) {
         System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
         program = sc.nextInt();
         if (program == 1) {
            System.out.println("==회원가입==");
            System.out.print("아이디를 입력해주세요. >> ");
            id = sc.next();
            System.out.print("비밀번호를 입력해주세요. >> ");
            pw = sc.next();
            if (id_list.contains(id)) {
               System.out.println("존재하는 아이디 입니다.");
            } else {
               id_list.add(id);
               pw_list.add(pw);
               System.out.println("회원가입이 완료되었습니다.");
            }

         } else if (program == 2) {
            System.out.println("==로그인==");
            System.out.print("아이디를 입력해주세요. >> ");
            id = sc.next();
            System.out.print("비밀번호를 입력해주세요. >> ");
            pw = sc.next();
            if (id_list.contains(id)) {
               if (pw_list.get(id_list.indexOf(id)).equals(pw)) {
                  System.out.println("로그인에 성공하였습니다.");
               } else {
                  System.out.println("비밀번호가 틀렸습니다.");
               }
            } else {
               System.out.println("존재하지 않는 아이디입니다.");
            }
         } else if (program == 3) {
            break;
         }

      }
      System.out.println("프로그램이 종료되었습니다.");
        
   }
}
