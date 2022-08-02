package recurssion;

public class OO3_PrintNumber1toNBackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printNumber(3);

	}

	private static void printNumber(int i) {
		
		if(i<1) {
			return;
		}
		printNumber(i-1);
		System.out.println(i);
		
	}

}
