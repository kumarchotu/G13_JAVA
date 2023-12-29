package learningandpraticingjava;
import java.util.Scanner;


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");  
		
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();  
		//calling the method   
		double res=squareRoot(n);
		System.out.println("The square root of "+ n+ " is: "+res); 
		if(res*res==n)
		{
			System.out.println("Given number is a perfect number");
		}
		else
		{
			System.out.println("Given number is not a perfect number");
		}
		}  
	    
		//method  
		public static double squareRoot(int num)   
		{  
		//taking a new variable  
		
		double t;  
		double sqrtroot=num/2; //for ex-->9/2=4
		do   
		{  
		t=sqrtroot;  //t=4
		sqrtroot=(t+(num/t))/2;  //(4+(9/4))/2-->3 --->sq=3
		                         //(3+(9/3))/2-->3 ---->sq=3
		}   
		while((t-sqrtroot)!= 0);  //4-3=1-->true
		                          //3-3=0-->false
		return sqrtroot; 
		
		}  
		}  
