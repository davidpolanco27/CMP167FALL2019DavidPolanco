package week6;

public class Animal {
	
public int numLegs=0;
private int age=0;


public void bark() {
	System.out.println("hau hau");
}
public void run() {
		System.out.println("Do not walk, Run!!");
}
public static void main(String[] args) {
	Animal A = new Animal();
	A.bark();
	A.run();
	int a=A.numLegs;
	int b=A.age;
	
}
}
