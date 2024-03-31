package suretrust_java;
import java.util.*;
interface ShoppingItem {
    void displayDetails();
    void addToCart();
    void checkout();
}
class ClothingItem implements ShoppingItem {
    public void displayDetails() {
        System.out.println("This is a clothing item.");
    }
    public void addToCart() {
        System.out.println("Added clothing item to cart.");
    }
    public void checkout() {
        System.out.println("Checked out clothing item.");
    }
}
class ElectronicItem implements ShoppingItem {
    public void displayDetails() {
        System.out.println("This is an electronic item.");
    }
    public void addToCart() {
        System.out.println("Added electronic item to cart.");
    }

    public void checkout() {
        System.out.println("Checked out electronic item.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for clothing item, 2 or>2 for electronic item: ");
        int choice = scanner.nextInt();
        
        ShoppingItem item;
        
        if (choice == 1) {
            item = new ClothingItem();
        } else {
            item = new ElectronicItem();
        }

        item.displayDetails();
        item.addToCart();
        item.checkout();

        scanner.close();
    }
}