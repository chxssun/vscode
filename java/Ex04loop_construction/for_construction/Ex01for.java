package aischool.java.Ex04loop_construction.for_construction;

public class Ex01for {
    
    public static void main(String[] args) {
        
        // 실습1) 21부터 57까지 출력
        for (int i = 21; i <= 57; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        // 실습2) 96부터 53까지 출력
        for (int i = 96; i >= 53; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        // 실습3) 21부터 57까지 중 홀수만 출력
        for (int i = 21; i <= 57; i++) {
            if (i % 2 == 1) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // 실습3 - 증감식 으로
        for (int i = 21; i <= 57; i += 2) {
            System.out.print(i+" ");
        }
        System.out.println();



    }
}
