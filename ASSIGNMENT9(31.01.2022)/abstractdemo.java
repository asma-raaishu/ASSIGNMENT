package program;

abstract class animals
{
	public abstract void sound();
 	
}
class dog extends animals
{
	public void sound()
	{
		System.out.println("FIRST");
	}
}
class cat extends animals
{
	public void sound()
	{
		System.out.println("SECOND");
		
	}
}
class rabbit extends animals
{
	public void sound()
	{
		System.out.println("THIRD");
	}
}
class abstractdemo
{
	public static void main(String args[])
	{
		dog a=new dog();
		cat b=new cat();
		rabbit c=new rabbit();
	
		a.sound();
		c.sound();
		b.sound();
		a.sound();
		c.sound();
		c.sound();
	}

}
