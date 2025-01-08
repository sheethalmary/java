package aggregation;

public class Student {
	String name;
	int rollno;
	Address add;
	public  Student(String name,int rollno,Address add)
	
	{
		this.name=name;
		this.rollno=rollno;
		this.add=add;
	}
	public void display()
	{
		System.out.println("name "+name);
		System.out.println("rollno"+rollno);
		System.out.println("housename"+add.housename);
		System.out.println("houseno" +add.housenumber);
		System.out.println("pincode"+add.pincode);
		System.out.println("city"+add.city);
	}
public static void main(String[] args) {
	    Address obj=new Address("alunkal","kochi",682008,101);
		Student obj1=new Student("ethelwin",10,obj);
		obj1.display();
}
	
}
