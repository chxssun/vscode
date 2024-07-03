package aischool.java.Ex07oop.StudentInfo;

public class StudentInfo {
    
    String name;
    String number;
    int age;
    int scoreJava;
    int scoreWeb;
    int scoreAndroid;

    public StudentInfo() {
    }

    public StudentInfo(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.scoreJava = scoreJava;
        this.scoreWeb = scoreWeb;
        this.scoreAndroid = scoreAndroid;
    }

    public void show() {
        System.out.println(name+"님 안녕하세요.");
        System.out.println("[ "+number+", "+age+"살 ]");
        System.out.println(name+"님의 Java점수는 "+scoreJava+"점 입니다");
        System.out.println(name+"님의 Web점수는 "+scoreWeb+"점 입니다");
        System.out.println(name+"님의 Android점수는 "+scoreAndroid+"점 입니다.");
    }
    
    
}
