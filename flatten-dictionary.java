import java.util.*;
import java.lang.Object;
import java.io.*;


public class FlattenDictionary {
	static Map<String, String> result;
	public static void main(String[] args){
		
		Map<String, Object> dict = new HashMap<String, Object>();	
		dict.put("key1", "1");
		Map<String, Object> c = new HashMap<String, Object>();
		c.put("d", "3"); 
		c.put("e", "1");
		Map<String, Object> key2 = new HashMap<String, Object>();
		key2.put("a", "2"); 
		key2.put("b", "3"); 
		key2.put("c", c);
		dict.put("key2", key2);
		
		result =new HashMap<>();
		flattenDict(dict, result, "");
		System.out.println(result.toString());
		}
	
	private static void flattenDict(Map<String, Object> dict, Map<String, String> result, String parent_key){
		
		for(String key :dict.keySet()) {
			
			Object value = dict.get(key);
			if(value instanceof String) {
				if(parent_key != "") {
					result.put(parent_key + "." + key, (String) value);
				}
				else {
					result.put(key, (String) value);
				}
			}
			else {
				if(parent_key != "") {
					key = parent_key + "." + key;
					flattenDict((Map<String, Object>) value, result, key);
				}
				else {
					flattenDict((Map<String, Object>) value, result, key);
				}
			}
			
		}
	}
}
