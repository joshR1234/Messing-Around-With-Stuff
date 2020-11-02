import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TestJDBC {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pass="root";

		String query = "update eu_countries set newpopulation=100 where name like 'Albania'";
	
		try (Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement()) {

			int n = st.executeUpdate(query);
			if (n > 0) {
				System.out.println("update successful");
			} else {
				System.out.println("update failed");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		
		
	}

}
