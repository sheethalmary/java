package inheritance;
public class Tester extends Employee {
	String name="lekshmi";
	public void display1()
	{
		System.out.println("name" +name);
	}

	public static void main(String[] args)
	{
		 Tester test=new Tester();
		 test.display1();

		 test.details();
	}

}


	