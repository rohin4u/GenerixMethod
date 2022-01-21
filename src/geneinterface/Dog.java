package geneinterface;

public class Dog implements Cat{

	int i;
	
	Dog(int i){
		this.i=i;
	}
	
	public String toString() {
		return i+"";
	}
	
	
	@Override
	public void cat() {
		
		System.out.println(i);
		
	}
	
	

}
