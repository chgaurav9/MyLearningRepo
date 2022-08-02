package Switch2.RestAssured;

import java.util.Arrays;
import java.util.HashMap;

public class Program123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// driver.findelements(By.tagname("a"));

//		int arr[]={1,2,3,4,7,2,1,4};
//		
//		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(m.containsKey(arr[i])) {
//				
//				m.put(arr[i], m.get(arr[i])+1);
//			}else {
//				m.put(arr[i], 1);
//			
//			}
//		}
//		
//		System.out.println(m);

		// 1 1001
		// 2 1002

//		String s="rat";
//		String s1="tar";
//		
//		char[] c1=s.toCharArray();
//		char[]c2=s1.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		
//		if(s.length()!=s1.length()) {
//			System.out.println("not anagram");
//		}else {
//			if(Arrays.equals(c1, c2)) {
//				
//				System.out.println("anagram");
//			}else {
//				System.out.println("not anagram");
//			}
//			
//		}
//		
//		
//		
//		String str="birdeye organization interview";
//		
//		
//		String [] arr=str.split(" ");
//		
//		StringBuffer sb = null;
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			String val=arr[i];
//		   sb=new StringBuffer(val);
//		
//			for(int j=0;j<val.length();j++) {
//				String temp=String.valueOf(val.charAt(val.length()-1));
//				sb.replace(val.length()-1,val.length(),String.valueOf(val.charAt(j)));
//				sb.replace(0,1,temp);
//				break;
//				
//			}
//			
//			System.out.print(sb+" ");
//		}
//		System.out.println();
//		
//		HashMap<Character,Integer> m=new HashMap<>();
//		for(int k=0;k<str.length();k++) {
//			
//			if(m.containsKey(str.charAt(k))) {
//				m.put(str.charAt(k), m.get(str.charAt(k))+1);
//			}else {
//				m.put(str.charAt(k), 1);
//			}
//		}
//		
//		System.out.println(m);
//		
//	}

		String input = "1abc2x30yz67";

		String temp = "";
		int sum = 0;

		try {

			for (int i = 0; i < input.length(); i++) {
				System.out.println(input.charAt(i));
				if (Character.isDigit(input.charAt(i))) {

					temp += String.valueOf(input.charAt(i));

				} else {

					sum += Integer.valueOf(temp);
					//System.out.println(temp);
					temp = "0";
				}

			}

			System.out.println(sum);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
