package Logic1Core;

public class staticLogic {
	static int y = 20;
	int z;
	static {
		System.out.println("static block " + y);
		int x; // 
//		 System.out.println(x); // The local variable x may not have been initialized

	}
	public static void main(String args[]) {
		staticLogic sl = null;
//		System.out.println(x); //x cannot be resolved to a variable
//		System.out.println("main method  " + sl.y + " ," + sl.z); //java.lang.NullPointerException
		System.out.println("main method  " + sl.y );
		System.out.println("main method  " + y );

	}// main
}// class
