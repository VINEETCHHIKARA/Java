package oops;

class A
{
	public void show()
	{
		System.out.println("In Show Method.");
	}
}
public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A()
				{
					public void show()
					{
						System.out.println("In The Main Method.");
					}
				};
		obj.show();
	}

}
