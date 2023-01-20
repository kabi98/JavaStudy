package music;

import java.util.Scanner;

public class MusicView {
	final static int MAIN_PLAY = 1, MAIN_END = 2;
	final static int PLAY_STOP = 1, PLAY_PREV = 2, PLAY_NEXT = 3, PLAY_MAIN = 4;
	static Scanner sc;
	static int iCurIndex = 0;

	public static void main(String[] args) {
		// Model : MusicDTO, MusicDAO
		// View : MusicView
		// Controller : MusicController
		
		sc = new Scanner(System.in);
		MusicController con = new MusicController();
		
		int menu = 0;
		iCurIndex = 0;
		
		System.out.printf("===== 뮤직 플레이어 ====== %n");
		while(true)
		{
			System.out.printf("[1]재생 [2] 종료 >> ");
			
			menu = sc.nextInt();

			if (menu == MAIN_PLAY) {
				con.play(iCurIndex);;
				runPlayMenu(con);
			} else if (menu == MAIN_END) {
				con.stop();
				System.out.println("종료 되었습니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		sc.close();
	}
	
	public static void runPlayMenu(MusicController con) {
		
		int input = 0;
		while (true) {
			System.out.printf("[1]정지 [2]이전 곡 [3]다음 곡 [4]이전메뉴로 >> ");
			input = sc.nextInt();

			if (input == PLAY_STOP) {
				con.stop();
			} else if (input == PLAY_PREV) {
				
				iCurIndex--;
				if (iCurIndex < 0)
					iCurIndex = 4;
				con.play(iCurIndex);

			} else if (input == PLAY_NEXT) {
				iCurIndex++;
				if (iCurIndex > 4)
					iCurIndex = 0;
				con.play(iCurIndex);
			} else if (input == PLAY_MAIN) {
				System.out.printf("메인 메뉴로 이동합니다 %n");
				return;
			} else {
				System.out.printf("잘못 입력하셨습니다. %n");
			}
			
		}

	}
	

}
