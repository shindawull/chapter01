package chapter01;

import java.util.Scanner;

public class NHelloWorld {

	public static void main(String[] args) {		//system.in 은 키보드랑 연결된. system.out은 모니터랑 연결된.
		Scanner scanner = new Scanner(System.in);  ////ctrl shift o 하면 scanner 찾아줌. 빨간 밑줄은 뭔가를 넣어줘야 스캐너객체를 만들겠다 라는 의미. 키보드랑연결된객체 .
		
		System.out.print("회수 입력:");
		int count = scanner.nextInt();
		
		int i = 0;
		while(i < count) {
			i = i + 1;
		}
		System.out.println("Hello World");
		 
		
	}

}
