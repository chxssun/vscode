public class Ex01arg_O__re_O {
    
    public static void main(String[] args) {
        
        // 매개변수 있고, 리턴타입(테이터 타입이 명시)이 있는 메서드
        minus(10, 5);
        System.out.println(minus(10,5));
    }// main 밖 - 메서드 정의

    // 1) public : 공공의
    //   - 클래스 내/외부에서 자유로운 접근을 할 수 있도록 도와주는 제한자
    //   (private, protected, default)

    // 2) static : 저장소
    //   - 메모리 공간이 굉장히 작기 때문에 함부로 사용하지 말 것

    // 3) int : 리턴타입
    //   - 메서드가 리턴하는 데이터 타입을 명시

    // 4) minus : 메서드명(호출명)

    // 5) (int a, int b) : 매개변수 선언만
    public static int minus(int num1, int num2) {
        // {} (body) == 메서드 로직
        int result = num1 - num2;
        return result;
        // return num1 - num2; 
        // return : 리턴타입에 데이터타입이 명시되어 있으면 반드시 사용해야함
    }
}
