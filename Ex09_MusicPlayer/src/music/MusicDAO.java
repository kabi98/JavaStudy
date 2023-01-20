package music;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicDAO {
	
	private ArrayList<MusicDTO> musicList;
	
	public ArrayList<MusicDTO> select () {
		
		musicList = new ArrayList<>();

		musicList.add(new MusicDTO("뉴진스", "Hype boy", ".\\mp3\\뉴진스-HypeBoy.mp3"));
		musicList.add(new MusicDTO("르세라핌", "Antifragile", ".\\mp3\\르세라핌-Antifragile.mp3"));
		musicList.add(new MusicDTO("아이브", "LoveDive", ".\\mp3\\아이브-LoveDive.mp3"));
		musicList.add(new MusicDTO("윤하", "사건의지평선", ".\\mp3\\윤하-사건의지평선.mp3"));
		musicList.add(new MusicDTO("카라", "WhenIMove", ".\\mp3\\카라-WhenIMove.mp3"));

		for (int i = 0; i < musicList.size(); i++) {
			musicList.get(i).printAll();
			System.out.println();
		}

		return musicList;
	};

}
