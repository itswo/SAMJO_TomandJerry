package GameTest.src.textgame;

public class GameRule {
	 public static void rule() {

	        System.out.println("\n톰, 제리 중 캐릭터를 선택하실 수 있습니다. \n기본 스탯은 거리, 수분, 체력 세 가지로 구성이 되어 있습니다.");
	        System.out.println("톰, 제리는 이동할 때마다 체력과 수분이 감소합니다. 수분은 값이 낮아질 수록 갈증이 심해짐을 의미합니다.\n물을 찾으면, 체력이 감소하며 먹이를 찾았을 땐 수분이 감소합니다.");
	        System.out.println("\n1. 길거리 돌아다니기 : 거리 스탯에 -10~5 사이 랜덤값이 추가됩니다. \n"
	        		+ "2. 물 찾기 : 수분 스탯에 0~10 사이 랜덤값이 추가됩니다.\n"
	        		+ "3. 음식 찾기 : 체력 스탯에 0~10 사이 랜덤값이 추가됩니다.\n");
	        System.out.println("거리, 수분, 체력 셋 중 하나라도 10이 되면 게임이 종료되며 특정 조건을 만족할 시 어나더 엔딩이 나올 수 있습니다.");
	        
	    }
}
