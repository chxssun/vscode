package aischool.java.Ex07oop.Person;

public class Person {
    // 설계도에 해당하는 곳
    // class == 설계도

    // 1) Field(필드) : 데이터, 변수, 속성, 정보
    // 내가 설계하고자 하는 Object(Person)가 가질 수 있는 데이터
    // 사람이 가질수 있는 데이터(변수)?
    // 나이
    int age;
    // 성별
    String gender;
    // 이름
    String name;
    // 필드를 만들때는 선언만 해준다
    
    // 2) Method(메서드) : 기능, 동작, 행위
    // 사람이 할수 있는 행위
    // 숨쉬기
    public void breathe() {
        System.out.println("숨을 쉰다 o3o ~~"
        );
    }
    // 밥먹기
    public void eat() {
        System.out.println("밥을 먹는다 : q ~~"
        );
    }
    // 잠자기
    public void sleep() {
        System.out.println("잠을 잔다 : ㅡ_ㅡzz"
        );
    }
}
