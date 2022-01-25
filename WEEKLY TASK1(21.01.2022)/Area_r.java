import java.util.*;

class Area_r{
	int length;
	int breath;
	public Area_r(int l,int b) 
	{
		length=l;
		breath=b;
	}
	public int getArea()
	{
		return length*breath;
	}


	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int l,b;
		System.out.println("Enter length");
		l = s.nextInt();
		System.out.println("Enter breath");
		b=s.nextInt();
	    Area_r a=new Area_r(l,b);
		System.out.println("Area of the rectangle = "+a.getArea());
	

	}

}
