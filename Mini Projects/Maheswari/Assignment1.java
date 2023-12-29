/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

    
    public class Main {
	public static int fun(int n,int sum)
	{
	    int r=0;
	   while(n>0)
	   {
	   r=n%10;
	  sum=sum*10+r;
	  n=n/10;
	   }
	   return sum;	  
	 }
    
	public static void main(String args[])
	{ 
	  int n=3443;
	  int sum=0;
	 System.out.println("Reverse of "+n+" is "+fun(n,sum));
	 if(fun(n,sum)==n)
		 System.out.println("palindrome");
	  	  else
	  		System.out.println("not palindrome");
	  
	}
	}
	