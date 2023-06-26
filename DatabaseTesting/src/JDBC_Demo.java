import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");  // default driver to connect with sql.
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/swethadb", "root","rootpassword");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t | "+rs.getString(2));
		}
		
		con.close();
		
		
	
		

	}

}
