package suretrust_java;

public class Assignment6 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("trying to access an element outside the arraybounds");
            int number = numbers[5]; //ArrayIndexOutOfBoundsException will occur here
            System.out.println("This is try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("this is catch block , will handle the exception");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

