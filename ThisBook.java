/*예제 4-5 this()로 다른 생성자 호출*/
// 예제 4-4에서 작성한 Book 클래스의 생성자를 this()를 이용하여 수정하라.

public class ThisBook {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public ThisBook() {	//(1)
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public ThisBook(String title) {	//(2)
		this(title, "작자미상");
	}
	
	public ThisBook(String title, String author) {	//(2)
		this.title = title; // title = "춘향전"
		this.author = author; // author = "작자미상"
	}
	
	public static void main(String[] args){
		ThisBook littlePrince = new ThisBook("어린왕자", "생텍쥐페리");
		// 생성자 호출됨 (1)
		ThisBook loveStory = new ThisBook("춘향전");
		// 춘향전 작자미상 (2)
		ThisBook emptyBook = new ThisBook();
		loveStory.show();
	}

}