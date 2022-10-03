/*예제 4-9 : 가비지의 발생*/
// 다음 코드에서 언제 가비지가 발생하는지 설명하라.

public class GarbageEx {
	public static void main(String[] args) {
		
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		
		String d,e;
		a = null; 		// a에 널값 넣어주고
		d = c;			// c의 "Normal"을 d에
		c = null;		// c에 널값 넣기
		
	}
}

// "Good"이 비어버린다