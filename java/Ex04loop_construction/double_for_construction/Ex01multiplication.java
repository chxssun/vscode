package aischool.java.Ex04loop_construction.double_for_construction;

public class Ex01multiplication {
    
    public static void main(String[] args) {
        
        // 실습) 구구단

        // 이중 for문으로 구구단 출력
        for(int j = 2; j <= 9; j++) {
            System.out.print(j+"단 : ");
            for(int i = 1; i <= 9; i++) {
                System.out.print(j+"x"+i+"="+j*i+" ");
            }
            System.out.println();
        }
    }
}
