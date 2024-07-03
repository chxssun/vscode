package aischool.java.Ex02operator.unary_operator;

public class Ex01in_decrement_oper {
    
    public static void main(String[] args) {
        
        // 증감연산자 : ++, -- (앞/ 뒤)
        // num++ : num = num + 1;
        // num-- : num = num - 1;
        int num = 10;
        System.out.println(num++);
        // 증감연산자가 뒤에 있으면 출력 후 연산
        // 10을 출력후 11이 되어있는 상태
        System.out.println(--num);
        // 증감연산자가 앞에 있으면 연산 후 출력
        // 11에서 -1하고 10출력

    }
}
