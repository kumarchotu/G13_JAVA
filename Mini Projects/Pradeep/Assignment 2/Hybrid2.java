package suretrust;
//super class
class A {
 int a=1;
}
//sub class
class B extends A {
 int b=2;
}
class E extends A{
	int e=5;
}
//class
class C extends B{
 int c=3;
 int sum = a + b + c;
 public void display() {
     System.out.println("The value of a is " + a);
     System.out.println("The value of b is " + b);
     System.out.println("The value of c is " + c);
     System.out.println("The sum of a, b and c is " + sum);
 }
}
class D extends E {
 int d=4;
 int sum = a + e + d;
 public void display() {
     System.out.println("The value of a is " + a);
     System.out.println("The value of e is " + e);
     System.out.println("The value of d is " + d);
     System.out.println("The sum of a, d and e is " + sum);
 }
}

public class Hybrid2 {
	public static void main(String[] args) {
     C CObj = new C();
     CObj.display();
     
     System.out.println();
     
     D Dobj = new D();
     Dobj.display();
	}
}

