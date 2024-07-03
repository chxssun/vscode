public class Ex02arg_O__re_X {
    
    public static void main(String[] args) {
        
        // 매개변수는 있고, (void)리턴타입이 없는 메서드
        sumPrint(5,10,15);
        // System.out.println(sumPrint(5,10,15));
		// System.out.println(System.out.println(sumPrint(5,10,15)));
		// 출력문을 출력하려는 행위와 같다 - 에러발생
    }

    public static void sumPrint(int a, int b, int c) {

        // void는 return키워드가 필수는 아니다
        System.out.println(a+b+c);
        // void : 기능 자체를 결과값으로 돌려주는 경우

    }
}
