package chapter01;

public class Logical {

	public static void main(String[] args) {

		int a = 7;
		int b = 3;
		
		System.out.println( a == b || a > b ); //or
		System.out.println( a == b && a > b ); //and
		
		System.out.println( a != b || a > b ); 
		System.out.println( a != b && a > b );
		
		System.out.println( !(a > b  ) ); //
		System.out.println( (a > b) == false );
		
	}

}
