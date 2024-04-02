package mavenExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcExample {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/codemind?useSSL=false";
        String user="root";
        String pass="system";
        String sql="Select * from student where rollno=1";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, user, pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		con.close();
	}

}
