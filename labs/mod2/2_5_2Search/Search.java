public class Search {
	public static void main(String[] args) {
		int[] num = {7, 13, 28, 33, 50, 57, 69, 86, 91, 108, 111, 126, 135, 150, 158};

		int data = Integer.parseInt(args[0]);
		String result = "はずれ";

		for(int i = 0; i < 15; i++) {
			if(num[i] == data) {
				result = "当り";
				break;
			}
		}

		System.out.println("結果:" + result);
	}
}
