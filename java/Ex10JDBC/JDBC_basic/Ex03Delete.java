package aischool.java.Ex10JDBC.JDBC_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학생의 이름을 입력하세요 >> ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		Student stu = new Student(name, age);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String id = "hr";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			Connection con = DriverManager.getConnection(url, id, pw);
			
			String Sql = "DELETE STUDENT WHERE NAME=? AND AGE=?";
			
			PreparedStatement psmt = con.prepareStatement(Sql);
			
			psmt.setString(1, stu.getName());
			psmt.setInt(2, stu.getAge());
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("권한 확인 실패");
		}
		

	}

}
