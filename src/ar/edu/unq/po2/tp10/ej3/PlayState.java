package ar.edu.unq.po2.tp10.ej3;

public class PlayState implements SongState{

	@Override
	public void play(Song song) {
		throw new AlreadyPlayingSongException("A song is already playing, please stop it first");
	}

	@Override
	public void pause(Song song) {
		song.changeState(new PauseState());
	}

	@Override
	public void stop(Song song) {
		song.changeState(new StopState());
	}

}
