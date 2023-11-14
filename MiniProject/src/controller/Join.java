package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Join {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	private void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-cgi.smhrd.com:1524:xe";
			String user = "cgi_5_230721_6";
			String password = "smhrd6";

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	private void getClose() {
		try {
			if (rs != null)
				rs.close();

			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

	public int join(String id, String pw, String nickname) {

		int row = 0;

		try {
			// DB 연결 메소드 사용
			getConn();

			String sql = "INSERT INTO MEMBER VALUES (?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nickname);

			row = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			getClose();
		}

		return row;
	}

	public String login(String id, String pw) {

		String uName = null;

		try {

			getConn();

			String sql = "SELECT * FROM  MEMBER WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				uName = rs.getString("nickname");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			getClose();
		}

		return uName;

	}

}
