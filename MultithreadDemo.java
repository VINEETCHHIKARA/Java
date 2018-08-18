package oops;
class Hi extends Thread
{
	public void run()
	{
		for(int j = 0;j<5;j++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultithreadDemo {

	public static void main(String[] args) {
		Hi hi=new Hi();
		Hello hello=new Hello();
		
		hi.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hello.start();
		
		
		
		
	}

}
