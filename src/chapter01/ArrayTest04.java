package chapter01;

public class ArrayTest04 {

	public static void main(String[] args) {
		int[] arraysInt2 = new int[5]; 
		arraysInt2[0] = 1;
		arraysInt2[1] = 2;
		arraysInt2[2] = 3;
		arraysInt2[3] = 4;
		arraysInt2[4] = 5;

		for(int i = 0; i < arraysInt2.length; i++) {
			System.out.println( arraysInt2[i] ); 
		}
	}

}
