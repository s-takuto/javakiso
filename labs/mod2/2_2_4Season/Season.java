public class Season {
	public static void main(String[] args) {
		int season = 5;

		switch(season) {
			case 1:
				System.out.println("春");
				break;
			case 2:
				System.out.println("夏");
				break;
			case 3:
				System.out.println("秋");
				break;
			case 4:
				System.out.println("冬");
				break;
			default:
				System.out.println("1〜4の数字を指定します。");
		}
	}
}
