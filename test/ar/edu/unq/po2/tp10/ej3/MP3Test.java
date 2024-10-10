package ar.edu.unq.po2.tp10.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MP3Test {
	
	private MP3 mp3;
	private Song aSong;
	private Song otherSong;

	@BeforeEach
	void setUp() throws Exception {
		mp3 = new MP3();
		aSong = mock();
		otherSong = mock();
	}

	@Test
	void reproducirCancionAlEstarSonandoOtraTest() throws Exception{
		mp3.select(aSong);
		mp3.play();
		assertThrows(AlreadyPlayingSongException.class, ()->{
			mp3.play();
		});
	}
	
	@Test
	void intenarElegirCancionAlEstarSonandoUnaTest() throws Exception{
		mp3.select(aSong);
		mp3.play();
		assertThrows(AlreadyPlayingSongException.class, ()->{
			mp3.select(otherSong);
		});
	}
	
	@Test
	void reproducirCancionSinSeleccionarUnaTest() throws Exception{
		assertThrows(UnselectedSongException.class, ()->{
			mp3.play();
		});
	}
	
	@Test
	void pausarCancionSinSeleccionarUnaTest() throws Exception{
		assertThrows(UnselectedSongException.class, ()->{
			mp3.pause();
		});
	}
	
	@Test
	void pararCancionSinSeleccionarUnaTest() throws Exception{
		assertThrows(UnselectedSongException.class, ()->{
			mp3.stop();
		});
	}
	
	@Test
	void intenarElegirCancionAlEstarPausadaUnaTest() throws Exception{
		mp3.select(aSong);
		mp3.play();
		mp3.pause();
		assertThrows(AlreadyPlayingSongException.class, ()->{
			mp3.select(otherSong);
		});
	}

}
