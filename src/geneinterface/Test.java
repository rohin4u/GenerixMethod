package geneinterface;

public class Test {

	public static void main(String[] args) {
		
		
		Cat c = new Dog(10);
		
		Animal<Cat> a = new Animal<>(c);
		Cat c1 = a.display();
		c1.cat();
		
		Dog d = new Dog(1000);
		Animal<Dog> a1 = new Animal<>(d);
		Dog dog = a1.display();
		dog.cat();
		System.out.println(dog);
				
		

	}

}
