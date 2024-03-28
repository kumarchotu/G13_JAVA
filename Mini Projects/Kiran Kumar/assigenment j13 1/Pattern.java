package sure.trust;

import java.util.Scanner;

public class Pattern {
	public static boolean Even(int number) {
		return number%2==0;
	}
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for(int i=1;i <=x;i++)
	{
	 if(Even(i)) {
		 System.out.println(i+"  even nuber");
	 }
	 else
	 {
		 System.out.println(i+"  odd number");
	 }
	}
	 System.out.println();
	 sc.close();
	}
	

	
}
