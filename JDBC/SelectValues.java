import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SelectValues {
	public static void main(String[] args) throws SQLException{
		Connection con=DBInfo2.getConnection();
		String query="SELECT * FROM login";
		
		PreparedStatement stmt=con.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		
		// getting meta data
		System.out.println("Getting Meta Data\n---------------------------------------");
		ResultSetMetaData rsmd=rs.getMetaData();
		int count=rsmd.getColumnCount();
		System.out.println("Column count : "+count);
		for(int i=1;i<=count;i++){
			
		}
	}
}
