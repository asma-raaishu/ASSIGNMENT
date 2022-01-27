class all{
	int a=50;
	void initial()
	{
		System.out.println("value of a=" +a);
	}
}

public class value extends all{
	int b=30;
	void fine()
	{
System.out.println("value of b="+b);
	}
	
	public static void main(String[] args) {
		value v=new value();
		v.initial();
		v.fine();

	}

}
