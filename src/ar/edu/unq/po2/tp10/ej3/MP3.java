package ar.edu.unq.po2.tp10.ej3;

import java.util.List;
import java.util.ArrayList;

public class MP3 {

	private MP3State state = new SongSelectorState();
	private List<Song> songs = new ArrayList<Song>();
	private Song currentSong = new NullSong();

	public void play() {
		state.play(this);
	}

	public void pause() {
		state.pause(this);
	}

	public void stop() {
		state.stop(this);
	}

	public void select(Song song) {
		state.select(song, this);
	}

	public void changeState(MP3State newState) {
		state = newState;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public Song getCurrentSong() {
		return currentSong;
	}
	
	public void setCurrentSong(Song song) {
		currentSong = song;
	}
}
