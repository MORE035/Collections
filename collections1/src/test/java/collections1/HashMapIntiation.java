package collections1;

import java.util.HashMap;

public class HashMapIntiation {

	 public static void main(String[] args)
	    {				
	        // Create an empty hash map by declaring object
	        // of string and integer type
	        HashMap<String, Integer> map = new HashMap<>();
	 
	        // Adding elements to the Map
	        // using standard add() method
	        map.put("vishal", 10);
	        map.put("sachin", 30);		
	        map.put("vaibhav", 20);
	        
	        if(map.containsKey("vaibhav")) {
	        	
	        	System.out.println(map.get("vaibhav"));
	        }
//------------------------------------------------------------------------------------------------------
//-------------Add One HashMap Elements to another HashMap----------------------------------------------
	        
	    HashMap<String, Integer> map2=new HashMap<>(map);
	    System.out.println(map2);
	    map2.put("Randy", 22);
	    System.out.println(map2);

	    
	    }
}