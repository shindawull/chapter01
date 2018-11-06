package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  ////ctrl shift o 하면 scanner 찾아줌. 빨간 밑줄은 뭔가를 넣어줘야 스캐너객체를 만들겠다 라는 의미. 키보드랑연결된객체 .
		
		System.out.print("입력:"); //prompt
		int number = scanner.nextInt();
		
		//반복분
		int sum = 0; //결과값
		
		int i = 1;
		while (i <= number) {
			sum = sum + i; //
			i = i + 1; 
			
		}
		System.out.println("1에서" + number + "까지의 합은" + sum + "입니다.");
		
		//결과 예 number <- 10
		//0에서 10까지 합은 55입니다.
	}

}
