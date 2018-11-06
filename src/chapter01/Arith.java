package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		//사칙 연산
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b); //나머지연산자
		
		
		a = a + 1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		
		System.out.println(a++);
		//System.out.println(a);
		//a = a + 1; // 먼저 호출하고 나중에 증가시킨다.  라는 의미
		
		System.out.println(++a);
		//a = a + 1;
		//System.out.println();  
		
		
	}

}
