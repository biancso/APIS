package biancso.ladderapi;

public class LadderResult {
	private final LadderStartingPoint sp;
	private final int line;

	public LadderResult(LadderStartingPoint sp, int line) {
		this.sp = sp;
		this.line = line;
	}

	public String getResult() {
		return sp.equals(LadderStartingPoint.LEFT) ? line == 3 ? "EVEN" : "ODD" : line == 3 ? "ODD" : "EVEN";
	}

	public int getLine() {
		return line;
	}

	public LadderStartingPoint getStartingPoint() {
		return sp;
	}
}
