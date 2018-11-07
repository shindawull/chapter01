package chapter01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		int total = 0;
		int value = -1;
		
		while(true){
			System.out.println("숫자입력[0 to quit]:");
			
			Scanner scanner = new Scanner(System.in);
			value = scanner.nextInt();
			
			if(value == 0) {
				break; // value가 0일떄 탈출한다. 일부러 무한루프를 만들고 탈출조건을 해놓으면 눈에보기쉽다.  
			}
			
			total += value;
		}
	}

}
