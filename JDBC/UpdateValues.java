import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateValues {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Connection con=DBInfo2.getConnection();
		String query="UPDATE login SET password = ? WHERE username = ?";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Usernme:\t");
		String username=sc.nextLine();
		System.out.print("Enter new Password:\t");
		String password=sc.nextLine();
		sc.close();
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1, password);
		stmt.setString(2, username);
		int rowsAffected=stmt.executeUpdate();
		System.out.println(rowsAffected+" rows affected!");
		stmt.close();
		con.close();
	}
}
