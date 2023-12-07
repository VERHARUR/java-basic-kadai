package kadai_005;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		//年代を表す変数とサービス使用料金を表す変数を定義
		int userAge = 30;
		String serviceCost = "";
		
		//年齢別に条件分岐
		serviceCost = switch (userAge){
			case 10 -> "1000円です";
			case 20 -> "2000円です";
			case 30 -> "3000円です";
			case 40 -> "3000円です";
			case 50 -> "4000円です";
			case 60 -> "4000円です";
			case 70 -> "5000円です";
			default -> "500円です";
		};
		
		//結果を出力
		System.out.println(userAge + "歳の料金は" + serviceCost );
	}

}
