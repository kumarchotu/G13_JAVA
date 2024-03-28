package assign.java;

public class Assign_1 {
	
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		
		int fact =1;
		for(int i=1;i<=n;i++)
			fact = fact*i;        
		return fact;
		
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact(5));

	}

}
