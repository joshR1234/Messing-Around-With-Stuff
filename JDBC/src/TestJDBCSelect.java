import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestJDBCSelect {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pass="root";
			
		String query = "select * from country limit 10";
	
		try (Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			while (rs.next()) {
				String name = rs.getString(1);
				System.out.println(name + "\t\t");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		
		
	}

}
