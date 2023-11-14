package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		// 다자인 패턴 :
		// 계속해서 같은 문제가 발생, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 것
		// MVC
		// model : 데이터를 저장하거나 조작하기위한 코드의 모음
		// view : 사용자에게 직접 보여지는 부분
		// controller : 실제 기능이 일어나는 부분

		Scanner sc = new Scanner(System.in);

		System.out.println("======회원관리 프로그램======");
		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원목록 [5]회원정보수정 [6]종료 ");
			int input = sc.nextInt();

			if (input == 1) {
				// 회원가입
				System.out.println("====회원가입====");

				// 사용자 입출력 구간
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();

				// DAO에 있는 join 메소드 사용
				// DAO 객체 생성!!
				MemberDAO dao = new MemberDAO();
				int row = dao.join(id, pw, name, age);

				if (row > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패 ㅠㅠ");
				}

			} else if (input == 2) {
				// 로그인
				System.out.println("====로그인====");

				System.out.print("ID를 입력하세요 : ");
				String id = sc.next();
				System.out.print("PW를 입력하세요 : ");
				String pw = sc.next();

				// DAO 객체 생성해서 login메소드 실행하기
				MemberDAO dao = new MemberDAO();
				String uName = dao.login(id, pw);

				System.out.println(uName + "님 환영합니다.");


			} else if (input == 3) {
				// 회원탈퇴
				System.out.println("====회원탈퇴====");
				
				// 1) 사용자로부터 아이디와 비밀번호 입력 받기 
				System.out.print("ID를 입력하세요 : ");
				String id = sc.next();
				System.out.print("PW를 입력하세요 : ");
				String pw = sc.next();
				
				MemberDAO dao = new MemberDAO();
				
				int row = dao.out(id, pw);
				
					if(row > 0) {
						System.out.println("회원탈퇴 성공ㅠ");
					}else {
						System.out.println("회원탈퇴 실패!");
					}
					
		

			} else if (input == 4) {
				// 전체회원목록
				System.out.println("====전체회원목록====");
				
				System.out.println("id \t이름"+"\t나이");

				
				// DAO 생성
				MemberDAO dao = new MemberDAO() ;
				ArrayList<MemberDTO> list = dao.selectAll();
				
				
				for (MemberDTO dto : list) {
				System.out.print(dto.getId() + "\t" );
				System.out.print(dto.getName() + "\t");
				System.out.print(dto.getAge() + "\t");
				System.out.println();	
				}

				
			} else if (input == 5) {
				// 회원정보수정
				System.out.println("====회원정보수정====");
					
				
				// 사용자 입출력 구간
				System.out.print("ID 입력: ");
				String id = sc.next();		
				System.out.print("PW 입력: ");
				String pw = sc.next();
				// 수정할 데이터 입력 받기(바꿀 이름)
				System.out.print("수정할 이름 입력 : ");
				String name = sc.next();
				
				MemberDAO dao = new MemberDAO();
				int row = dao.modify(name, id, pw);
					
					if(row > 0) {
						System.out.println("회원정보 수정 성공!");
					}else {
						System.out.println("회원정보 수정 실패 ㅠㅠ");
					}
					
				
					
						
			} else if (input == 6) {
				// 종료
				System.out.println("회원관리 프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 누르셨습니다!");
			}
		}
	}

}
