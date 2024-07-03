package aischool.java.Ex07oop.PiggyBank;

public class PiggyBank {
    
    // 저금통 설계도

    // 1) 필드 - 금액
    private int money;
	// private : 필드를 클래스 외부에서 접근할 수 없도록 도와주는 제한자
	// private로 되어있는 필드는 존재하고 있는 클래스 내부에 메서드를 통해서만 
	// 접근이 가능하다

    // main 6-3해결 하려면 생성자 만들어야함
    // 생성자(constructor) - 얘는 기본생성자 생략되어있음
    public PiggyBank() {

    }

    // 오버로딩 - 으로 6-3해결
    public PiggyBank(int money) {
        this.money = money;
    }

    // 생성자의 특징*****
	// 1. 생성자도 메서드 - ()가 있다
	// 2. 생성자는 리턴타입이 없다(void도 안온다)
	// 3. 기본생성자는 생략되어 있다.
	// 4. 새로운 생성자를 내가 만들면
	//   필드를 초기화 시키는 생성자를 만들면
	//   기본생성자는 사용할 수 없는 상태가 된다...
	
	// getter / setter
	// getter : 필드에 있는 데이터를 결과값으로 돌려주는 메서드
	// setter : 필드에 있는 값을 수정하고 싶을 때 사용하는 메서드
    public int getMoney() {
        return money;
        }
    public void setMoney(int money) {
        this.money = money;
    }
    
    

    // 2) 메서드 - 입금, 출금, 잔액
    public void deposit(int money) {
        // 입금
        this.money += money;
    }

    public void withdraw(int money) {
        // 출금
        this.money -= money;
    }

    public void showMoney() {
        // 잔액 
        System.out.println(money + "원");
    }


}
