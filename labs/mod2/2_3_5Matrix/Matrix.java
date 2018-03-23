public class Matrix {
	public static void main(String[] args) {
		int result = 0;

		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				result = i * j;
				if(result / 10 == 0) {
					System.out.print(" ");
				}
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}
}
