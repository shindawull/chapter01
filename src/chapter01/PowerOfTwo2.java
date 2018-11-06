package chapter01;

import java.util.Scanner;

public class PowerOfTwo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//3
		
		System.out.println("승수:");
		int power = scanner.nextInt();
		
		int result = 1;
		
		int i = 0;
		while(i < power) {
			result = result * 3;
			i = i + 1;
			}
		
		System.out.print("3의 "+ power +"승수는"+result +"입니다.");
		
		scanner.close();
		
	}

}
