import java.util.Scanner;

public class Argument {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		// int a = sc.nextInt();
		// int b = sc.nextInt();

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(a + "+" + b + "=" + (a + b));
	}
}
