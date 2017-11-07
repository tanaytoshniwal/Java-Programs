import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UpdateValues2 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Connection con=DBInfo2.getConnection();
		String query="UPDATE login SET password = ?,usertype = ? WHERE username = ?";
		String username=JOptionPane.showInputDialog("Enter Username");
		String password=JOptionPane.showInputDialog("Enter new Password");
		String usertype=JOptionPane.showInputDialog("Enter new Usertype");
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1, password);
		stmt.setString(2, usertype);
		stmt.setString(3, username);
		int rowsAffected=stmt.executeUpdate();
		System.out.println(rowsAffected+" rows affected!");
		stmt.close();
		con.close();
	}
}
