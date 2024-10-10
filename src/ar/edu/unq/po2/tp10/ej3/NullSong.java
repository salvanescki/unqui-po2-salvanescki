package ar.edu.unq.po2.tp10.ej3;

public class NullSong extends Song {
	
	public void play() {
		throw new UnselectedSongException("There's no song selected yet");
	}

	public void pause() {
		throw new UnselectedSongException("There's no song selected yet");
	}

	public void stop() {
		throw new UnselectedSongException("There's no song selected yet");
	}

	public void changeState(SongState newState) {
		throw new UnselectedSongException("There's no song selected yet");
	}
}
