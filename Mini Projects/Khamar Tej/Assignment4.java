package suretrust_java;

class family{
	void  show() {
		System.out.println("This is a family class");
	}
}
class mother extends family{
	@Override
	void show() {
		System.out.println("This is a mother class");
	}
}
class father extends family{
	@Override
	void show() {
	System.out.println("This is a father class");	
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		family obj1=new family();
		mother obj2=new mother();
		father obj3=new father();
		
		obj1.show();
		obj2.show();
		obj3.show();
	}

}
