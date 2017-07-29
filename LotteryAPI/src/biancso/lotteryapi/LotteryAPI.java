package biancso.lotteryapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

public class LotteryAPI {
	private HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
	private final int SECTION_LENGTH;
	private final int NUM_LIMIT;
	private final int[] RANKS;

	public LotteryAPI(int NUM_LIMIT, int SECTION_LENGTH, int... RANKS) {
		if (NUM_LIMIT < 1 || SECTION_LENGTH < 1)
			throw new IllegalArgumentException();
		this.SECTION_LENGTH = SECTION_LENGTH;
		this.NUM_LIMIT = NUM_LIMIT;
		this.RANKS = RANKS;
		init();
	}

	public void init() {
		for (int rank : RANKS) {
			ArrayList<Integer> nums = new ArrayList<>();
			for (int i = 0; i < SECTION_LENGTH; i++) {
				Random rnd = new Random();
				nums.add(rnd.nextInt(NUM_LIMIT) + 1);
			}
			hm.put(rank, nums);
		}
	}

	public HashMap<Integer, ArrayList<Integer>> getRankMap() {
		return new HashMap<>(hm);
	}

	public int getRank(int[] lotterynumber) {
		if (lotterynumber.length != SECTION_LENGTH)
			throw new IllegalArgumentException();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i : lotterynumber) {
			arr.add(i);
		}
		for (Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
			if (entry.getValue().equals(arr))
				return entry.getKey().intValue();
		}
		return -1;
	}

	public int getRank(ArrayList<Integer> arr) {
		if (arr.size() != SECTION_LENGTH)
			throw new IllegalArgumentException();
		for (Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
			if (entry.getValue().equals(arr))
				return entry.getKey().intValue();
		}
		return -1;
	}

	public ArrayList<Integer> getLotteryNumber(int i) {
		return hm.get(i);
	}
}
