package ar.edu.unq.po2.tp10.ej2;

public class IdleState implements GameState {

	@Override
	public void insertCoin(Arcade arcade) {
		arcade.nextState();
	}

	@Override
	public void startGame(Arcade arcade) {
		throw new NoCoinsException("Debe introducir al menos una ficha antes de comenzar el juego");
	}

	@Override
	public void pressOnOff(Arcade arcade) {
		arcade.turnOff();
	}

}
