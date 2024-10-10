package ar.edu.unq.po2.tp10.ej3;

public class PlayingSongState implements MP3State {

	@Override
	public void play(MP3 mp3) {
		throw new AlreadyPlayingSongException("A song is already playing, please stop it first");		
	}

	@Override
	public void pause(MP3 mp3) {
		mp3.getCurrentSong().pause();
	}

	@Override
	public void stop(MP3 mp3) {
		mp3.getCurrentSong().stop();
		mp3.changeState(new SongSelectorState());
	}

	@Override
	public void select(Song song, MP3 mp3) {
		throw new AlreadyPlayingSongException("A song is already playing, please stop it first");
	}
	
}
