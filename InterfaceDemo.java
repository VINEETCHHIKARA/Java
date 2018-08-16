package oops;

interface ABC
{
	public abstract void write();
}

interface BCD
{
	
}
class Pen implements ABC,BCD
{
	public void write()
	{
		System.out.println("i'm pen");
	}
}
class Pencil implements ABC
{
	public void write()
	{
		System.out.println("i'm pencil");
	}
}
class Kit
{
	public void doSomething(ABC r) {
		r.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Kit k=new Kit();
		ABC obj=new Pen();
		ABC obj1=new Pencil();
		k.doSomething(obj);
		k.doSomething(obj1);
	}

}
