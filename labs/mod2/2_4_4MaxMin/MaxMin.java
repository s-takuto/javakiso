import java.util.Random;
import java.util.Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
		Random rand = new Random();

		for(int i = 0; i < n; i++) {
			a[i] = rand.nextInt(50);
		}

		int max = a[0];
		int min = a[0];

		for(int i = 1; i < n; i++) {
			if(max < a[i]) {
				max = a[i];
			}
			if(min > a[i]) {
				min = a[i];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
}
