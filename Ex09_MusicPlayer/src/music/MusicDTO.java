package music;

public class MusicDTO {

	private String singer, title, path;

	public MusicDTO(String singer, String title, String path) {
		this.singer = singer;
		this.title = title;
		this.path = path;
	}

	public String getSinger() {
		return singer;
	}

	public String getPath() {
		return path;
	}

	public String getTitle() {
		return title;
	}

	public void printAll() {
		System.out.printf("%s, %s, %s ", singer, path, title);
		return;
	}

}
