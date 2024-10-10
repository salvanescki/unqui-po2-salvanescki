package ar.edu.unq.po2.tp10.ej3;

public class Song {
	
	private SongState state = new StopState();
	
	public void play() {
		state.play(this);
	}

	public void pause() {
		state.pause(this);
	}

	public void stop() {
		state.stop(this);
	}

	public void changeState(SongState newState) {
		state = newState;
	}
}
