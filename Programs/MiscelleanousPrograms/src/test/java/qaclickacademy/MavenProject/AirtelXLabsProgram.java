package qaclickacademy.MavenProject;

import java.util.HashMap;

public class AirtelXLabsProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		count("1101110110177777777777777328846623yeuwjgfhsdbncvnbzxhzgfhgsfwgu3t74678132457236rugwhjsgfasvdvashgduwtgutru23trtuwtr723647rtwugfhsvhcvasjbdjywqi7387192794798678461274823957893748968904580459y745=-u0=-560ipupokui[;l';jk'.,/m.,/.y;hlkpmot-09yh045t934987865823yeuwkjflkd,hb,.cn,lgbknlgckb                         10");
		maximum("1101110110110");

		System.out.println(fib(2));

	}

	public static int fib(int n) {

		if (n < 2) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}

	public static void count(String s) {

		try {
			HashMap<Character, Integer> m = new HashMap<Character, Integer>();

			for (int i = 0; i < s.length(); i++) {

				if (m.containsKey(s.charAt(i))) {

					m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
				} else {

					m.put(s.charAt(i), 1);
				}
			}

			System.out.println(m);

		} catch (NullPointerException e) {
			System.out.println("String should not be null, as Keys in map does not supports NULL values");
		}
	}

	public static void maximum(String s) {

		try {
			int count = 0;
			int max = 0;

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == '1') {

					count++;
				} else if (s.charAt(i) == '0') {

					max = Math.max(max, count); // 2,3
					count = 0;
				}
			}

			System.out.println(max);
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}
	/***
	 * PICKUP---
	 * 
	 * 
	 ***/

}
