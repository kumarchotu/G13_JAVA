package sai;
import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci sequence elements to generate: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive integer for the count.");
        } else {
            System.out.println("Fibonacci sequence up to " + count + " elements:");
            printFibonacciSequence(count);
        }
        
    }

    private static void printFibonacciSequence(int count) {
        int first = 0, second = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}