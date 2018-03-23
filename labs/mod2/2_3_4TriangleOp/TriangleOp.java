public class TriangleOp {
	public static void main(String[] args) {
		int row = 6;
		int column = 11;
		int mid = column / 2;

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(j == (mid - i)) {
					for(int k = j; k <= (mid + i); k++) {
						System.out.print("*");
					}
					j = mid + i;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
