package recurssion;

public class OO5_PrintNumberNto1BackTracking {

	public static void main(String[] args) {
		printNumber(1);

	}

	private static void printNumber(int i) {
		
		if(i>5) {
			
			return;
		}

		printNumber(i+1);
		System.out.println(i);
	}

}
