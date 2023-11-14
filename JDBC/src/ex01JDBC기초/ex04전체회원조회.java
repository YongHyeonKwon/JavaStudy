package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex04전체회원조회 {

	public static void main(String[] args) {
		
		// 전체회원조회
		// 로그인 참고해서 만들기!!
		
		// ID       이름       나이
		// test     test      20
		// nami     임경남      20
		// smhrd    김운비      20
		
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
		String sql = "SELECT * FROM AIMEMBER ";
		
		psmt = conn.prepareStatement(sql);
			
		
		// 4) sql문 전송/실행
		rs = psmt.executeQuery();
		// ReultSet이란?
		// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조 
		// : cursor를 가지고 있다. (처음에는 column명을 가리키고 있음)
		// : cursor가 가리키고 있는 데이터만 가져올 수 있다.
		
		// rs.next() ---> cursor를 한행 밑으로 내리는 작업
		// 데이터가 있다면 true, 없다면 false 
		
		System.out.println("id"+"\t"+"pw"+"\t"+"이름"+"\t"+"나이");
		
		while(rs.next()) {
			String getString = rs.getString("ID");
			String getString2 = rs.getString("PW");
			String getString3 = rs.getString("NAME");
			int getInt = rs.getInt("AGE");
			
			System.out.print(getString + "\t" );
			System.out.print(getString2+ "\t");
			System.out.print(getString3+ "\t");
			System.out.print(getInt+ "\t");
			System.out.println();	
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
