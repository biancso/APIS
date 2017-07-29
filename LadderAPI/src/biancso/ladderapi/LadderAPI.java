package biancso.ladderapi;

import java.util.Random;

public class LadderAPI {

	private int getStartingPoint() { // return 0 ~ 1
		return new Random().nextInt(2);
	}

	private int getLine() {
		return new Random().nextInt(2) + 3;
	}

	public LadderResult startGame() {
		return new LadderResult(LadderStartingPoint.getByCode(getStartingPoint()), getLine());
	}
}
