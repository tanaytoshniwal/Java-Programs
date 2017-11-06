import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValues {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//use 1
		
		/*//loading the driver
		Class.forName("com.mysql.jdbc.Driver");
		//making a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "root");
		*/
		
		//use 2
		/*
		Connection con=DBInfo1.con;
		*/
		
		//use 3
		Connection con=DBInfo2.getConnection();
		
		//query generation
		String query="INSERT INTO login(username,password,usertype) VALUES(?,?,?)";
		//input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Username:\t");
		String username=sc.nextLine();
		System.out.print("Enter Password:\t");
		String password=sc.nextLine();
		System.out.print("Enter UserType:\t");
		String usertype=sc.nextLine();
		
		//statement preparation
		PreparedStatement pStmt=con.prepareStatement(query);
		pStmt.setString(1, username);
		pStmt.setString(2, password);
		pStmt.setString(3, usertype);
		
		//execution
		int rowsAffected=pStmt.executeUpdate();
		
		System.out.println(rowsAffected+" rows affected!");
		
		pStmt.close();
		sc.close();
		con.close();
	}
}
