public class Array {
	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "one"; str[1] = "two"; str[2] = "three";

		for(int i = 0; i < 3; i++) {
			System.out.println(str[i]);
		}
		System.out.println("配列の要素数:" + str.length);
	}
}
