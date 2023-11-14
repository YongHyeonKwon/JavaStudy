package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex05회원정보수정 {

	public static void main(String[] args) {

		// 사용자에게 아이디와 비밀번호를 입력받아서 
		// 이름 수정해보기!!~! 쓰윽쓰윽~
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입출력 구간
		System.out.print("ID 입력: ");
		String id = sc.next();		
		System.out.print("PW 입력: ");
		String pw = sc.next();
		// 수정할 데이터 입력 받기(바꿀 이름)
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		
		Connection conn = null;
		PreparedStatement psmt = null; // 초기화는 기본값으로
		
		try {
			// JDBC
			// 1) 드라이버 로딩
			// --> 어떤 회사의 DB를 사용할 건지 결정해주는 부분
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			
			if (conn != null) {
				System.out.println("연결 성공!");
			}
			
			String sql = "UPDATE AIMEMBER SET NAME = ? WHERE id = ? and PW = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,name );
			psmt.setString(2,id );
			psmt.setString(3, pw);
		
			int row = psmt.executeUpdate();
			
			if(row > 0) {
				System.out.println("회원정보 수정 성공!");
			}else {
				System.out.println("회원정보 수정 실패 ㅠㅠ");
			}
			
		} catch (Exception e) {
			// Exception --> 모든 예외상황에 대한 부모클래스
			// : 업캐스팅이 일어났기 때문에 모든 예외상황 잡을 수 있음!

			e.printStackTrace();
//			System.out.println("죄송합니다. 서비스 준비 중입니다.");
		}finally {
			// 위에서 예외상황이 발생하더라도 반드시 한 번은 들어오는 구간
			// 6) DB 연결 종료 
			
			try {
				
				// 자원을 반납할 때는 항상 사용한 순서의 역으로 반납한다.
				if(psmt != null)
				psmt.close();
				
				if(conn != null)
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
		}
			
			
	}

}

