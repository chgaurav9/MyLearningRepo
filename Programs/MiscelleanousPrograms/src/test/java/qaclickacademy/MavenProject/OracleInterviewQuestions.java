package qaclickacademy.MavenProject;

import java.util.HashMap;
import java.util.Map;

public class OracleInterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "grass is greener on the other side";
		String str = s.replaceAll(" ", "");

		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (m.containsKey(str.charAt(i))) {

				m.put(str.charAt(i), m.get(str.charAt(i)) + 1);

			} else {
				m.put(str.charAt(i), 1);

			}
		}
		System.out.println(m);

		int max = 0;

		for (Map.Entry<Character, Integer> val : m.entrySet()) {

			if (val.getValue() > max) {

				max = val.getValue();
			}
		}

		for (Map.Entry<Character, Integer> val : m.entrySet()) {

			if (val.getValue() == max) {
				System.out.println(val.getKey() + " " + val.getValue());

			}
		}

	}

}
