

package project1;

public interface Animal {

	void bark();

}

class Dog implements Animal {

	@Override
	public void bark() {

		System.out.println("Dog is Barking");
	}
}
	public class Main {
 
	public static void main(String args[]) {
		Dog dog = new Dog();
		dog.bark();
	}
}

