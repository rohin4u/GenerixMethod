package geneinterface;

public class Animal<T extends Cat> {
	
	
	T ob;
	
	Animal(T ob){
		this.ob=ob;
	}
	public T display() {
		
		return ob;
	}

}
