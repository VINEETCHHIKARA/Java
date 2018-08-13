package oops;

abstract class Writer{
	public void write(String s){
		System.out.println(s);
	}
}
class Pen extends Writer{
	
}
public class OverLoading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Hello world!!!");
		Pen p=new Pen();
		p.write(s);
		
	}

}
