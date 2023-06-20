package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//1.사용할 db밴더의 드라이버를 로딩시킴
//2.연결(데이터베이스)을 진행
//3.SQL문을 날립니다.
//4. 모든 질의(SQL)문의 끝나면, 나중에는 자원 반납
public class DBExample {

	public static void main(String[] args) throws Exception {
		
		//1.akfldkelq emfkdlqj fheld
		Class.forName("org.mariadb.jdbc.Driver");
		
		//2. DB를 연결하자
		Connection conn = 
		DriverManager.getConnection(
				"jdbc:mariadb://javalec.c1kbeo7dfmcb.ap-northeast-2.rds.amazonaws.com:3306/javaproject",
				"admin", //아이디
				"49884988" //비밀번호
				);
		
		//3.질의문
		String sql = "select * from student";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		//System.out.println("레코드 수:" + rs.getFetchSize());
		
		while(rs.next()) {
			System.out.println("이름:" + rs.getString("name"));
			System.out.println("학년:" + rs.getString("grade"));
			System.out.println("평균점수:" + rs.getInt("score"));
		}
		
		//데이터 수정
		sql = "update student set name ='이종석', update_dt=current_timestamp()" + "where std_no = 1";
		int affected_rows = stmt.executeUpdate(sql);
		
		System.out.println("affected rows:" + affected_rows);
		
		//수정 데이터 확인
		sql = "select * from student";
		rs = stmt.executeQuery(sql);

		while(rs.next()) {
			System.out.println("이름:" + rs.getString("name"));
			System.out.println("학년:" + rs.getString("grade"));
			System.out.println("평균점수:" + rs.getInt("score"));
		}
		
		//4.자원반납 (Connection)끊기
		stmt.close();
		if(!conn.isClosed()) conn.close();

	}

}
