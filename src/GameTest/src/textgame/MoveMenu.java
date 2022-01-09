package GameTest.src.textgame;

import java.util.Scanner;

public class MoveMenu {
	Scanner sc = new Scanner(System.in);

	CharacterSelect choose = new CharacterSelect();
	int choosen = choose.select();

	Tom tom = new Tom();
	Jerry jerry = new Jerry();

	public void moveMenu() {

		while (true) {

			System.out.println("\n------ 행동을 골라주세요. ------");
			System.out.println("1. 걷기 ");
			System.out.println("2. 물 마시기");
			System.out.println("3. 먹이 찾기");
			System.out.print("선택 메뉴 : ");
			int no = sc.nextInt();
			System.out.println();

			if (choosen == 1) {

				switch (no) {
				case 1:
					tom.move();
					System.out.println(tom.getInformation());
					break;
				case 2:
					tom.drink();
					tom.getInformation();
					System.out.println(tom.getInformation());
					break;
				case 3:
					tom.hp();
					tom.getInformation();
					System.out.println(tom.getInformation());
					break;
				default:
					System.out.println("번호를 잘못 입력하셨습니다.");
					break;
				}

			} else if (choosen == 2) {
				switch (no) {
				case 1:
					jerry.move();
					System.out.println(jerry.getInformation());
					break;
				case 2:
					jerry.drink();
					System.out.println(jerry.getInformation());
					break;
				case 3:
					jerry.hp();
					System.out.println(jerry.getInformation());
					break;
				default:
					System.out.println("번호를 잘못 입력하셨습니다.");
					break;
				}
			}
			
			if (tom.sumMove <= 0) {
				System.out.println("톰이 집에 도착했습니다! 게임 클리어!");
				break;
			} else if (tom.sumDrink <= 0) {
				System.out.println("\n톰이 갈증으로 인해 쓰러졌습니다. 게임 오버");
				break;
			} else if (tom.sumHp <= 0) {
				System.out.println("\n톰의 체력이 고갈나 쓰러졌습니다. 게임 오버");
				break;
			}


			
			if(jerry.sumMove<=0) {
				jerry.move();
				System.out.println("제리가 집에 도착했습니다! 게임 클리어!");
				return;
			} else if(jerry.sumDrink<=0) {
				jerry.drink();
				System.out.println("제리가 갈증으로 인해 쓰러졌습니다. 게임 오버");
				return;
			} else if(jerry.sumHp<=0) {
				jerry.hp();
				System.out.println("제리가 체력이 고갈나 쓰러졌습니다. 게임 오버");
				return;
			}

		}
		
	}
}
