package chapter01;

public class VariavbleTest {

	public static void main(String[] args) {
		//정수
		byte  b = 10;
		short s = 300;
		int   i = 45666;
		long  l = 123456789;
		
		//실수
		float f = 3.14f;  //기본값을 double로 보기 때문에 f를 붙인다.
		double d = 3.14;
		
		//문자
		char c = 'A'; //byte에 1저장하는거랑 여기에 a저장하는거랑 다르다고함.
		char c2 = 65; //ascii 코드로 표기해봄. 65=A
		
		//부울(boolean)  true , false
		//boolean b = false  (에러 , 위의 이름을 썼기때문에)
		boolean bool = true;
		bool = false;
		
		//문자열
		//String str = "Hello";   ( o)
		String str = new String("Hello"); //new String 객체..?
		char c3 = str.charAt(2); // 객체안에 있는 두번째 있는 값을 달라. 라는것 
		
		//상수(변경 못하는 값을 담고있는게 상수) 대문자 사용 
		final int NUMBER = 10; // 에러
		
		//number = 100; 
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(bool);
		
		System.out.println(str);
		
	}

}
