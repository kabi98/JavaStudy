package k_beat_05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;

import javazoom.jl.player.Player;

public class Music extends Thread{
	
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
//	private String pathAbs = "";
	
	public Music(String name, boolean isLoop) {
		
		try {
			this.isLoop = isLoop;
			
			Path relativePath = Paths.get("");
			String pathAbs = relativePath.toAbsolutePath().toString();
			
			String strPath = pathAbs + "\\src\\music\\" + name;
			System.out.println("Music Working Directory = " + strPath);
			file = new File( strPath );
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getTime() {
		if (player == null) {
			return 0;
		}
		
		return player.getPosition();
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
				
			} while (isLoop);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
