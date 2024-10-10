package ar.edu.unq.po2.tp10.ej3;

public class StopState implements SongState {

	@Override
	public void play(Song song) {
		song.changeState(new PlayState());
	}

	@Override
	public void pause(Song song) {
		
	}

	@Override
	public void stop(Song song) {
		
	}

}
