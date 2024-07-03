package aischool.java.Ex05array.one_dimensional_array;

import java.util.Random;

public class Ex06array {
    
    public static void main(String[] args) {
        
        // 실습 로또 프로그램
        // 크기가 5인 배열안에 1~10사이의 숫자가 중복되지 않게 넣고 출력한다
        
        int[] lots = new int[5];

        Random rd = new Random();

        for (int i = 0; i < lots.length; i++) {
            int num = rd.nextInt(10)+1;
            lots[i] = num;
            for (int j = 0; j < i; j++) {
                if(num == lots[j]) {
                    i--;
                    break;
                }
            }
        }
        
       System.out.println("===로또타임====");
       System.out.println("이번주 출력번호는요...!!두구두구구구!!!");
       for(int i = 0; i < lots.length; i++) {
    	  System.out.print(lots[i]+" ");
      } 
        
    }
}
