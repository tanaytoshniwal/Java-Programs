import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteValues {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Connection con=DBInfo1.con;
				
		//query generation
		String query="DELETE FROM login WHERE username = ?";
		//input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Username:\t");
		String username=sc.nextLine();
		
		//statement preparation
		PreparedStatement pStmt=con.prepareStatement(query);
		pStmt.setString(1, username);
		
		//execution
		int rowsAffected=pStmt.executeUpdate();
		
		System.out.println(rowsAffected+" rows affected!");
		
		pStmt.close();
		sc.close();
		con.close();
	}
}
