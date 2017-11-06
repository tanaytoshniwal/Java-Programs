import java.sql.Connection;
import java.sql.DriverManager;

public class DBInfo2 {
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection con=null;
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject","root","tanay1998");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
