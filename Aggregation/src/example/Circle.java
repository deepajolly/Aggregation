package example;

public class Circle {
	double pi=3.14;
	public double area(int radius)
	{
		Operation op=new Operation();
		int s=op.square(radius);
		return(pi*s);
	}
	public static void main(String args[])
	{
		Circle c=new Circle();
		double result=c.area(5);
		System.out.println("The result is "+result);
	}
}
