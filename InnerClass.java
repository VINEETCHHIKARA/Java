package oops;


class Write
{
	class Pen1
	{
		void write(String s)
		{
			System.out.println(s+" Pen");
		}
	}
	
	static class Pencile
	{
		void write(String s)
		{
			System.out.println(s+" Pancile");
		}
	}
}

public class InnerClass 
{
	public static void main(String args[]) 
	{
		Write obj=new Write();
		Write.Pen1 obj1=obj.new Pen1();
		obj1.write("Welcome to");
		Write.Pencile obj2=new Write.Pencile();
		obj2.write("Welcome to");
	}

}
