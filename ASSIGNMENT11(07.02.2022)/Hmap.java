package program;

import java.util.*;

class Hmap {
	
	public static void main(String[] args)
    {
                                           // Creating an empty HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
  
                                          // Mapping integer values to string keys
        hm.put("Geeks", 10);
        hm.put("4", 15);
        hm.put("Geeks", 20);
        hm.put("Welcomes", 25);
        hm.put("You", 30);
                                         // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hm);
  
                                         // Displaying the size of the map
        System.out.println("The size of the map is " + hm.size());
    }
}