package aischool.java.Ex02operator.binary_operator;

public class Ex03logical_oper {
    
    public static void main(String[] args) {
        
        // 논리 연산자 (logical operator)
        // 1) not(!) : 부정연산자
        System.out.println(!true); // false

        // 2) and(&&) 
        // 양쪽이 모두 true일 때만 true
        // 하나라도 false이면 false
         int num1 = 10;
         int num2 = 20;
         System.out.println(num1 < num2 && num1 != num2); // true

         // 3) or(||)
         // 양쪽이 모두 false면 false
         // 하나라도 true이면 true
         System.out.println(num1 < num2 || num1 == num2); // true
    }
}
