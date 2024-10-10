package ar.edu.unq.po2.tp10.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArcadeTest {
	
	private Arcade maquina;

	@BeforeEach
	void setUp() throws Exception {
		maquina = new Arcade();
	}

	@Test
	void maquinaApagadaInsertarFichaLanzaExcepciónTest() throws Exception {
		assertThrows(ArcadeOffException.class, ()->{
			maquina.insertCoin();
		});
	}
	
	@Test
	void maquinaApagadaIniciarJuegoLanzaExcepciónTest() throws Exception {
		assertThrows(ArcadeOffException.class, ()->{
			maquina.startGame();
		});
	}
	
	@Test
	void maquinaIdleIniciarJuegoLanzaExcepciónTest() throws Exception {
		maquina.pressOnOff();
		assertThrows(NoCoinsException.class, ()->{
			maquina.startGame();
		});
	}
	
	@Test
	void insertarMasDe2FichasLanzaExcepciónTest() throws Exception {
		maquina.pressOnOff();
		maquina.insertCoin();
		maquina.insertCoin();
		assertThrows(CoinsLimitException.class, ()->{
			maquina.insertCoin();
		});
	}
	
	@Test
	void insertarFichasAlEstarIniciadoElJuegoLanzaExcepciónTest() throws Exception {
		maquina.pressOnOff();
		maquina.insertCoin();
		maquina.insertCoin();
		maquina.startGame();
		assertThrows(GameStartedException.class, ()->{
			maquina.insertCoin();
		});
	}


}
