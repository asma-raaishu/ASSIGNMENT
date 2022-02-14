package program;
import java.util.*;

class Itrhash 
{
	public static void main(String[] args) 
	{         //creating empty HashSet
		HashSet<String> h = new HashSet<String>();
		      //adding elements into HashSet using add() method
		h.add("butterscotch");
		h.add("vennila");
		h.add("choco");
		h.add("blackcurrent");
		h.add("strawberry");
		     //iterating over HashSet------>using Iterator
		Iterator<String> i=h.iterator();
		          //hold true till last elements in the set
		while(i.hasNext())
		{
			System.out.println("Ice Cream flavors = "+i.next());
			
		}
	

	}

}
