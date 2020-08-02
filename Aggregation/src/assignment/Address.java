package assignment;

public class Address {
	public void add()
	{
		Student ob=new Student();
		String name=ob.profile("Deepa Jolly");
		int rollno=ob.profile(13);
		int houseno=464;
		String address="Paliyath house, kulathoor, T.V.M";
		System.out.println("House no : "+houseno);
		System.out.println("Adress is: "+address);
		
	}
	public static void main(String args[])
	{
		Address ob1=new Address();
		ob1.add();
	}
}
