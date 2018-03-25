public class Greeting {
	public static void main(String[] args) {
		String[] str = new String[3];

		str[0] = "おはよう";
		str[1] = "こんにちは";
		str[2] = "こんばんは";

		for(int i = 0; i < 3; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}
}
