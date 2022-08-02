package qaclickacademy.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.helpers.XSSFRowShifter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Miscellaneous {

	
	@Test
	public void show() throws IOException {


		System.setProperty("webdriver.chrome.driver",
				"D:\\Switch2_selenium\\workspace\\MavenProject\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		// Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// ( https://www.rahulshettyacademy.com/practice-project )
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/cart");
//		driver.findElement(By.xpath("//*[text()='Apply']")).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Invalid code ..!']"))));

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
//		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Screenshot, new File("C:\\Users\\Gaurav\\Desktop\\SS.png"));
		
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.findElement(By.xpath("//*[contains(text(),'Blog')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[contains(text(),'Open Tab')]")).click();
		
		
		
		Set<String> wind = driver.getWindowHandles();
		String current=driver.getWindowHandle();
		for(String s:wind) {
			
			if(!s.equals(current))
			driver.switchTo().window(s);
		}
		
		driver.findElement(By.xpath("//*[contains(text(),'Courses')]")).click();
		
		driver.close();
		
		
		
		driver.switchTo().window(current);
		//driver.findElement(By.xpath("//*[contains(text(),'Open Tab')]")).click();
		
		
		WebElement table=driver.findElement(By.id("product"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		for(int i=1;i<row.size();i++) {
			
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<col.size();j++) {
				
				System.out.print(col.get(j).getText()+" ");
			}
			System.out.println();
		}
	}
	
	
	
	@Test(enabled = false)
	public void excel() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Gaurav\\Desktop\\deloitte.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		System.out.println(row);
		for(int i=0;i<=row;i++) {
			
			int col=sh.getRow(i).getLastCellNum();
			System.out.println(col);
			
			for(int j=0;j<col;j++) {
				
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				
			}
			
		}
		

		sh.getRow(0).createCell(2).setCellValue("dasdasd");
		
			
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Gaurav\\Desktop\\deloitte.xlsx");
		wb.write(fos);
		

		
		
	}

}
