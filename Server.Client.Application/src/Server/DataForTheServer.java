package Server;

import java.util.HashMap;
import java.util.Map;

public class DataForTheServer {
	private Map<String,String> KEY;
	
	
	public DataForTheServer() {
		KEY= new HashMap<String, String>();
		
	}
	
	public Map<String,String> getTheKEY(){
		return KEY;
	}
}
