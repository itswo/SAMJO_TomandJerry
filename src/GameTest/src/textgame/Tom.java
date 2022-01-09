package GameTest.src.textgame;
import java.util.Random;

public class Tom extends CharacterDTO implements Animal {
	Random r = new Random();
	public Tom() {
		super();
		//String name, int hp, int distance, int drink
	}

	CharacterDTO chDTO = new CharacterDTO("톰",200,150,100);
	int sumMove = chDTO.getDistance();
	int sumDrink = chDTO.getDrink();
	int sumHp = chDTO.getHp();
	
	@Override
	public void move() {
		int rdMove =r.nextInt(21)-20;
		System.out.println("현재 거리 : " + sumMove);
		System.out.println("거리가 " + rdMove + "만큼 이동되었습니다.\n");
		sumMove = (sumMove += rdMove);
		sumDrink -= 5;
		sumHp -= 5;

		
	}

	
	@Override
	public void drink() {
		int rdDrink = (int)((Math.random()*(10)));
		System.out.println("현재 수분 : " + sumDrink);
		System.out.println("수분이 " + rdDrink + "만큼 변경되었습니다.\n");
		sumDrink = (sumDrink += rdDrink);
		sumHp -= 5;
	}

	
	@Override
	public void hp() {
		int rdHp =(int)((Math.random()*(10)));
		System.out.println("현재 체력 : " + sumHp);
		System.out.println("체력이 " + rdHp + "만큼 변경되었습니다.\n");
		sumHp = (sumHp += rdHp);
		sumDrink -= 5;
	}

	@Override
	public String getInformation() {
		return "현재 거리 : " + sumMove
				+ "\n현재 수분 : " + sumDrink
				+ "\n현재 체력 : " + sumHp
				+ "\n";

	}

}
