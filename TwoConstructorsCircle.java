/*예제 4-3 : 두 개의 생성자를 가진 Circle 클래스*/
// 다음 코드는 2개의 생성자를 가진 Circle 클래스이다. 실행 결과는 무엇인가?


public class TwoConstructorsCircle {
	int radius;
	String name;
	
	
	public TwoConstructorsCircle() {		
		// 매개 변수가 없는 생성자 (생성자 이름은 클래스 이름과 동일)
		radius = 1;		// radius의 초기값은 1
		name = "";
	}
	
	public TwoConstructorsCircle(int r, String n) {
		// 매개 변수를 가진 생성자
		radius = r;
		name = n;
	}
	
	public double getArea() {		// getArea() 메소드
		return 3.14 * radius * radius;
	}
	
	
	public static void main(String[] args) {
		TwoConstructorsCircle pizza = new TwoConstructorsCircle(10, "자바피자");
		// TwoConstructorsCircle 객체 생성, 반지름 10
	
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		TwoConstructorsCircle donut = new TwoConstructorsCircle();
		//TwoConstructorsCircle 객체 생성, 반지름 1;
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	
	}
}
