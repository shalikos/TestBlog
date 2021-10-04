package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.User;



public class Dao {
	
	public static Connection getCon() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/blog?";
	    String user = "root";
	    String password = "05051992";
	    Connection con = DriverManager.getConnection(url, user, password);
		return con;
	
	}
	public static List<User> getUsers() {
		List<User> ans = new ArrayList<>();
		Connection con = null;
		try {
			con = getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			while(rs.next()) {
				ans.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ans;
	}
	/*
	 * public static boolean insertUser(User user) { Connection con = null; try {
	 * con = getCon(); Statement stmt = con.createStatement();
	 * stmt.execute("inser"); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }finally { try { con.close(); } catch
	 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * }
	 * 
	 * }
	 */
     public static void main(String[] args) {
    	 List<User> ans = new ArrayList<>();
    	 ans = getUsers();
    	 ans.forEach(e->System.out.println(e.getName()+" ,"+e.getPassword()));
     }
}
