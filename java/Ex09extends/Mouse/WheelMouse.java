package aischool.java.Ex09extends.Mouse;

public class WheelMouse extends BallMouse {

    // extends(확장하다)
	// class 자식클래스명 extends 부모클래스
	
	// 우클릭, 좌클릭, 드래그는 BallMouse클래스로부터 상속

	public void scroll() {
		System.out.println("스크롤하기");
	}
    
}
