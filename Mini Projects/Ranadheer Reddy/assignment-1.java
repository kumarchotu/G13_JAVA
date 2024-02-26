package assignmentSureTrust;
import java.util.Scanner;
public class assig1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();

		        String convertedString = convertVowelsToUppercase(inputString);

		        System.out.println("Converted string: " + convertedString);

		        scanner.close();
		    }

		    private static String convertVowelsToUppercase(String input) {
		        StringBuilder result = new StringBuilder();

		        for (int i = 0; i < input.length(); i++) {
		            char currentChar = input.charAt(i);

		            if (isVowel(currentChar) && Character.isLowerCase(currentChar)) {
		                result.append(Character.toUpperCase(currentChar));
		            } else {
		                result.append(currentChar);
		            }
		        }

		        return result.toString();
		    }

		    private static boolean isVowel(char c) {
		        return "aeiouAEIOU".indexOf(c) != -1;
		    }
	

	}
