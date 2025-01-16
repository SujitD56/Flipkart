
public class using_this_keyword  extends using_Static{
	
	
	
public using_this_keyword(int i, String n) {
		super(i, n);
		// TODO Auto-generated constructor stub
	}
int id;
String name;



public static void main(String [] arg)  {
	using_this_keyword e=new using_this_keyword(2, "naveen");
	
	
	
}
//             //constructor to initialize instance variables without using this keyword
//           using_this_keyword(int id,String name){
//	         id=id;
//	        name=name;
//
//          }
//
//	         public static void main(String[] args) {
//		         //object of class using_this_keyword
//		         using_this_keyword object=new using_this_keyword(55,"naveen");
//		          System.out.println(object.id + object.name);
//		        //output is 0 and null because of ambiguity between instance variables and formal arguments 
//            	}


//In the above example, parameters (formal arguments) and instance variables are same. 
//So, we are using this keyword to distinguish local variable and instance variable.

   public static void get() {
	  System.out.println("bhogam");
	  
   }

   
   
   
//          //constructor to intialize instance variable with this keyword
//          using_this_keyword(int id,String name){
//           this.id=id;
//           this.name=name;
//          }
//          
//          public static void main(String[] args) {
//        	//object of class using_this_keyword
//		         using_this_keyword object=new using_this_keyword(55,"naveen");
//		          System.out.println(object.id + object.name);
//          }
}  
          
          
          
