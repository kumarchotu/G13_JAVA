package assign2HybridInheritance;


	class Animal {
		 void eat() {
		     System.out.println("Animal is eating");
		 }
		}

		//Multiple Inheritance using interfaces
		interface Swimmer {
		 void swim();
		}

		interface Jumper {
		 void jump();
		}

		//Hybrid Inheritance
		class Frog extends Animal implements Swimmer, Jumper {
		 @Override
		 void eat() {
		     System.out.println("Man is Walking");
		 }

		 @Override
		 public void swim() {
		     System.out.println("Man is swimming");
		 }

		 @Override
		 public void jump() {
		     System.out.println("Man is Flying");
		 }
	}

		public class HybridInheritance {
		    public static void main(String[] args) {
		        Man man = new man();

		        // Calling methods
		        man.eat();   // Output: Man is Walking
		        man.swim();  // Output: Man is swimming
		        man.jump();  // Output: man is Flying
		    }
	}




