package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex03회원탈퇴 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1) 사용자로부터 아이디와 비밀번호 입력 받기 
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.print("PW를 입력하세요 : ");
		String pw = sc.next();
		
		
		Connection conn = null;
		PreparedStatement psmt = null; 
		
		// DB 연결

		// 1. 드라이버 동적 로딩
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			// url, user, password
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			
			


			if (conn != null) {
				System.out.println("연결 성공!");
			}


			// sql문 준비
			String sql = "delete from aimember where id = ? and pw = ?" ;


			psmt = conn.prepareStatement(sql);
			

			// ? 채우는 작업(데이터 바인딩)
			psmt.setString(1, id);
			psmt.setString(2, pw);

			

			// 쿼리문 보내서 실행시키기
			int row = psmt.executeUpdate();

			// 결과를 이용해 작업 처리
			if(row > 0) {
				System.out.println("회원탈퇴 성공ㅠ");
			}else {
				System.out.println("회원탈퇴 실패!");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// DB 연결 종료!
			// 사용한 순서의 반대로 반납한다!
			try {
				

				if(psmt != null)
				psmt.close();
				
				if(conn != null)
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
		
		// delete from aimember where id = ? and pw = ?
		// 7월17일
		
		
	}

}
