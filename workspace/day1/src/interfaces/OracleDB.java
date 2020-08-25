package interfaces;

public class OracleDB implements MyConnection{

	@Override
	public String getConnectionStatus() {
		
		return "Connection Success";
	}

	@Override
	public String getDatabaseDetails() {
		
		return "Oracle 11g Database";
	}

}
