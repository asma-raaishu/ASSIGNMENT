package collection;
import java.util.*;

public class Dorder
{
	public static void main(String args[])
	{                                 //creating arrayList to be sorted in descending order
		ArrayList<Integer> des= new ArrayList<Integer>();
		                    //add the items in the ArrayList
		des.add(10);
		des.add(20);
		des.add(40);
		des.add(30);
		des.add(58);
		                  //print the unsorted arrayList
		System.out.println("the unsorted ArrayList :\n "+des);
		           //sorting ArrayList in descending order  && using collection.sort() method
		           //using collection.reverseOrder() as comparator
		Collections.sort(des,Collections.reverseOrder());
		
	               //print the sorted List in descending order
		System.out.println("The sorted ArrayList in Descending Order :\n "+des);
		
		
		
	}

} 