package Minor_Project;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	static Connection con;
	public static Connection createdDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/teacherDB?useSSL=false";
			String username = "root";
			String password = "Farooque@123";
			con = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
