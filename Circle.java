/*예제 4-1 : Circle 클래스의 객체 생성 및 활용*/
//반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라. 
//그리고 객체가 생성된 모습을 그려보라.

public class Circle {
	int radius;		//원의 반지름
	String name;	//원의 이름 필드

	public Circle(){}	//원의 생성자
	
	public double getArea() {		//원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;		
		pizza = new Circle();		//Circle 객체 생성
		
		pizza.radius = 10;		//피자 반지름 10
		pizza.name = "자바피자";		//피자 이름은 자바피자
		double area = pizza.getArea();  // 피자의 면적을 알아냄
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();		// 객체 생성 한 줄로
		donut.radius = 2;		//도넛 반지름 2
		donut.name = "자바도넛";		// 도넛 이름은 자바도넛
		area = donut.getArea();		//도넛의 면적을 알아냄
		System.out.println(donut.name + "의 면적은 " + area);
		

	}

}
