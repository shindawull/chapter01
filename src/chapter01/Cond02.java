package chapter01;

public class Cond02 {

	public static void main(String[] args) {

		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		//Q2: 최대값을 판별하는 조건을 완성해 보세요.
		//Sol:
		if(a1>a2) {
			//a1이 a2보다 큰 경우 
			//? a1<> a3
			if(a1>a2) {
				System.out.println("최대값은"+a1+"입니다.");
			}
			}else if(a1>a3) {
				System.out.println("최대값은 ");
			
		} else if(a2>a3) {
			//a1이 a3보다 큰 경우
			//? a2 <> a3
			System.out.println();
			
		}
	}

}
