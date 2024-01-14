package suretrust;

//Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// First subclass (Single Inheritance)
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

// Second subclass (Single Inheritance)
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}

// Third subclass (Multiple Inheritance)
interface Swimmer {
    void swim();
}

// Fourth subclass (Hybrid Inheritance)
class Dolphin extends Mammal implements Swimmer {
    void speak() {
        System.out.println("Dolphin is speaking");
    }

    // Implementing the swim method from the Swimmer interface
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}

// Main class
public class Hybrid_inheritance {
    public static void main(String[] args) {
        // Creating an object of the Dolphin class
        Dolphin dolphin = new Dolphin();

        // Calling methods from different classes/interfaces
        dolphin.eat(); // Animal method
        dolphin.breathe(); // Mammal method
        dolphin.swim(); // Swimmer interface method
        dolphin.speak(); // Dolphin method
    }
}
