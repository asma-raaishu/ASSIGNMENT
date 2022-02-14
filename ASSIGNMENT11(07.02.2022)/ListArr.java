package program;

import java.util.ArrayList;

class ListArr 
{
	public static void main(String[] args) 
	{	
	                              //creating empty list 
	ArrayList<String> list =new ArrayList<String>();
	                              //adding element in list
	list.add("black");
	list.add("white");
	list.add("red");
	list.add("blue");
	list.add("pink");
	System.out.println("favorite colors list : "+list);
	                            //creating array of string type
	String[] myArray=new String[list.size()];
	                            //converting list to array using toArray()method
	list.toArray(myArray);
	
	/*for(String item:myArray) 
	{
		System.out.print(item+" ");
	}*/	
	
	for(int i=0;i<myArray.length;i++)
	{
		System.out.println("Colors index  "+i+" is : "+myArray[i]);
	}
	for(String item:myArray) 
	{
		System.out.print(item+" ");
	}
	
	}

}
