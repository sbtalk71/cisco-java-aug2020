package interfaces;

public class MySqlDB implements MyConnection{

	@Override
	public String getConnectionStatus() {
		
		return "Connection Success";
	}

	@Override
	public String getDatabaseDetails() {
		
		return "MySQL 8.0.1 Database";
	}

}
