package program;

import java.util.*;

class RetriveArr 
{
	public static void main(String[] args) 
	{
                                               // Create a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();

		list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
                                        // Print the list
        System.out.println(list_Strings);
                                             // Retrive the first and third element
        String element = list_Strings.get(0);

        System.out.println("First element: "+element);

        element = list_Strings.get(2);

        System.out.println("Third element: "+element);
}
}