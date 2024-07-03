

public class Ex09Overloading {
    
    public static void main(String[] args) {
        
		// 한국인 이름을 데이터베이스에 저장하는 메서드
		// stName(성, 이름)
		// stName("김", "창선");
		
		stName("스티브", "폴", "잡스");
		stName("김", "창선");
		
		// 같은 기능을 하는 메서드들이 서로 다른 이름을 가지고 있으면
		// 번거로움...
		// 코드의 길이가 줄어든다 / if문으로 미국인인지, 한국인인지 구분할 필요가 없다
		
		//오버로딩(중복정의)(overloading) : 같은 클래스 내에서 같은 이름의 메서드를 정의 할 수 있다
		// 단, 매개변수의 형태가 달라야 한다 (데이터타입, 매개변수의 갯수, 순서)

	}
	public static void stName(int firstName, String lastName) {
		
	}
	public static void stName(String lastName, int firstName) {
		
	}
	
	public static void stName(String firstName, String lastName) {
		// 코드... 데이터베이스에 이름을 저장...
	}
	
	public static void stName(String firstName, String middleName, String lastName) {
		// 코드... 데이터베이스에 이름을 저장...
	}
}
