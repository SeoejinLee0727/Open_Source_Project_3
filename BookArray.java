/*예제 4-7 : 객체 배열 만들기 연습*/
// 예제 4-4의 Book 클래스를 활용하여 2개짜리 Book 객체 배열을 만들고,
// 사용자로부터 책의 제목과 저자를 입력 받아 배열을 완성하라.

import java.util.Scanner;

class BookSecond{
	String title, author;
	
	public BookSecond(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		BookSecond[] book = new BookSecond[2];  // Book  배열 선언
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목 >>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new BookSecond(title, author);  // 배열 원소 객체 생성
		}
		for (int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
	
	}
}
