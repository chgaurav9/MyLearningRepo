package qaclickacademy.MavenProject;

import java.util.HashMap;

public class RomanToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(inputString("MCMIV"));

	}

	public static int inputString(String s) {

		HashMap<Character, Integer> roman = new HashMap<Character, Integer>();

		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);

		int sum = 0;
		int n = s.length();

		try {

			for (int i = 0; i < n; i++) {

			
				if (i != n - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
					sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
					i++;
				} else {
					sum += roman.get(s.charAt(i));
				}
			}

		} catch (Exception e) {

			e.getStackTrace();
		}
		return sum;
	}

}
