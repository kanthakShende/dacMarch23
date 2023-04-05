import java.util.*;
class Demo
{
	Demo()
	{
		this(4.5);	
		System.out.println("from Demo()");
	}
	
	Demo(int i)
	{
		System.out.println("from Demo(int i)");
	}
	
	Demo(double b)
	{
		this(10);
		System.out.println("from Demo(double b)");
	}
	
	public static void main(String [ ]args)
	{
	Demo obj3 = new Demo(1.2);
        }
}