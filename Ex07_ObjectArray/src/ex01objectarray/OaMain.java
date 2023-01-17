package ex01objectarray;


public class OaMain {

	public static void main(String[] args) {
		PocketMon [] bag = new PocketMon[3];
		
//		System.out.println(bag[0]);
		
		bag[0] = new PocketMon("피카츄", "전기", 1000, 100, "백만볼트");
		bag[1] = new PocketMon("파이리", "불", 1000, 120, "불꽃발사");
		bag[2] = new PocketMon("꼬부기", "물", 1000, 130, "물대포");

		System.out.println("=== 포켓몬 정보 출력 ===");
		
		for(int i=0; i<bag.length; i++)
		{
			bag[i].showThree();
		}
		
	}

}
