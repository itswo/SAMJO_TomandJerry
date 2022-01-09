package GameTest.src.textgame;

public class GameOver {

	public void endTom() {
		
	Tom tom = new Tom();

	if(tom.sumMove<=0) {
		tom.move();
		System.out.println("톰이 집에 도착했습니다! 게임 클리어!");
		return;
	} else if(tom.sumDrink<=0) {
		tom.drink();
		System.out.println("톰이 갈증으로 인해 쓰러졌습니다. 게임 오버");
		return;
	} else if(tom.sumHp<=0) {
		tom.hp();
		System.out.println("톰의 체력이 고갈나 쓰러졌습니다. 게임 오버");
		return;
	}
	System.exit(0);
	}
	
	
	
	public void endJerry() {
		
	Jerry jerry = new Jerry();	
	
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
	System.exit(0);
	}
	
	
}
