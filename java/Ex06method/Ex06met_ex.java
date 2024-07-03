public class Ex06met_ex {
    
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 2;
        char op = '+';

        System.out.println(cal(num1, num2, op));
    }

    public static int cal(int num1, int num2, char op) {
        int result = 0;
        if(op == '+') {
            result = num1 + num2;
        }else if(op == '-') {
            result = num1 - num2;
        }else if(op == '*') {
            result = num1 * num2;
        }else if(op == '/') {
            result = num1 / num2;
        }
        return result;
    }
}
