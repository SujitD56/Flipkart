
public class constructor {
	//creating constructor
	public constructor() {
		System.out.println("hello everyone with constructor");	
	}
	
	
	//creating method
			public void method() {
				System.out.println("hello everyone with method");
			}
			
 public static void main(String[] args) {
	// when object is created once the constructor is called therefor there is no need to call the constructor
	 constructor object=new constructor(); 
	 
	 //there is a need to call the method if we want to call the method
	 object.method();
	 
 }
}
