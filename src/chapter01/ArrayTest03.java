package chapter01;

public class ArrayTest03 {

	public static void main(String[] args) {
		int arraysInt1[]; // arraysInt1 타입사이에있어서 비추천
		int[] arraysInt2; //추천
		//int[5] arraysInt3; // 오류
		
		arraysInt2 = new int[5]; //배열은 객체다. 객체 생성은 new 키워드로 해야한다. 
		arraysInt2[0] = 1;
		arraysInt2[1] = 2;
		arraysInt2[2] = 3;
		arraysInt2[3] = 4;
		arraysInt2[4] = 5;
		
		int[] arraysInt3 = {1,2,3,4,5}; //위와 같은거 
		int[] arraysInt4 = new int[] {1,2,3,4,5}; //갯수는 생략  비추천
		
		//error  같은라인을 써야지 17번 구분이랑 비교. 
		//int[] arrayInt5;
		//arrayInt5 = {1,2,3,4,5};
		
		Book[] books = new Book[5]; // book객체의 5개를 만든게 아니다. book 객체 참조값 5개를 저장할 공간을 만든것이다.
		
		books[0] = new Book();
		books[0].title = "이것이 자바다"; //에러없는건데 ㅜㅜ에러나네.... 
		
		
		
		
	}

}
