//parent class
public class inheritance {
	public void method() {
		System.out.println("hello everyone i'm in parent class");
	}
	
}

//subclass 

 class subclass extends inheritance{
	public void method1() {
		System.out.println("hello everyone i'm in subclass");
	}
	
	//subclass extends parent class it means subclass take all the methods, variables from parent class creating only subclass object 
	// there is no need to create parent class object. Only subclass object is needed to call methods from parent class as well as subclass 
	//this is the advantage of inheritance it reduces time and reusability of code
	public static void main(String[] args) {
		subclass object = new subclass();
		object.method();
		object.method1();
	}
}




