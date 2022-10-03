import java.util.Scanner;

/*예제 4-12 : static을 이용한 환율 계산기*/
// static 멤버를 이용하여 달러와 원화를 변환 해주는 환율 계산기를 만들어보자.

class CurrencyConverter{
	
	private static double rate;		// 한국 원화에 대한 환율
	public static double toDollar(double won) {
		return won/rate; 	//한국 원화 -> 달러로 변환
	}
	
	public static double toKWR(double dollar) {
		return dollar*rate;		// 달러 -> 한국 원화로 변환
	}
	
	public static void setRate(double r) {
		rate = r;			// 환율 설정. KWR/$1
	}
}

public class StaticMember {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate= scanner.nextDouble();
		
		CurrencyConverter.setRate(rate); 	//미국 딜라 환율 설정

		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니댜ㅏ.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		scanner.close();
		
	}
	
}
