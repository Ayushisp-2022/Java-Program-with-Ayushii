package project1;

public class Dog implements Animal {

	@Override
	public void bark() {

		System.out.println("Dog is Barking");
	}

	public static void main(String args[]) {
		Dog myDog = new Dog();
		myDog.bark();
	}
}
