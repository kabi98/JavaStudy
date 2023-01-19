package music;

import java.nio.file.Path;
import java.nio.file.Paths;

import javazoom.jl.player.MP3Player;

public class EX01MusicPlayer {

	public static void main(String[] args) {
		MP3Player mp3Temp = new MP3Player();
//		Path pathMP3 = new Paths.get("C:/mp3/아이브-LoveDive.mp3");
		String path = "C:/mp3/윤하-사건의지평선.mp3" ;
		
//		mp3Temp.play(path);
		
		path = "c:\\mp3\\아이브-LoveDive.mp3";
		mp3Temp.play(path);
		
//		mp3Temp.play("c:\\mp3\\아이브-LoveDive.mp3");
		
	}

}
