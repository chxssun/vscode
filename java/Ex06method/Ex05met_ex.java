public class Ex05met_ex {
    
    public static void main(String[] args) {
        
        // 실습) 덧셈, 뺼셈, 곱셈, 나눗셈 메서드 만들기
        add(3,5);
        sub(3,5);
        mul(3,5);
        div(3,5);
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void sub(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public static void mul(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public static void div(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
