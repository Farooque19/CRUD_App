package Minor_Project;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TeacherDaoImpl implements TeacherDaoInterface {

	public void createteacher(Teacher t) {
		Connection con = DBConnection.createdDBConnection();
		String query = "insert into teacher values (?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, t.getId());
			pstm.setString(2, t.getName());
			pstm.setDouble(3, t.getSalary());
			pstm.setString(4, t.getGender());
			pstm.setInt(5, t.getAge());
			pstm.setString(6, t.getCourse());
			int count = pstm.executeUpdate();
			if(count != 0) {
				System.out.println("Teacher Inserted Successfully.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void showAllTeacher() {	
		Connection con = DBConnection.createdDBConnection();
		String query = "Select * from teacher";
		System.out.println("-----------------------------------------------------");
		System.out.println("Teacher Details:");
		System.out.println("Id\tName\tSalary\tGender\tAge\tCourse");
		System.out.println("-----------------------------------------------------");
		try {
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				System.out.print(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getInt(3)+"\t"+result.getString(4)+"\t"+result.getInt(5)+"\t"+result.getString(6)+"\n");
				System.out.println("-----------------------------------------------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void showTeacherBasedOnId(int id) {
		Connection con = DBConnection.createdDBConnection();
		String query = "Select * from teacher where id = "+id;
		System.out.println("Teacher Details:");
		System.out.println("-----------------------------------------------------");
		System.out.println("Id\tName\tSalary\tGender\tAge\tCourse");
		System.out.println("-----------------------------------------------------");
		try {
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				System.out.print(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getInt(3)+"\t"+result.getString(4)+"\t"+result.getInt(5)+"\t"+result.getString(6)+"\n");
				System.out.println("-----------------------------------------------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updateTeacher(int id, String name) {
		Connection con = DBConnection.createdDBConnection();
		String query = "update teacher set name = ? where id = ?";
		try {
			PreparedStatement pdst = con.prepareStatement(query);
			pdst.setString(1, name);
			pdst.setInt(2, id);
			int count = pdst.executeUpdate();
			if(count!=0) {
				System.out.println("Teacher name updated successfully.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteTeacher(int id) {
		Connection con = DBConnection.createdDBConnection();
		String query = "Delete from teacher where id = ?";
		try {
			PreparedStatement pdst = con.prepareStatement(query);
			pdst.setInt(1, id);
			int count = pdst.executeUpdate();
			if(count!=0) {
				System.out.println("Teacher details deleted successfully.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
