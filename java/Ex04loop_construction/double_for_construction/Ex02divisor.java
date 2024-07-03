package aischool.java.Ex04loop_construction.double_for_construction;

public class Ex02divisor {
    
    public static void main(String[] args) {
        
        // 2~30 약수 구하기

        for(int j = 2; j <= 30; j++) {
            System.out.print(j+"의 약수 : ");
            for(int i = 1; i <= j/2; i++) {
                if(j % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.print(j);
            System.out.println();
        }
    }
}
