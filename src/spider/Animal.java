package spider;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	
	//case 1
	
//	public <T> void m1(ArrayList<T> l) {
//		
//		System.out.println(l);
//	}
	
	//case 2
//	public <T> ArrayList<T> m1(ArrayList<T> l) {
//		
//		return l;
//	}
	
	//case 3
	public <T> T m1(ArrayList<T> l) {
			
		T t = l.get(1);
		
		return t;
	}

}
