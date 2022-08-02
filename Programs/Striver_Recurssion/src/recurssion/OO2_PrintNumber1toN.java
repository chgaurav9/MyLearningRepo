package recurssion;

public class OO2_PrintNumber1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumber(1,5);

	}

	private static void printNumber(int i, int j) {
		// TODO Auto-generated method stub
		
		if(i>j) {
			return;
		}
		
		System.out.println(i);
		printNumber(i+1,j);
	}

}
