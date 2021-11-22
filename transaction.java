package atmnew;


import java.util.ArrayList;
import java.util.HashMap;

public class transaction {
	
	static ArrayList <String>log = new ArrayList<>();
	
	private String id ="";
	private String cash = "";
	
	
	public transaction()
	{
		
	}
	


	public void add(String string) {
		// TODO Auto-generated method stub
		log.add(string);
	}

	public String get(int idx) {
		// TODO Auto-generated method stub
		return log.get(idx);
	}

	public int size() {
		// TODO Auto-generated method stub
		return log.size();
		
	}
}


