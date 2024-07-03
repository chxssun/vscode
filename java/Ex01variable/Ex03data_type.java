package aischool.java.Ex01variable;

public class Ex03data_type {
    
    public static void main(String[] args) {
        
        // 1. 논리형
        // 1) boolean : 1byte
        // true, false 값이 저장된다.
        boolean isHot = true;

        // 2. 문자형
        // 1) char : 2byte
        // 문자 1개를 저장한다.
        // ''(작은따옴표)로 사용한다.
        // 유니코드 문자 표현 가능
        char ch = 'A';

        // 3. 정수형
        // 1) byte : 1byte
        // -128 ~ 127
        byte num1 = 10;
        // 2) short : 2byte
        // -32768 ~ 32767
        short num2 = 10;
        // 3) int : 4byte
        // -2147483648 ~ 2147483647
        int num3 = 10;
        // 4) long : 8byte
        // -9223372036854775808 ~ 9223372036854775807
        long num4 = 10L;
        
        // 4. 실수형
        // 1) float : 4byte
        float pi2 = (float) 3.141592;
        // 2) double : 8byte
        double pi = 3.141592;

        // 형변환(Cast/ Casting)
        // 1) 강제형변환(명시적 형변환)
        // - 큰 자료형을 작은 자료형의 변수에 대입할 때
        float num5 = (float) 3.141592;
        // 2) 자동형변환(묵시적 형변환)
        // - 작은 자료형을 큰 자료형의 변수에 대입할 때
        double num6 = num5;
       
    }
}
