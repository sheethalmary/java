package inheritance;
public class Car extends Vehicle
{
	String name="BMW";
	public void milage()
	{
		System.out.println("milage");
	}

	public static void main (String[] args) {
	 Car obj=new Car();
	 obj.speed();
	 obj.milage();
	 System.out.println( obj.name);
	 System.out.println(obj.noofvehicle);
	 

	}

}




		

	


