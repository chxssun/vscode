package aischool.java.Ex10JDBC.JDBC_basic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Update {

	public static void main(String[] args) {

		// Scanner를 사용해서 사용자한테 이름 나이를 입력 받아서
		// 전공을 수정해보자
		Scanner sc = new Scanner(System.in);
		System.out.print("본인의 이름을 입력하세요 >> ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		System.out.print("수정할 전공을 입력하세요 >> ");
		String major = sc.next();
		// Student 자료형을 사용해서 캡슐화를 진행해주시면 됩니다.
		// 생성자를 사용해서 필드 3개를 초기화 시켜야된다
		
		Student stu = new Student(name, age, major);
		
		// JDBC 코드 - UPDATE STUDENT SET MAJOR = ? WHERE NAME =? AND AGE =?;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String id = "hr";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			Connection con = DriverManager.getConnection(url, id, pw);
			
			String sql = "UPDATE STUDENT SET MAJOR=? WHERE NAME=? AND AGE=?";
			
			PreparedStatement psmt = con.prepareStatement(sql);
			
			psmt.setString(1, stu.getMajor());
			psmt.setString(2, stu.getName());
			psmt.setInt(3, stu.getAge());
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("변경 성공");
			}else {
				System.out.println("변경 실패");
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("동적 로딩 실패");
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("권한 확인 실패");
		}
		
	}

}
