package assign1;

public class Evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvennumbers();
		

	}

	private static void printEvennumbers() {
		// TODO Auto-generated method stub
		
		
		int i=1;
		System.out.println("Even numbers between 1 to 100 in increasing order: ");
		//iteration of numbers from 1 to 100
		for (i=1 ; i<=100; i++)
		{
			//conditional statement to check if the number is even
			if(i%2 == 0) 
			{
				System.out.println(i + "  ");
			}
		}
		}
	
}
