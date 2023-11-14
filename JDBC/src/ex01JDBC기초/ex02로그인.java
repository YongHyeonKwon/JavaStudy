package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex02로그인 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1) 사용자로부터 아이디와 비밀번호 입력 받기 
		
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.print("PW를 입력하세요 : ");
		String pw = sc.next();
		
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
		String sql = "SELECT * FROM AIMEMBER WHERE ID = ? AND PW = ?";
		
		psmt = conn.prepareStatement(sql);
			
		// ?인자 채워주기
		psmt.setString(1, id);
		psmt.setString(2, pw);
		
		// 4) sql문 전송/실행
		rs = psmt.executeQuery();
		// ReultSet이란?
		// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조 
		// : cursor를 가지고 있다. (처음에는 column명을 가리키고 있음)
		// : cursor가 가리키고 있는 데이터만 가져올 수 있다.
		
		// rs.next() ---> cursor를 한행 밑으로 내리는 작업
		// 데이터가 있다면 true, 없다면 false 
		
		if(rs.next()== true) {
			// 로그인 성공했을 때!
			// 손지영님 환영합니다~ 할 수 있다.
			String uName = rs.getString("name");
			int uAge = rs.getInt("age");
			System.out.println(uName + "님 환영합니다.");
			
		}else {
			System.out.println("로그인에 실패했습니다.");
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
