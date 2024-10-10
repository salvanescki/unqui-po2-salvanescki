package ar.edu.unq.po2.tp10.ej2;

public class TwoPlayersReadyState implements GameState {

	@Override
	public void insertCoin(Arcade arcade) {
		throw new CoinsLimitException("El máximo de jugadores posibles es 2");
	}

	@Override
	public void startGame(Arcade arcade) {
		arcade.nextState();
	}

	@Override
	public void pressOnOff(Arcade arcade) {
		arcade.turnOff();
	}

}
