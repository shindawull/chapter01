package chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {
//		char[] chars;
//		chars = new char[3]; 이렇게 해도 되고.. 
		char[] chars = new char[3];
		chars[0] = 'b';
		chars[1] = 'i';
		chars[2] = 't';
		//error
		//chars[3] = '!';
		
		
		System.out.println(chars);
		
	}

}
