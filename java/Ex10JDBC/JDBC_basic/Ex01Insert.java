package aischool.java.Ex10JDBC.JDBC_basic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Insert {

	public static void main(String[] args) {
		
		// 사용자로부터 이름, 나이, 성별, 학과를 입력받아서
		// 데이터베이스에 저장될 수 있도록 해보자~
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("학과 : ");
		String major = sc.next();
		
		// 입력받은 4개의 데이터를 Student라는 하나의 자료형 
		Student stu = new Student(name, age, gender, major);
		
		// 1. 동적 로딩 : 실행을 시키면 자료형이 결정되는 것
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 기울임꼴 형태의 코드 : static(정적인 공간을 사용하는)
			
			// Syntax Error (문법에러)
			// Exception (예외상황)
			
			// 2. 데이터베이스 연결권한 확인
			// 준비물 : id, pw, url
			String id = "hr";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			// jdbc:oracle:thin - 오라클 thin 드라이버
			// @localhost - 나의 컴퓨터 ip주소를 가져와주는 키워드
			// 1521 : port번호
			// xe : 오라클 db의 별명
			
			Connection con = DriverManager.getConnection(url, id, pw);
			// DriverManager import해주기
			// Connection import해주기
			
			// con - 받아온 연결 권한
			
			// 3. 쿼리문을 준비하자
			String sql = "INSERT INTO STUDENT VALUES(?,?,?,?)";
			// ? : 사용자가 입력한 값인데 내가 아직 사용자가 뭘 입력한지 모르기 떄문
			PreparedStatement psmt = con.prepareStatement(sql);
			// import작업하기 - db로 쿼리문을 가지고 이동하는 객체
			// ? 를 채우는 작업을 진행해보자
			
			psmt.setString(1, stu.getName());
			psmt.setInt(2, stu.getAge());
			psmt.setString(3, stu.getGender());
			psmt.setString(4, stu.getMajor());
			
			int cnt = psmt.executeUpdate();
			// executeUpdate : 쿼리문을 db로 이동시켜서 실행하고
			// 결과값도 받아오는 기능을 가지고 있다
			// 결과값은 테이블에 영향을 받은 행이 있는지 없는지에 대해서 int자료형의 값을 가져온다
			
			if(cnt > 0) {
				System.out.println("추가 성공");
			}else {
				System.out.println("추가 실패");
			}
			
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
			System.out.println("동적 로딩 실패");
			
			// OracleDriver 
			// 1) ojdbc.jar 파일이 적용이 안되어있거나
			// 2) ""경로가 잘못되었거나 - 오타
		}
		// try ~ catch ~ finally
		// : 예외상황을 처리하는 문법
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("권한 확인 실패");
			
			// - 나의 계정의 비밀번호나 아이디 오타확인
			// - url의 값이 잘못된건 아닌지 오타 확인
		}
		
			
		
	}
}
