public class TestAndOr {
	public static void main(String[] args) {
		int test1 = 60;
		int test2 = 70;

		if(test1 >= 80 && test2 >=80) {
			System.out.println("よくできました！");
		}
		else if(test1 >= 80 || test2 >=80) {
			System.out.println("あと少し！");
		}
		else {
			System.out.println("もう少し頑張りましょう！");
		}
	}
}
