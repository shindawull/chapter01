package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int total = 0;
		int value = 0;
		
		do {
			System.out.println("숫자입력[0 to quit]:");
			
			Scanner scanner = new Scanner(System.in);
			value = scanner.nextInt();
			
			total = total + value;
			
			
		}while( value != 0); // 0이 아니면 빠져나와라 
		
		System.out.println(total);
		
	}

}
