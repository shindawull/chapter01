package chapter01;

public class WhileTest {

	/* 1에서 부터 10까지 숫자를 출력.*/
	//초기화
	public static void main(String[] args) {
		int x = 1;

		//진입조건 검사
		while(x <= 10) {
			System.out.println(x); //반복 cpu 장난아님~
			//증감연산
			x = x + 1;
		}
	}
	
}
