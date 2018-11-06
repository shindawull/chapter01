package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//implicity(암시적) tpe casting
		int i = 10;
		long l = i;
		
		//explicity(명시적) tpe casting
		long l2 = 9123456789L;
		int i2 = (int)l2; //크기가 안맞아서 짤릴 수 있으니 앞에 int로 변환.

		System.out.println( i + ":" + l);
		System.out.println( i2 + ":" + l2);
		
	}

}
