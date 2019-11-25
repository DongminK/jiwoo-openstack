package api.conn;

public class Connection {

	public static void main(String[] args) {
		
		// Auth
		String url = "http://192.168.119.31:5000/v3/auth/tokens?nocatalog";
		
		AuthInfo authInfo = new AuthInfo();
		authInfo.setDomain("Default");
		authInfo.setUser("admin");
		authInfo.setPassword("insoft00");
		authInfo.setProjectDomain("Default");
		authInfo.setProject("admin");
		
		System.out.println(authInfo.toJson());
		
		RestClient restClient = new RestClient();
		restClient.post(url, authInfo.toJson());
		
		
		// List Flavor
		String flavorUrl = "http://192.168.119.31:8774/v2.1/flavors";
		restClient.get(flavorUrl);

		// List Image
		String imageUrl = "http://192.168.119.31:8774/v2.1/0e52a7080ac2417fb2df0b1d52e962fd/images";
		restClient.get(imageUrl);

		// List Server
		String serverUrl = "http://192.168.119.31:8774/v2.1/0e52a7080ac2417fb2df0b1d52e962fd/servers";
		restClient.get(serverUrl);
		
		// Compute Version
		String computeVer = "http://192.168.119.31:8774";
		restClient.get(computeVer);
		
	}
	
	
}
