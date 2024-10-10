package ar.edu.unq.po2.tp10.ej2;

public class OffState implements GameState{

	@Override
	public void insertCoin(Arcade arcade) {
		throw new ArcadeOffException("No se puede insertar fichas en una máquina apagada");
	}

	@Override
	public void startGame(Arcade arcade) {
		throw new ArcadeOffException("No se puede iniciar juego en una máquina apagada");
	}

	@Override
	public void pressOnOff(Arcade arcade) {
		arcade.nextState();
	}

}
