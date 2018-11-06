package chapter01;

public class TypeCast1 {

	public static void main(String[] args) {
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;
		
		byte b1 = (byte)265; //256을 int로 알아버려서 byte로 암시적 표기해줘야함.
		
		System.out.println(b1);
		
		
	}

}
