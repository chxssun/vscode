package aischool.java.Ex07oop.PiggyBank;

public class Main {
    
    public static void main(String[] args) {
        
        // 1) PiggyBank 설계도를 사용해서 객체 생성
        PiggyBank pig = new PiggyBank(10000); // 6-2) 접근불가되면 여기서 생성할때 초기화 
        // 6-3) 하려고하면 오류
        // 6-4) 저금통 클래스에서 생성자를 수정해야함 

        // 2) 10000원으로 초기화
        // pig.money = 10000; // 6-1) private으로 접근불가되버림

        // 3) 5000원 입금
        pig.deposit(5000);

        // 4) 잔액 확인
        pig.showMoney();

        // 5) 돈을 인출 -1200
        pig.withdraw(1200);

        // 6) 잔액 확인
        pig.showMoney();

        // 7) getter로 잔액확인
        System.out.println(pig.getMoney());

        // 8) setter로 잔액 변경
        pig.setMoney(18000);
        pig.showMoney();
    }
}
