package superkeyword;

class Child extends Parent
{
	String color="White";
	public void show(){
		System.out.print(color);
		System.out.println("child class method");
		System.out.println(super.color);
		super.show();
	}
	public Child(String s)
	{
		super("nilu");
		System.out.println("child class constructor");
	}

public static void main(String[] args) {
		
Child c=new Child("ethu");
c.show();
	}

}
