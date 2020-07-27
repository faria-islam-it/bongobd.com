package bongobd.com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SqaCodeTest {

	    public static String chromedriver = "C:\\\\chromedriver.exe";
		WebDriver driver;
		JavascriptExecutor jse;
		
		//This method will invoke the browser
		public void invokebrowser() {
			
			try {
				System.setProperty("webdriver.chrome.driver",chromedriver);
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			    automateSite();
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		
		// This method will open Bioscope web site and  click the free content, load the
		// content & play the content
		public void automateSite() {
			try {
				driver.get("http://gp.bioscopelive.com/en/?utm_source=Google&utm_medium=Paid_Search&utm_campaign=Bioscope_Action_Brand_EN&utm_term=TCPA&utm_content=Brand_Bioscope_EN_ETA2&gclid=CjwKCAjw0_T4BRBlEiwAwoEiAfMbAnKsMs0o-alTE8imVi2x6s4WchDCnIHMuDKgzgIaYCXBGbi2uRoCdVYQAvD_BwE");
				System.out.println(" Welcome to Bioscope ");
				
				jse=(JavascriptExecutor)driver;
				jse.executeScript("scroll(0,1200)");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='sm-container']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[6]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//button[@type='button']")).click();
				System.out.println(" Enjoy watching Ghani ");
				
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
	
	
	
	public static void main(String[] args) {
	
		SqaCodeTest myobj = new SqaCodeTest();
	    myobj.invokebrowser();
	    
	}

}
