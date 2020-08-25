package interfaces;

public class MainApp {

	public static void main(String[] args) {
		MyConnection con=MyConnFactory.getConnObj("mysql");
		
		System.out.println(MyConnection.app_version);
		System.out.println(con.getDatabaseDetails());
		System.out.println(con.getConnectionStatus());
		System.out.println(con.getVendorAppVersion());
	}
}
