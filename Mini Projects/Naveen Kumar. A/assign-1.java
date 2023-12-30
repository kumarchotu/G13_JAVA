package assign1;

public class PrimeNumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int limit = 100;
		        
		        // Printing prime numbers and calculating their sum
		        int sum = 0;
		        for (int i = 2; i <= limit; i++) {
		            if (isPrime(i)) {
		                System.out.print(i + " ");
		                sum += i;
		            }
		        }

		        System.out.println("\nSum of prime numbers up to " + limit + ": " + sum);
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
	}