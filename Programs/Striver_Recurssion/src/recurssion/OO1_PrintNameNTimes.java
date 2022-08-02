package recurssion;

public class OO1_PrintNameNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		name(0, 6);

	}

	public static void name(int count, int n) {

		if (count == 6) {

			return;
		}

		System.out.println("Gaurav");
		name(count + 1, n);
		
		

	}

}
