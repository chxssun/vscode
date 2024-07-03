package aischool.java.Ex07oop.Person2;

public class Main {
    
    public static void main(String[] args) {
        
        Person2 p1 = new Person2();
        p1.setAge(29);
        p1.setName("김창선");

        Person2 p2 = new Person2("김천둥", 6);

        System.out.println("st1객체 학생 이름 : "+p1.getName()+", 나이 : "+p1.getAge());
        System.out.println("st2객체 학생 이름 : "+p2.getName()+", 나이 : "+p2.getAge());
    }
}
