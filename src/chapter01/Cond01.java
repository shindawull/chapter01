package chapter01;

public class Cond01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 5;
		
		if(a > b) {
			c = a - b;	  //변수는 블럭안에서 실행되면 사라진다. 자기블락안에서만. 그래서 밑에 c가 에러나는거임. *****************
		} else  {//a <= b
			c = b - a;
		}
		System.out.println(c);
		System.out.println(a);
	}

}
