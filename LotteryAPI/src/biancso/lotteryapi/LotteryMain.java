package biancso.lotteryapi;

import java.util.ArrayList;
import java.util.Scanner;

public class LotteryMain {

	public static void main(String[] args) {
		LotteryAPI api = new LotteryAPI(99, 5, 1, 2, 3);
		System.out.println(api.getLotteryNumber(1));
		System.out.println(api.getLotteryNumber(2));
		System.out.println(api.getLotteryNumber(3));
	}
}
