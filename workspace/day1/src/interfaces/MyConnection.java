package interfaces;

public interface MyConnection {

	public float app_version=1.0f;
	public String getConnectionStatus();
	public String getDatabaseDetails();
	default String getVendorAppVersion() {
		return "not yet implemented";
	};
}
