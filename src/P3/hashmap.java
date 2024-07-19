package P3;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {
	
	public static void testhashmap()
	{
		HashMap<String, String> cust = new HashMap<String, String>(); 
		
		cust.put("2222", "3838-2333-3333");
		cust.put("3333", "8888-3333-2222");
		
		for(Entry<String, String> aaa : cust.entrySet())
		{
			System.out.println(aaa.getKey()+"---"+aaa.getValue());
		}
		
		System.out.println(cust.get("3333") );
		
	}
	
	

	public static void main(String[] args) {
		testhashmap();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
