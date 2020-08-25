package interfaces;

public class MyConnFactory {

	public static MyConnection getConnObj(String dbType) {
		
		if(dbType.equalsIgnoreCase("oracle")) {
			return new OracleDB();
		}else if(dbType.equalsIgnoreCase("mysql")) {
			return new MySqlDB();
		}else {
			throw new RuntimeException("Not Yet implemented");
		}
	}
}
