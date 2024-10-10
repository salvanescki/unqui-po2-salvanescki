package ar.edu.unq.po2.tp10.ej3;

public class SongSelectorState implements MP3State {

	@Override
	public void play(MP3 mp3) {
		mp3.getCurrentSong().play();
		mp3.changeState(new PlayingSongState());
	}

	@Override
	public void pause(MP3 mp3) {
		throw new UnselectedSongException("There's no song selected yet");

	}

	@Override
	public void stop(MP3 mp3) {
		throw new UnselectedSongException("There's no song selected yet");

	}

	@Override
	public void select(Song song, MP3 mp3) {
		mp3.setCurrentSong(song);
	}

}
