package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		int temp = n1;
		
		//Q1: n1 값이 항상 큰값이 되도록 만드는 예제
		//    만약 n1 값이 작으면 두 값을 교체하는 문제
		if (n1 < n2 ) {
			//swap
			int Temp = n1;
			n1 = n2 ;// temp에 저장했으니 덮어도됨.
			n2 = temp;//교체.,,,,,,,, n1은 이미 덮여서 교체할수없으므로..
		}
		
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
	}

}
