/*예제 4-8 : 인자로 배열이 전달되는 예*/
// char[] 배열을 전달받아 출력하는 printCharArray() 메소드와 
// 배열 속의 공백(' ') 문자를 ','로 대치하는 replaceSpace() 메소드를 작성하라.

public class ArrayParameterEx {
	
	static void replaceSpace(char a[]) {
		for (int i=0; i<a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';
	//문자를 ','로 대치하는 replaceSpace() 메소드
	}
	
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);  //배열 a 차례대로 프린트
		System.out.println();	// 다음 줄
	}
	
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);  // 먼저 배열 그대로 출력
		replaceSpace(c); //띄어쓰기를 콤마로 변경
		printCharArray(c);  // 다시 배열 출력하기
	} 
	
}
