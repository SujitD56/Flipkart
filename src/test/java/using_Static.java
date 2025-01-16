
public class using_Static {
	
	
//	//using static with variables 
	int id;
    String name;
   static String college="Bec";
   
//   //constructor
   public using_Static(int i,String n ) {
	   id=i;
	   name=n;
   }
//
//	public static void main(String[] args) {
//		//creating object of class and the constructor is called when object is created
//		using_Static keyword_static=new using_Static(5,"naveen");
//		
//		//there is need to use object if we want to print global variables of instance variables in main method
//		System.out.println(keyword_static.id);
//		System.out.println(keyword_static.name);
//		
//		//there is no need to use object if we want to print static variable in main method because it is not belongs to object,
//		//it is belongs to class
//		//it gets memory once at the class loading 
//		System.out.println(college);
//		
//	}
	
	
	
	
//	//using static with methods
//	public static void method() {
//		System.err.println("hello everyone using static");
//	}
//	
//	public void method1() {
//		System.out.println("hello everyone without using static");
//	}
//	
//	public static void main(String[] args) {
//		
//		//no need to create object while calling method that is mentioned with static keyword
//				method();
//				
//		//object of class
//		using_Static keyword_static=new using_Static();
//		//need to create object while calling method that is not mentioned with static keyword
//		keyword_static.method1();
//		
//	}
	
	
	
	
	
//	we can't override the static method because static is a part of class rather than object
	
	
	public static void get() {
		System.out.println("naveen");
	}
	
	

}
