package aischool.java.Ex09extends.Mouse;

public class Main {
    
    public static void main(String[] args) {
        
		// BallMouse
		BallMouse mouse1 = new BallMouse();
		mouse1.drag();
		mouse1.leftClick();
		mouse1.rigthClick();

		// WheelMouse
		WheelMouse mouse2 = new WheelMouse();
		mouse2.drag();
		mouse2.leftClick();
		mouse2.rigthClick();
		mouse2.scroll();
		
		// 상속 : 기존 클래스의 변수/메서드를 물려받아 새로운 클래스를 구성
		// 기존 클래스 : 부모클래스 / 수퍼클래스
		// 새로운 클래스 : 자식클래그 / 서브클래스
		
		// 부모 <-- 데이터를 탐색해나가는 방향 -- 자식
		// extends(확장하다)
		// public class 자식클래스 extends 부모클래스
	
    }
}
