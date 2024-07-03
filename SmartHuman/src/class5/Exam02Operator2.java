package class5;

import java.util.Scanner;

public class Exam02Operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력 >> ");
        int age = sc.nextInt();

        age += 1;

        System.out.println(age);
    }
}
