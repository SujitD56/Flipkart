
public class School {
	

		  // private field
		  private int age;

		  // getter method
		  public int getAge() {
		    return age;
		  }

		  // setter method
		  public void setAge(int age) {
		    this.age = age;
		  }
		}

		class Main {
		  public static void main(String[] args) {

		    // create an object of Person
		    School p1 = new School();

		    // change age using setter
		    p1.setAge(24);

		    // access age using getter
		    System.out.println("My age is " + p1.getAge());
		  }
		}
	
