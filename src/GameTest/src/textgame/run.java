package GameTest.src.textgame;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		GameRule gamerule = new GameRule();
		
		System.out.println("톰과 제리가 집을 나왔다가 길을 잃었습니다. \n집에 찾아가기 위해 톰과 제리를 도와주세요!");
		System.out.println();

		 while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("\n===== 집 나온 톰과 제리 길 찾아가기 =====");
			System.out.println("1. 게임 설명");
			System.out.println("2. 게임 시작");
			System.out.print("메뉴를 선택해주세요. : ");
			int no = sc.nextInt();
	
			switch (no) {
			case 1:
				GameRule.rule();
				break;
			case 2:
				MoveMenu movemenu = new MoveMenu();
				movemenu.moveMenu();
				
				GameOver gameover = new GameOver();
				gameover.endJerry();
				gameover.endTom();
				break;

			default:
				System.out.println("잘못된 번호를 선택하셨습니다. ");
				break;
			}
			
		
			
		}

		 

	}
}
