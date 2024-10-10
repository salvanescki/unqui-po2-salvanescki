package ar.edu.unq.po2.tp10.ej2;

public class StartedGameState implements GameState {

	@Override
	public void insertCoin(Arcade arcade) {
		throw new GameStartedException("El juego ya ha iniciado");
	}

	@Override
	public void startGame(Arcade arcade) {
		throw new GameStartedException("El juego ya ha iniciado");
	}

	@Override
	public void pressOnOff(Arcade arcade) {
		arcade.turnOff();
	}

}
