package tdd;

public class Game {

	int scor = 0;
	
	
	void roll(int nbQuielles) {
		scor += nbQuielles;
	}
	
	int score() {
		
		return scor ;
	}
}
