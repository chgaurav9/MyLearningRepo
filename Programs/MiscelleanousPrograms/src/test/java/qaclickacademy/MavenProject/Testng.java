package qaclickacademy.MavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {
	
	
//	//@Parameters({"param"})
//	@Test
//	public void show1( @Optional String pr) {
//		
//		
//		//System.out.println(pr);
//	}
//	
//	@Test(groups = {"apple","ball"})
//	public void show2() {
//		
//		System.out.println("demo1");
//	}
//	
//	@Test(invocationCount = 9)
//	public void show3() {
//		
//		System.out.println("demo2");
//	}
//	
//	
//	@Test(dataProvider = "class")
//	public void show4(String uname, String pwd) {
//		
//		System.out.println(uname+" "+pwd);
//	}
//	
//	
//	@DataProvider(name = "class")
//	public  Object[][] dp() {
//		
//		Object obj [][]= new Object[1][2];
//		obj[0][0]="username";
//		obj[0][1]="password";
//	
//		return obj;
//		
//	}
	
	@Test(groups = "apple")
	public void beforeclass() throws IOException {
	
		
//		Properties p=new Properties();
//		FileInputStream fis=new FileInputStream("D:\\Switch2_selenium\\workspace\\MavenProject\\src\\test\\java\\file.properties");
//	
//	p.load(fis);
//	
//	System.out.println(p.get("browser"));
//	
//	p.setProperty("browser", "firefox");
//	System.out.println(p.get("browser"));
//	
//	FileOutputStream fos= new FileOutputStream("D:\\Switch2_selenium\\workspace\\MavenProject\\src\\test\\java\\file.properties");
//	p.store(fos, "dsadadas");
	
	
	
	int a[]= {64,5,3,4,7,89,4,2,4,6};
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;j++) {
			
			if(a[j]>a[j+1]) {
				
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
		
	}
	
	
	System.out.println(Arrays.toString(a));
	
	}
	
	

}
