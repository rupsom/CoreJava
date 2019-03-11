import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectMSSQLServer {

	
	public void dbConnect(String dburl) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(dburl);
		System.out.println("connected");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		ConnectMSSQLServer connServer = new ConnectMSSQLServer();
		connServer.dbConnect("jdbc:sqlserver://dcsqldev01;instanceName=SQLEXPRESS;databaseName=OP_UAT;integratedSecurity=true");
		
	}

}
