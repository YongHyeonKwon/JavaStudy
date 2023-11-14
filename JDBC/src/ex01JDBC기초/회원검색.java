package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class 회원검색 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 회원 검색 기능!
		// 아이디 검색 --> 회원 이름, 나이
		// 아이디에 shr이 들어있는 회원 검색
		// 회원 id, 이름, 나이 
		
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		
		try {
			// 2) DB연결
			// 2-1) 드라이버 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2-2 DB 연결 통로 열기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
			
		conn = DriverManager.getConnection(url, user, password);
			
		if(conn != null) {
			System.out.println("연결 성공~");
		}
			
		// 3) SQL문 작성
		// 아이디, 비밀번호가 일치하는 데이터의 모든 컬럼 가지고오기
		String sql = "SELECT * FROM AIMEMBER WHERE ID = ?";
		
		psmt = conn.prepareStatement(sql);
			
		psmt.setString(1, id);
		
		// 4) sql문 전송/실행
		rs = psmt.executeQuery();
		
		
		if(rs.next()) {
			System.out.println(rs.getString("ID") + "\t" + rs.getString("NAME") + "\t" + rs.getInt("AGE"));
		}
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// DB연결 종료!
				try {
					if (rs != null)
					rs.close();
					if(psmt != null)
					psmt.close();
					if(conn != null)
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}
		
		
		
		
	}

}
