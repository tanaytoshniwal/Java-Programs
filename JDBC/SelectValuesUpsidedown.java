import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SelectValuesUpsidedown {
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
			System.out.println(rsmd.getColumnName(i)+":::"+rsmd.getColumnDisplaySize(i)+":::"+rsmd.getColumnTypeName(i));
		}
		System.out.println("---------------------------------------\nGetting Records Data\n---------------------------------------");
		
		// getting records data
		rs.afterLast();
		while(rs.previous()){
			System.out.println(rs.getInt(1)+":::"+rs.getString(2)+":::"+rs.getString(3)+":::"+rs.getString(4));
		}
		rs.close();
		con.close();
		stmt.close();
	}
}