package aischool.java.Ex07oop.Person;

public class Main {
    
    public static void main(String[] args) {
        
        // 설계도를 사용하는 곳
        // 설계도이름 레퍼런스형변수명 = new 설계도 이름();
        Person p1 = new Person();

        System.out.println(p1);

        // Person의 필드 (이름, 나이, 성별)
        // person의 메소드 (숨쉬기, 밥먹기, 잠자기)
        // .(참조연산자)
        p1.name = "김창선";
        p1.age = 29;
        p1.gender = "남자";

        System.out.println(p1.name);

        p1.breathe();
        p1.eat();
        p1.sleep();

        // 실습) p2만들기
        Person p2 = new Person();

        p2.name = "천둥";
        p2.age = 6;
        p2.gender = "남자";
        System.out.println(p2.name+" : "+p2.age+" : "+p2.gender);


    }
}
