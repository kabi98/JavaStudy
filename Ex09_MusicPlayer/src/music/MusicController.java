package music;

import java.util.ArrayList;
import javazoom.jl.player.MP3Player;

public class MusicController {
	private MP3Player mp3 = new MP3Player();
	private ArrayList<MusicDTO> musicList;

	public void play(int index) {
		MusicDAO dao = new MusicDAO();
		musicList = dao.select();
		
		String strSinger = musicList.get(index).getSinger();
		String strTitle = musicList.get(index).getTitle();
		String strPath = musicList.get(index).getPath();
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
			
		mp3.play(strPath);
		
		System.out.printf("id: %2d => 가수 : %5s - 노래제목 : %s %n",
				index, strSinger, strTitle);
		
	}
	
	public void stop() {
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
	}


}
