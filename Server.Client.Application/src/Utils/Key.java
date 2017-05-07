package Utils;

public class Key {

	int id;
	String key;
	String value;
	
	public Key(String key, String value){
		IDGenerator random = new IDGenerator();
		this.id = random.setId();
		this.key = key;
		this.value = value;
		getKey(id, key, value);
		
		
		
	}
	
	public String getKey(int id, String key, String value){
		String keyFinal = null;
		String temp;
		
		temp = String.valueOf(id);
		
		keyFinal = temp +":" + key +":"+ value;
		
		return keyFinal;
	}
	
	public int getId(){
		return this.id;
	}
	public String getKey3(){
		return this.key;
	}
	public String getValue(){
		return this.value;
	}
	
	public String getKey2(Key lol){
		String keyFinal = null;
		String temp;
		String temp2;
		String temp3;
		temp = String.valueOf(lol.getId());
		temp2 = lol.getKey3();
		temp3 = lol.getValue();
		keyFinal = temp +":" + temp2 +":"+ temp3;
		System.out.println("They key is: " + keyFinal);
		return keyFinal;
	}
	
}
