package ar.edu.unq.po2.tp10.ej2;

public class OnePlayerReadyState implements GameState {

	@Override
	public void insertCoin(Arcade arcade) {
		arcade.nextState();
	}

	@Override
	public void startGame(Arcade arcade) {
		arcade.nextState();
		arcade.nextState();
	}

	@Override
	public void pressOnOff(Arcade arcade) {
		arcade.turnOff();
	}


}
