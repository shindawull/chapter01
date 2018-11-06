package chapter01;

public class Relation {

	public static void main(String[] args) {

		int a = 7;
		int b = 3;
		
		System.out.println( a == b ); //같다
		System.out.println(a != b ); //같지않다
		
		System.out.println(a >= b );
		System.out.println( a <= b );
		
		boolean bool = (a == b); // 보기엔 이상하지만 문제없음 
		System.out.println( bool );
		
	}

}
