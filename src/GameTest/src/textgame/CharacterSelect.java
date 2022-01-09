package GameTest.src.textgame;

import java.util.Scanner;



public class CharacterSelect {
	Scanner sc = new Scanner(System.in);
	
	public int select() {
		
		System.out.println("\n------- 캐릭터 선택 -------");
		System.out.println("1. 톰 \n2. 제리");
		System.out.print("톰과 제리 중 캐릭터를 선택해주세요. ");
		int no = sc.nextInt();
		if(no==1) {
			System.out.println("\n'톰' 캐릭터를 선택하셨습니다.");
			System.out.println("톰의 기본 체력은 100, 기본 거리는 100, 수분 수치는 100 입니다.\n");
			//200,150,100
		} else if(no==2) {
			System.out.println("\n'제리' 캐릭터를 선택하셨습니다.");
			System.out.println("제리의 기본 체력은 80, 기본 거리는 70, 수분 수치는 100 입니다.\n");
		}
		return no;
	}
}
