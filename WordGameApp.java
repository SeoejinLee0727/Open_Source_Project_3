/* OpenChallenge*/

/* n명이 참가하는 골말인기 게임을 만들어보지. 처음 단이는 "아버지"이다. 
   n명의 참가지들은 순서대로 자신의 단어를 입력하면 된다.
   끝말의키에서 끝말이 틀린 경우 게임을 끝내고 게임에서 진 참가지를 화면에 출력한다. 
   이 문제의 핵심은 여러 개의 객체와 배열 사용을 연습하기 위한 것으로, 
   main()을 포함하는 WordGameApp 클래스와 각 선수를 나타내는 Player 클래스를 직성하고, 
   실행 중에는 WordGameApp 객체 하나와 선수 숫자만큼의 Player 객체를 생성하는데 있다. */

import java.util.Scanner;

class Player{
	Scanner scanner = new Scanner(System.in);
	public String name;			//게임 참가자들의 이름
	public String wordIn;
	
	
	public String Word() {
		wordIn = scanner.next();
	    return wordIn;
	}
	public boolean succeed(char lastChar) { 
		if (lastChar == wordIn.charAt(0)) return true;
        else return false;
    }
}

public class WordGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "아버지"; 
        
        System.out.print("게임에 참가하는 인원은 몇명입니까? >> ");
        int number = scanner.nextInt();
        
        Player[] play = new Player[number];
        
        for(int i=0; i<number; i++) {
            System.out.print("참가자의 이름을 입력하세요>> ");
            play[i] = new Player(); 
            play[i].name = scanner.next();
            //입력받은 이름을 Player 배열의 이름 필드에 각각 저장하는 코드
        }
        
        System.out.println("시작하는 단어는 아버지입니다.");
        
        int i = 0, j = 0;
        
        while(true) {
            j = i % number; 
            int lastIndex = word.length()-1; //마지막 문자에 대한 인덱스
            char lastChar = word.charAt(lastIndex); //마지막 문자
            
            System.out.print(play[j].name + " >> ");
            play[j].Word(); // 사용자의 단어 입력 받기
            boolean continuing = play[j].succeed(lastChar);
            if(continuing == false) {
                System.out.println(play[j].name + "이 졌습니다.");
                break;
            }
            word = play[j].wordIn;
            i++;
        }
    }
 
}

