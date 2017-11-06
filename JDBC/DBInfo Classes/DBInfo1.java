import java.sql.Connection;
import java.sql.DriverManager;

public class DBInfo1 {
	static Connection con;
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject","root","root");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
