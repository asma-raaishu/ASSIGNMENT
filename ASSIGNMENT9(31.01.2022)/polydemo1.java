package program;

class polymorph
{
	void show()
	{
		System.out.println("@@@@@");
	}
}
public class polydemo1 extends polymorph
{
	void show(int m)             //method overload----->compile time
	{
		System.out.println("#########");
	}

	public static void main(String[] args)
	{
		polydemo1 p1=new polydemo1();
		p1.show();
		p1.show(2);
		
	}

}
