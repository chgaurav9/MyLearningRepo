package recurssion;

public class OO4_PrintNumberNto1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumber(5);

	}

	private static void printNumber(int i) {
		// TODO Auto-generated method stub
		
		if(i<1) {
			return;
		}
		
		System.out.println(i);
		printNumber(i-1);
	}

}
