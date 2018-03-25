public class Total {
	public static void main(String[] args) {
		int[] test = {21, 33, 38, 50, 64, 71, 75, 79, 82, 95};

		int total = 0;
		int average = 0;

		for(int i = 0; i < 10; i++) {
			total += test[i];
		}

		System.out.println("合計点:" + total);

		average = total / 10;

		System.out.println("平均点:" + average);

		for(int i = 9; i > 4; i--) {
			System.out.println("Test(" + i + "):" + test[i]);
		}
	}
}
