package qaclickacademy.MavenProject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class ProgramsTest {

	@Test(groups = {"apple"})
	public void program() {

		String s = "reverse this word";
//		char[]c=s.toCharArray();
//		
//		int left=0;
//		int right=c.length-1;
//		
//		while(left<right) {
//			
//			char temp=c[left];
//			c[left]=c[right];
//			c[right]=temp;
//			left++;
//			right--;
//		}
//		 

//		String[] s1=s.split(" ");
//		
//		System.out.println(s1.length);
//		for(int i=0;i<s1.length;i++)
//		{
//			s1[i]=String.valueOf(s1[i].charAt(0)).toUpperCase()+s1[i].substring(1);
//		}
//		
//
//		System.out.println(Arrays.toString(s1));

		String logArray[] = { "Test1", "Test2", "Test3", "Test4", "Test5" };
		String checkArray[] = { "Test1", "Test2", "Test3", "Test4", "Test5", "Test7" };

		ProgramsTest p = new ProgramsTest();

		if (logArray.length <= checkArray.length) {
			System.out.println(p.val( p.app(logArray),checkArray));
		} else {
			System.out.println(p.val(p.app(checkArray),logArray));
		}

	

		

	}

	public Set<String> app(String[] array) {
		Set<String> set = new HashSet<>();
		for (String s1 : array) {

			set.add(s1);
		}

		return set;

	}
	
	public String val(Set<String> s,String [] arr) {
		
		String output="";
		for (String s1 : arr) {
			if (s.contains(s1)) {
				continue;
			} else {
				output=s1;
			}
		}
	
		return output;

	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	
	


		@Test
		public void program1() {

			String s = "reverse this word";
			char[]c=s.toCharArray();
			
			int left=0;
			int right=c.length-1;
			
			while(left<right) {
				
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;
				right--;
			}
			 

			String[] s1=s.split(" ");
			
		
			for(int i=0;i<s1.length;i++)
			{
				s1[i]=String.valueOf(s1[i].charAt(0)).toUpperCase()+s1[i].substring(1);
			}
			
	
			System.out.println(Arrays.toString(s1));

		
		
		
		}
	}



