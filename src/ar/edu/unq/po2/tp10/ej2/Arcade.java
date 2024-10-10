package ar.edu.unq.po2.tp10.ej2;

import java.util.Arrays;
import java.util.List;

public class Arcade {
	
	private List<GameState> states = Arrays.asList(new OffState(), new IdleState(), new OnePlayerReadyState(), new TwoPlayersReadyState(), new StartedGameState());
	private GameState currentState;
	
	public Arcade() {
		currentState = states.get(0);
	}

	public void insertCoin() {
		currentState.insertCoin(this);
	}
	
	public void startGame() {
		currentState.startGame(this);
	}
	
	public void pressOnOff() {
		currentState.pressOnOff(this);
	}
	
	public void nextState() {
		currentState = states.get(states.indexOf(currentState) + 1);
	}
	
	public void turnOff() {
		currentState = states.get(0);
	}
}
