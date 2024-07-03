public class Ex07met_ex {
    
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 24;
        int result = largeNumber(num1, num2);
        System.out.println("큰 수 확인 : " + result);
    }

    public static int largeNumber(int num1, int num2) {
        return num1 > num2? num1 : num2;
    }
}
