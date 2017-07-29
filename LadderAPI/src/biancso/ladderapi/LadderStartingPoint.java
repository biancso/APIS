package biancso.ladderapi;

import java.util.HashMap;

public enum LadderStartingPoint {
	RIGHT(0), LEFT(1);

	private static HashMap<Integer, LadderStartingPoint> hm = new HashMap<>();
	private int code;

	static {
		for (LadderStartingPoint sp : values()) {
			hm.put(sp.code, sp);
		}
	}

	private LadderStartingPoint(int n) {
		code = n;

	}

	protected static LadderStartingPoint getByCode(int code) {
		return hm.get(code);
	}
}
