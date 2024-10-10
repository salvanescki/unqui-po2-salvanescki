package ar.edu.unq.po2.tp10.ej3;

public interface MP3State {
	public void play(MP3 mp3);

	public void pause(MP3 mp3);

	public void stop(MP3 mp3);

	public void select(Song song, MP3 mp3);
}
