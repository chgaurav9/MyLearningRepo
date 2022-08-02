package Switch2.RestAssured;

public class Test_numof1 {
	
		public static void main(String[] args) {
			
			
			String s="000111100011111101111";
			int count=0;
			for(int i=0;i<s.length();i++)
			{
			if(s.charAt(i)=='1')
			{
				count=count+1;
			}
		
		}
			System.out.println(count);
			
	}

}
