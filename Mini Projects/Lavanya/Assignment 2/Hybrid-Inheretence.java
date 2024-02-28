package suretrust;
class Management
{
	public void m()
	{
		
		System.out.print("\n Collect acedimic fees from student");
	}
}
class ECEDept extends Management
{
	public void e()
	{
		System.out.print("\n pay all penending dues and pay extra amount for the project to provide IOT kit");
	}
}
class CSEDept extends Management
{
	public void c()
	{
		System.out.print(" \n pay all penending dues and pay extra amount for trip");
	}
	
}
class student extends ECEDept
{
	public void s()
	{
	System.out.print("\n I have to pay all these amount");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    student p=new student();
    p.m();
    p.e();
    p.s();
	}

}


//OUTPUT
/* Collect acedimic fees from student
 pay all penending dues and pay extra amount for the project to provide IOT kit
 I have to pay all these amount*/