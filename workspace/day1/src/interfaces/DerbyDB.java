package interfaces;

public class DerbyDB implements MyConnection{

	@Override
	public String getConnectionStatus() {
		
		return "Connection Success";
	}

	@Override
	public String getDatabaseDetails() {
		
		return "Oracle 11g Database";
	}

	@Override
	public String getVendorAppVersion() {
		// TODO Auto-generated method stub
		return "Derby DB major 6.0 minor 2.0";
	}
}
