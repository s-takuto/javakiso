public class Nest {
	public static void main(String[] args) {
		int num = 0;

		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println(num + ":偶数");
			}
			else {
				System.out.println(num + ":奇数");
			}
		}
		else {
			System.out.println(num + ":0より大きい値を設定してください。");
		}
	}
}

