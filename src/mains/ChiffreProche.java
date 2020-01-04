package mains;

public class ChiffreProche {

	public static void main(String[] args) {
		
		int A[] = { 5, -1, 2, 3, 0 };
		int Min = A[0];
		for (int i = 0; i < A.length; i++) {
			if (Math.abs(A[i]) < Min) {
				Min = A[i];
			}
		}
		System.out.println(Min);
	}
}
