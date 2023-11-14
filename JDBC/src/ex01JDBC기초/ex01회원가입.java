package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01회원가입 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 사용자 입출력 구간
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		
		
		Connection conn = null;
		PreparedStatement psmt = null; // 초기화는 기본값으로
		
		// try - catch구문
		// : 예외상황이 발생했을 때 어떤 대처를 할 건지 미리 처리해주는 구문
		// try --> 한 번 시도해봐 --> 예외가 발생한다면
		// catch --> 예외 발생에 대한 조치를 취할 수 있는 구간

		try {
			// JDBC
			// 1) 드라이버 로딩
			// --> 어떤 회사의 DB를 사용할 건지 결정해주는 부분
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Syntax Error (구문 오류)
			// : 프로그래밍 문법적으로 구문이 맞지 않았을 경우 발생하는 오류
			// --> 실행 전부터 잡아낼 수 있음.
			// Exception (예외 상황)
			// : 프로그래밍 문법적으로는 문제가 없으나, 실행하는 순간 예외상황이 발생할 수 있는 오류
			// --> 실행 후 잡아낼 수 있음.
			// ClassNotFoundException 발생!
			// (1) 매개변수에 오타 없는지 확인하기
			// (2) 프로젝트에 ojdbc6.jar 파일 추가했는지 확인하기

			// 2) 데이터베이스 연결
			// url 설명
			// jdbc:oracle:thin --> jdbc연결을 할 때 oracle thin버전을 사용할거야
			// @127.0.0.1 --> ip주소
			// 1521 --> port 번호(통로 이름 / 중복되면 안됨)
			// xe --> oracle db 별칭
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			// Connection --> interface
			// 인터페이스는 단독으로 객체 생성은 불가능하다.
			// ex) Employee e = new Employee() xxxxxxxx
			// ex) Employee e = new RegularEmployee() oooo

			if (conn != null) {
				System.out.println("연결 성공!");
			}

			// 3. sql문장(Query문)을 준비
			// 3-1) sql문장 작성
			String sql = "INSERT INTO AIMEMBER VALUES (?, ?, ?, ?)";
			// ?인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// : 지정한 데이터 공간 만큼 비워놓고 설명하기 전까지 대기
			
			
			// 3-2) 전송할 수 있도록 담아주기
			psmt = conn.prepareStatement(sql);
			
			// 3-3) 전송하기 전에 ?인자 채우는 작업 반드시 진행!
			// 데이터 바인딩 작업
			psmt.setString(1,id );
			psmt.setString(2,pw );
			psmt.setString(3, name);
			psmt.setInt(4, age);
			
			// 4. sql문 전송(실행)
			int row = psmt.executeUpdate();
			// executeUpdate() : insert, delete, update에만 사용한다.
			
			// 5) 결과를 이용한 작업처리
			//    >> 사용자에게 어떤 모습을 보여줄건지 정의
			if(row > 0) {
				System.out.println("회원가입 성공!");
			}else {
				System.out.println("회원가입 실패 ㅠㅠ");
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
