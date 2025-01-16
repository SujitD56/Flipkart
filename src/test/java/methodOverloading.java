//method overloadin means method names are same but taking parameters are different like int, string, float
public class methodOverloading {
      
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(15,25));
		System.out.println(add(15,25,15));

	}

}
