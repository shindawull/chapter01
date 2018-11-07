package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		while(true) {//무한루프
			sum += num;
			if(sum > 5000) {
				System.out.println(num);
				break; //num이 언제 빠져나오는지 궁금할떄 출력해본다. 
			}
			num++; // 루프를 돌때마다 num을 증가시킨다는 표현.
		}
		System.out.println(sum);
		
//		for(;;) {
//			System.out.println("!!!!!!!");
//		}
	}

}
