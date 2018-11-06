package chapter01;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);  ////ctrl shift o 하면 scanner 찾아줌. 빨간 밑줄은 뭔가를 넣어줘야 스캐너객체를 만들겠다 라는 의미. 키보드랑연결된객체 .
		
		System.out.print("승수:");
		int power = scanner.nextInt();
		
		int result = 1;
		
		int i = 0;
		while (i < power) {
			result = result * 2;
			i = i + 1;
		}
		//반복문
		
		System.out.println("2의"+power +"승은"+result+"입니다.");
	}

}
