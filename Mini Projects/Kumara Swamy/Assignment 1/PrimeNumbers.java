package suretrust;

public class Prime_num {
public static void main(String[] args) {
        

        int num = 21;

        if (isPrime (num, num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num+ " is not a prime number.");
        }

   }
    public static boolean isPrime(int num,int flg) {
    
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
