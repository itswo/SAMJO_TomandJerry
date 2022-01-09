package GameTest.src.textgame;

public class CharacterDTO {
	 
	   private String name;
	   private int hp;
	   private int distance;
	   private int drink;

	   /* 기본 생성자 */
	   public CharacterDTO() {}
	  
	   /* 매개변수 초기화 생성자 */
	   public CharacterDTO(String name, int hp, int distance, int drink) {
		super();
		this.name = name;
		this.hp = hp;
		this.distance = distance;
		this.drink = drink;
	}
	   
	/* getters / setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDrink() {
		return drink;
	}

	public void setDrink(int drink) {
		this.drink = drink;
	}

	
	
}
