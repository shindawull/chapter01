package chapter01;

public class ForTest {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i = i + 1 ) {// 초기,조건,증감   한눈에 다 보이는게 for문
			System.out.println(i);
			
		}
//		int i = 0;
//		for(;i < 10; ) {
//			System.out.println(i);
//			i = i + 1;
//		}
		
		for( int i = 0; i < 10; i++ ) {
			System.out.println(i);
		}
	}
}
