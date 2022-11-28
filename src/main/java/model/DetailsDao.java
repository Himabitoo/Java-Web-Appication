package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DetailsDao {
	
	private String DB_URL ="jdbc:mysql://localhost:3306/intern_first";
	private String DB_USER = "root";
	private String DB_PWD = "password";
	
	public DetailsEntity getDetailsData() {
		
		DetailsEntity de = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = 
				DriverManager.getConnection(
					DB_URL,
					DB_USER,
					DB_PWD);
			
			String sql = "SELECT * FROM kaigi_reservations;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				de = new DetailsEntity();
				de.setRoomNumber(rs.getInt("room"));
				de.setRoomTitle(rs.getString("title"));
				de.setRoomDetails(rs.getString("details"));
				de.setRoomTime(rs.getString("time"));
			}
			
			conn.close();
			ps.close();
			rs.close();
			
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
		return de;
	}
}
