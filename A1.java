//abstraction ex of animal
package NEW;
public class A1{
	public static void main(String[]args) {
		Animal ab = new Dog();
		ab.sound();
		ab.eat();
	}
}
abstract class Animal{
	abstract void sound();
	void eat() {
		System.out.println("this animal eats food");
		
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}