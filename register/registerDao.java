package register;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class registerDao {
	String id = "root";
	String password = "111111";
	String url = "jdbc:mysql://localhost:3306/jspdb?characterEncoding=utf-8";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void connect() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, password);
			
			System.out.println("MySQL연결 성공");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void disConnect() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void insertRegister(registerDo rdo) {
		System.out.println("insertRegister() --> ");
		connect();

			
			String sql = "insert into register values(?,?)";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, rdo.getName());
				pstmt.setString(2, rdo.getEmail());
				
				pstmt.executeUpdate();
				System.out.println("insertRegister() 처리 완료");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		disConnect();
	}
	public ArrayList<registerDo> getAllRegister(){
		System.out.println("getAllRegister()  처리 시작!");
		connect();
		//sql 처리
		ArrayList<registerDo> aList = new ArrayList<>();
		
		String sql = "select * from register";
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				registerDo rdo = new registerDo();
				rdo.setName(rs.getString(1));
				rdo.setEmail(rs.getString(2));
				
				aList.add(rdo);
				
			}
			System.out.println("getAllRegister() 처리 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		disConnect();
		
		return aList;
	}
	}
	
	


