class Semester1
{
	int mark1=91, mark2=90;
	void show()
	{
		System.out.println("Semester1 : "+(mark1+mark2)/2);
	}
}	
	class Semester2 extends Semester1
	{
		int mark1=88, mark2=80;
		void print()
		{
			System.out.println("Semster2 : "+(mark1+mark2)/2);
		}
	}
	
	class Semester3 extends Semester2
	{
		int mark1=81, mark2=75;
		void disp()
		{
			System.out.println("Semester3 : "+(mark1+mark2)/2);
		}
		
}
public class Average extends Semester3 {

	public static void main(String[] args) 
	{
		Average A=new Average();
		A.show();
		A.print();
		A.disp();
		
	

	}

}
