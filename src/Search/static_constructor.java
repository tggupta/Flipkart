package Search;

public class static_constructor {

	public void sample1()
	{
		System.out.println("This is the sample1 method");
	}
	
	public static_constructor(int a)
	{
		System.out.println("This is a parameterized constructor");
	}
	
	public static_constructor()
	{
		System.out.println("This is a default constructor");
	}
	
	static{
		int a=100;
		System.out.println("This is a static block "+a); 
		}
	
	public static void sample()
	{
		int a=10;
		System.out.println("This is sample static method "+ a);
	}
	
	public static void main(String[] args) {
		final int b;		
		static_constructor obj1=new static_constructor(1);
		static_constructor obj2=new static_constructor();
		static_constructor.sample();
		obj1.sample1();
		
	}
}
