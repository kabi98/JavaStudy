package ex04_pocketmon_game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iScanMonster = 0, iScanAttack = 0;

		// 이상해꽃, 풀 , 1000, 150, 덩굴채찍,
		// 피카츄, 전기 , 1000, 100, 백만볼트,

		PocketMon pmFlower = new PocketMon("이상해꽃", "풀", 1000, 150, "덩굴채찍");
		PocketMon pmPika = new PocketMon("피카츄", "전기", 1000, 100, "백만볼트");

		while (true) {
			System.out.println("======== 포켓몬 선택하기 ==========");
			System.out.print("[1]이상해꽃    [2]피카츄 >>> ");

			iScanMonster = sc.nextInt();
			// 이상해 꽃
			if (iScanMonster == 1) {
				System.out.println("=== 공격 패턴 선택 ===");
				System.out.print("[1]일반공격 [2]스킬공격 >>> ");
				iScanAttack = sc.nextInt();
				if (iScanAttack == 1) {
					// 이상해꽃이 피카츄를 일반 공격
					pmPika.setHp(pmPika.getHp() - pmFlower.getAtk());
				} else if (iScanAttack == 2) {
					// 이상해꽃이 피카츄를 스킬 공격
					pmPika.setHp((int) (pmPika.getHp() - (pmFlower.getAtk() * 1.5)));
				}

			} else if (iScanMonster == 2) {
				System.out.println("=== 공격 패턴 선택 ===");
				System.out.print("[1]일반공격 [2]스킬공격 >>> ");
				iScanAttack = sc.nextInt();
				if (iScanAttack == 1) {
					// 피카츄가 이상해꽃을 일반 공격
					pmFlower.setHp(pmFlower.getHp() - pmPika.getAtk());
				} else if (iScanAttack == 2) {
					// 이상해꽃이 피카츄를 스킬 공격
					pmFlower.setHp((int) (pmFlower.getHp() - (pmPika.getAtk() * 1.5)));
				}
			} else {
				System.out.println("포켓몬을 다시 선택하세요~~");
			}
			System.out.printf("이상해꽃HP : %d , 피카추HP : %d %n", pmFlower.getHp(), pmPika.getHp());

			if(pmPika.getHp() < 0 || pmFlower.getHp() < 0)
			{
				System.out.printf("이상해꽃HP : %d , 피카추HP : %d %n", pmFlower.getHp(), pmPika.getHp());
				break;
			}

		}
	}

}
