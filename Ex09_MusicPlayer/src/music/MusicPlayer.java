package music;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

//	enum MAIN_MEUNU { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET };
//	enum PLAY_MEUNU { STOP, PREV, NEXT, MAIN_MENU };

//	MP3Player mp3 = new MP3Player();
//	static ArrayList<MusicVO> musicList = new ArrayList<>();

	static MP3Player mp3 = null;
	static ArrayList<MusicVO> musicList = null;
	static Scanner sc = null;
	
	final static int MAIN_PLAY = 1, MAIN_SEARCH = 2, MAIN_ADD = 3, MAIN_DELETE = 4, MAIN_END = 5;
	final static int PLAY_STOP = 1, PLAY_PREV = 2, PLAY_NEXT = 3, PLAY_MAIN = 4;
	static int iCurPlay = 0;

	public static void main(String[] args) {

		System.out.println("*** Start ***");
		mp3 = new MP3Player();
		musicList = new ArrayList<>();

		musicList.add(new MusicVO("뉴진스", "Hype boy", ".\\mp3\\뉴진스-HypeBoy.mp3"));
		musicList.add(new MusicVO("르세라핌", "Antifragile", ".\\mp3\\르세라핌-Antifragile.mp3"));
		musicList.add(new MusicVO("아이브", "LoveDive", ".\\mp3\\아이브-LoveDive.mp3"));
		musicList.add(new MusicVO("윤하", "사건의지평선", ".\\mp3\\윤하-사건의지평선.mp3"));
		musicList.add(new MusicVO("카라", "WhenIMove", ".\\mp3\\카라-WhenIMove.mp3"));

		for (int i = 0; i < musicList.size(); i++) {
			musicList.get(i).printAll();
			System.out.println();
		}

		sc = new Scanner(System.in);

		iCurPlay = 0;
		int menu = 0;
		
		while (true) {

			System.out.println("메뉴를 선택하세요.");
			System.out.printf("[1]재생 [2]검색 [3]노래추가 [4]노래삭제 [5] 종료>> ");

			menu = sc.nextInt();

			if (menu == MAIN_PLAY) {
				playSong(iCurPlay);
				runPlayMenu();
			} else if (menu == MAIN_SEARCH) {

			} else if (menu == MAIN_ADD) {

			} else if (menu == MAIN_DELETE) {

			} else if (menu == MAIN_END) {
				System.out.println("종료 되었습니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		sc.close();
		System.out.println("*** Finish ***");
	}

	public static void playSong(int index) {

		mp3.play(musicList.get(index).getPath());
		System.out.printf("id: %d => 가수 : %s - 노래제목 : %s %n",
				index, 
				musicList.get(index).getSinger(),
				musicList.get(index).getTitle());

	}

	public static void runPlayMenu() {
		
		int input = 0;
		while (true) {
			System.out.printf("[1]정지 [2]이전 곡 [3]다음 곡 [4]이전메뉴로 >> ");
			input = sc.nextInt();

			if (input == PLAY_STOP) {
				mp3.stop();
			} else if (input == PLAY_PREV) {
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				iCurPlay--;
				if (iCurPlay < 0)
					iCurPlay = (musicList.size() - 1);
				playSong(iCurPlay);

			} else if (input == PLAY_NEXT) {
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				iCurPlay++;
				if (iCurPlay > (musicList.size() - 1))
					iCurPlay = 0;
				playSong(iCurPlay);
			} else if (input == PLAY_MAIN) {
				System.out.printf("메인 메뉴로 이동합니다 %n");
				return;
			} else {
				System.out.printf("잘못 입력하셨습니다. %n");
			}
			
		}

	}

}
