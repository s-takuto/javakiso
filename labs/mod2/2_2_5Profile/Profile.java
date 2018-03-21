public class Profile {
	public static void main(String[] args) {
		String name = "Taro Yamada";
		String company = "NSSOL東京";
		int years = -5;

		System.out.println("私の名前は   " + name + " です。");
		System.out.println("勤務先は　   " + company + " です。");

		if(years >= 0 && years < 2) {
			System.out.println("私は   新入社員　です。");
		}
		else if(years >=2 && years < 6) {
			System.out.println("私は   若手社員　です。");
		}
		else if(years >= 6 && years < 15) {
			System.out.println("私は   中堅社員　です。");
		}
		else if(years >= 15) {
			System.out.println("私は   ベテラン社員　です。");
		}
		else {
			System.out.println("所属年数が間違っています。");
		}
	}
}
