package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MemberDAO {

	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB랑 연결해서 insert, delete, update, select 하는 코드들의 모음
	// 메소드 형태로 코드 작성
	
	// 공통 필드
	Connection conn = null;
	PreparedStatement psmt = null; // 초기화는 기본값으로
	ResultSet rs = null;
	
	// DB연결 메소드
	private void getCon() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
			
		conn = DriverManager.getConnection(url, user, password);
			
		if(conn != null) {
			System.out.println("연결 성공~");
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//////////////////////////////////////////////////////DB연결 메소드
	
	// DB 종료 메소드
	private void getClose() {
		


		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	
	}
	
	

	// 회원가입 메소드
	public int join(String id, String pw, String name, int age) {

		
		int row = 0;

		try {
			
			getCon(); // DB 연결 메소드 사용

			String sql = "INSERT INTO AIMEMBER VALUES (?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			row = psmt.executeUpdate();


		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			
			getClose();
		}
		
		return row;
		
	}

	/////////////////////////////////////////////////////////회원가입
	
	// 로그인 메소드
	// login
	
	public String login (String id, String pw) {
		
		String uName = null;
		
		try {

			getCon();
			
		String sql = "SELECT * FROM AIMEMBER WHERE ID = ? AND PW = ?";
		
		psmt = conn.prepareStatement(sql);
			
		psmt.setString(1, id);
		psmt.setString(2, pw);
		
		rs = psmt.executeQuery();

		if(rs.next()== true) {

			uName = rs.getString("name");

		}else {
			uName = "알수없음" ;
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// DB연결 종료!
					getClose();

		}
		return uName;
		
	} 
		
	///////////////////////////////////////////////////////////로그인
	
	// 전체회원조회 메소드
	
	public ArrayList<MemberDTO> selectAll() {
	
		ResultSet rs = null;
		MemberDTO dto = null;
		ArrayList<MemberDTO> list = null;
		try {
			
			getCon();
			
		String sql = "SELECT * FROM AIMEMBER ";
		
		psmt = conn.prepareStatement(sql);
			

		rs = psmt.executeQuery();
	
		System.out.println("id"+"\t"+"이름"+"\t"+"나이");
		
		list = new ArrayList<MemberDTO>();
		
		
		while(rs.next()) {
			String id = rs.getString("ID");
			String name = rs.getString("NAME");
			int age = rs.getInt("AGE");
			// 조회된 결과에 담겨있는 데이터를 DTO로 옮겨 담기!
			dto = new MemberDTO(id, "", name, age);
			
			list.add(dto);
			
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
					getClose();

		}	
		return list;
	}
	
	//////////////////////////////////////////////////전체회원조회
	
	
	public int out (String id, String pw) {

		int row = 0;
		
		// DB 연결

		try {
			getCon();

			// sql문 준비
			String sql = "delete from aimember where id = ? and pw = ?" ;


			psmt = conn.prepareStatement(sql);
			

			// ? 채우는 작업(데이터 바인딩)
			psmt.setString(1, id);
			psmt.setString(2, pw);

			

			// 쿼리문 보내서 실행시키기
			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		
			getClose();

		}return row;
		

	}
////////////////////////////////////////////////////////// 회원탈퇴
	
	// 회원정보수정메소드
	
	public int modify (String name, String id, String pw) {
	
		int row = 0;
		
	try {
		
		getCon();
		
		String sql = "UPDATE AIMEMBER SET NAME = ? WHERE id = ? and PW = ?";
		
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1,name );
		psmt.setString(2, id );
		psmt.setString(3, pw);
	
		row = psmt.executeUpdate();
	
	} catch (Exception e) {
		// Exception --> 모든 예외상황에 대한 부모클래스
		// : 업캐스팅이 일어났기 때문에 모든 예외상황 잡을 수 있음!

		e.printStackTrace();
//		System.out.println("죄송합니다. 서비스 준비 중입니다.");
	}finally {
		
		getClose();
		
	}
	return row;
	}
	
	
	
}
