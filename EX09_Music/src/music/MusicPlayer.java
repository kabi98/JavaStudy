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
	
	final static int PLAY_STOP = 1, PLAY_PREV = 2, PLAY_NEXT = 3,PLAY_MAIN = 4;

	public static void main(String[] args) {

		System.out.println("*** Start ***");
		mp3 = new MP3Player();
		musicList = new ArrayList<>();

		musicList.add(new MusicVO("뉴진스", "Hype boy", "c:\\mp3\\뉴진스-HypeBoy.mp3"));
		musicList.add(new MusicVO("르세라핌", "Antifragile", "c:\\mp3\\르세라핌-Antifragile.mp3"));
		musicList.add(new MusicVO("아이브", "LoveDive", "c:\\mp3\\아이브-LoveDive.mp3"));
		musicList.add(new MusicVO("윤하", "사건의지평선", "c:\\mp3\\윤하-사건의지평선.mp3"));
		musicList.add(new MusicVO("카라", "WhenIMove", "c:\\mp3\\카라-WhenIMove.mp3"));

		for (int i = 0; i < musicList.size(); i++) {
			musicList.get(i).printAll();
			System.out.println();
		}

		Scanner sc = new Scanner(System.in);

		int iCurPlay = 0;
		int menu = 0;
		int input = 0;
		while (true) {

			System.out.println("메뉴를 선택하세요.");
			System.out.printf("[1]재생 [2]검색 [3]노래추가 [4]노래삭제 [5] 종료>>");

			menu = sc.nextInt();

			if (menu == 1) {
				mp3.play(musicList.get(iCurPlay).getPath());
				System.out.printf("가수 : %s - 노래제목 : %s %n", 
						musicList.get(iCurPlay).getSinger(), musicList.get(iCurPlay).getTitle());
				
				
				while (true) {
					System.out.printf("[1]정지 [2]이전 곡 [3]다음 곡 [4]이전메뉴로 >>");
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
						
						System.out.printf("iCurPlay = %d %n", iCurPlay);
						mp3.play(musicList.get(iCurPlay).getPath());
						System.out.printf("가수 : %s - 노래제목 : %s %n", 
								musicList.get(iCurPlay).getSinger(), musicList.get(iCurPlay).getTitle());
						
					} else if (input == PLAY_NEXT) {
						if (mp3.isPlaying()) {
							mp3.stop();
						}
						iCurPlay++;
						if (iCurPlay > (musicList.size() - 1))
							iCurPlay = 0;
						System.out.printf("iCurPlay = %d %n", iCurPlay);
						mp3.play(musicList.get(iCurPlay).getPath());
						System.out.printf("가수 : %s - 노래제목 : %s %n", 
								musicList.get(iCurPlay).getSinger(), musicList.get(iCurPlay).getTitle());
					} else if (input == PLAY_MAIN) {
						System.out.printf("메인 메뉴로 이동합니다 %n");
						break;
					} else {
						System.out.printf("잘못 입력하셨습니다. %n");
					}
				}

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {
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
		System.out.printf("가수 : %s - 노래제목 : %s %n", 
							musicList.get(index).getSinger(), 
							musicList.get(index).getTitle());
		
	}
}
