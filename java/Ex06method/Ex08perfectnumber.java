public class Ex08perfectnumber {
    
    public static void main(String[] args) {
        
        // 1) isDivisor(n1, n2) : n2가 n1의 약수인지 아닌지 확인
        int num1 = 10;
        int num2 = 2;
        boolean divisor = isDivisor(num1, num2);
        System.out.println(divisor);

        // 2) getDivisor(n) : n의 약수를 구하는 메소드
        getDivisor(10);
        getDivisor(16);
        getDivisor(24);

        // 3) getSumOfDivisor() : n의 약수들의 합을 구하는 메소드
        int num = 10;
        int result = getSumOfDivisor(num);
        System.out.println(num + "의 약수의 합 : " + result);
        getDivisor(num);

        // 4) isPerfectNumber(n) : 완전수 확인 메소드
        int num3 = 28;
        boolean result2 = isPerfectNumber(num3);
        System.out.println(result2);
        
        // 5) getPerfectNumber(n1, n2) : n1~n2 숫자중 완전수만 출력
        int startValue = 2;
        int endValue = 1000;
        getPerfectNumber(startValue, endValue);
    }

    // 1) isDivisor(n1, n2)
    public static boolean isDivisor(int num1, int num2) {
        return num1 % num2 == 0? true : false;
    }

    // 2) getDivisor(n)
    public static void getDivisor(int num) {
        System.out.print(num + "의 약수 : ");
        for(int i = 1; i <= num/2; i++) {
            if(isDivisor(num, i)) {
                System.out.print(i + " ");
            }
        }System.out.println(num);
    }

    // 3) getSumOfDivisor(n)
    public static int getSumOfDivisor(int num) {
        int sum = 0;
        for(int i = 1; i <= num/2; i++) {
            if(isDivisor(num, i)) {
                sum += i;
            }
        }
        return sum += num ;
    }

    // 4) isPerfectNumber(n)
    public static boolean isPerfectNumber(int num) {
        return num == getSumOfDivisor(num) - num? true : false;
    }

    // 5) getPerfectNumber(n1, n2)
    public static void getPerfectNumber(int num1, int num2) {
        System.out.print(num1 + "~" + num2 + "사이의 완전수는 : ");
        for(int i = num1; i <= num2; i++) {
            if(isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
