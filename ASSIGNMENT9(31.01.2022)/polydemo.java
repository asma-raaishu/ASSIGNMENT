package program;

class poly
{
	void show()
	{
	System.out.println("Java programming language");
	}
	
}
public class polydemo extends poly
{
	void show()     //override method--->run time compiling
	{
		System.out.println("Common English language");
	}

	public static void main(String[] args)
	
	{
		polydemo obj=new polydemo();
		poly po=new poly();
		obj.show();
		po.show();
		
		
	 

	}
}


