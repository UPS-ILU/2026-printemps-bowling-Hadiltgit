package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {


	Game game;
	
	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	

	@Test
	void test_aucun_quille() {
		
		game.roll(0);
		assertEquals(0,game.score());
		
		
		
		for (int i =  0 ; i < 20 ; i++) {
			game.roll(0);
		}
		assertEquals(0,game.score());
		
	
	
		
		for (int i =  0 ; i < 20 ; i++) {
			game.roll(1);
		}
		assertEquals(20,game.score());

		
		
		game.scor = 0;
		for (int i =  0 ; i < 10 ; i++) {
			game.roll(1);
		}
		for (int j =  0 ; j < 10 ; j++) {
			game.roll(2);
		}
		assertEquals(30,game.score());
	
	
	}
	
       
}
