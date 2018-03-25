public class GreetingLoop {
	public static void main(String[] args) {
		String[] str = new String[3];

		str[0] = "おはよう";
		str[1] = "こんにちは";
		str[2] = "こんばんは";

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(str[j] + " ");
			}
			System.out.println();
		}
	}
}
