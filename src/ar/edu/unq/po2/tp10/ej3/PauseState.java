package ar.edu.unq.po2.tp10.ej3;

public class PauseState implements SongState {

	@Override
	public void play(Song song) {
		
	}

	@Override
	public void pause(Song song) {
		song.changeState(new PlayState());
	}

	@Override
	public void stop(Song song) {
		song.changeState(new StopState());
	}

}
